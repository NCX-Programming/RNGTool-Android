package com.ncxprogramming.rngtool

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun NumberMode(navController: NavHostController) {
    val scrollBehavior = TopAppBarDefaults.pinnedScrollBehavior()

    Scaffold(
        modifier = Modifier.nestedScroll(scrollBehavior.nestedScrollConnection),
        topBar = {
            TopAppBar(
                scrollBehavior = scrollBehavior,
                colors = TopAppBarDefaults.smallTopAppBarColors(),
                title = {
                    Text("Number Mode")
                },
                navigationIcon = {
                    IconButton(onClick = { navController.navigateUp() }) {
                        Icon(
                            imageVector = rememberArrowBack(),
                            contentDescription = "Localized description"
                        )
                    }
                },
            )
        }
    ) { contentPadding ->
        Column(
            modifier = Modifier
                .padding(contentPadding)
        ) {
            Column(
                modifier = Modifier.fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                var randomNumber by remember { mutableIntStateOf(0) }
                var minNumber: Int
                val minNumberInput = remember { mutableStateOf(TextFieldValue()) }
                var maxNumber: Int
                val maxNumberInput = remember { mutableStateOf(TextFieldValue()) }

                Text("$randomNumber", fontSize = 42.sp)
                Button(
                    modifier = Modifier.padding(vertical = 12.dp),
                    onClick = {
                        try {
                            minNumber = minNumberInput.value.text.toInt()
                        } catch (nfe: NumberFormatException) {
                            minNumber = 0
                            minNumberInput.value = TextFieldValue("0")
                        }

                        try {
                            maxNumber = maxNumberInput.value.text.toInt()
                        } catch (nfe: NumberFormatException) {
                            maxNumber = 100
                            maxNumberInput.value = TextFieldValue("100")
                        }

                        if (maxNumber <= minNumber) {
                            maxNumber = minNumber + 1
                            maxNumberInput.value = TextFieldValue("${minNumber + 1}")
                        }
                        randomNumber = (minNumber..maxNumber).random()
                    }) {
                    Text("Generate")
                }
                OutlinedTextField(
                    modifier = Modifier.padding(horizontal = 12.dp, vertical = 12.dp).fillMaxWidth(),
                    value = minNumberInput.value,
                    onValueChange = { minNumberInput.value = it },
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
                    label = { Text("Minimum Number") },
                    singleLine = true
                )
                OutlinedTextField(
                    modifier = Modifier.padding(horizontal = 12.dp).fillMaxWidth(),
                    value = maxNumberInput.value,
                    onValueChange = { maxNumberInput.value = it },
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
                    label = { Text("Maximum Number") },
                    singleLine = true
                )
            }
        }
    }

}