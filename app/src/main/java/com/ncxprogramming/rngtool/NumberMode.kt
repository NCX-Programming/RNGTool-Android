package com.ncxprogramming.rngtool

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Info
import androidx.compose.material3.AlertDialog
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
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.ncxprogramming.rngtool.ui.theme.RNGToolTheme
import com.ncxprogramming.rngtool.ui.theme.md_theme_dark_onSecondary
import com.ncxprogramming.rngtool.ui.theme.md_theme_dark_tertiary
import com.ncxprogramming.rngtool.ui.theme.md_theme_dark_tertiaryContainer

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
                actions = {
                    NumberAboutDialog()
                }
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
                var minNumber = 0
                val minNumberInput = remember { mutableStateOf(TextFieldValue()) }
                var maxNumber = 100
                val maxNumberInput = remember { mutableStateOf(TextFieldValue()) }

                Text(
                    text = "$randomNumber",
                    fontSize = 42.sp,
                    fontWeight = FontWeight.Bold
                )
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
                    modifier = Modifier
                        .padding(horizontal = 12.dp, vertical = 12.dp)
                        .fillMaxWidth(),
                    value = minNumberInput.value,
                    onValueChange = { minNumberInput.value = it },
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
                    label = { Text("Minimum Number") },
                    singleLine = true
                )
                OutlinedTextField(
                    modifier = Modifier
                        .padding(horizontal = 12.dp)
                        .fillMaxWidth(),
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

@Composable
fun NumberAboutDialog() {
    val showDialog = remember { mutableStateOf(false) }

    IconButton(onClick = { showDialog.value = true }) {
        Icon(
            imageVector = Icons.Outlined.Info,
            contentDescription = "Localized description"
        )
    }

    if (showDialog.value) {
        AlertDialog(
            onDismissRequest = { showDialog.value = false },
            title = { Text("About Number Mode") },
            text = { Text("Enter a minimum and a maximum number and generate a random number in this classic mode.") },
            confirmButton = {
                Button(onClick = { showDialog.value = false }) {
                    Text("OK")
                }
            }
        )
    }
}

@Preview(showBackground = true)
@Composable
fun NumberModePreview() {
    RNGToolTheme {
        NumberMode(rememberNavController())
    }
}