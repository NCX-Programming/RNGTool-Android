package com.ncxprogramming.rngtool

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material.icons.filled.ArrowDropUp
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ButtonDefaults.buttonColors
import androidx.compose.material3.Card
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExposedDropdownMenuBox
import androidx.compose.material3.ExposedDropdownMenuDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Slider
import androidx.compose.material3.SliderDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextField
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.onGloballyPositioned
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.unit.toSize
import androidx.compose.ui.window.Dialog
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.ncxprogramming.rngtool.ui.theme.RNGToolTheme

@OptIn(ExperimentalMaterial3Api::class, ExperimentalLayoutApi::class)
@Composable
fun DiceMode(navController: NavHostController) {
    val scrollBehavior = TopAppBarDefaults.pinnedScrollBehavior()

    Scaffold(
        modifier = Modifier.nestedScroll(scrollBehavior.nestedScrollConnection),
        topBar = {
            TopAppBar(
                scrollBehavior = scrollBehavior,
                colors = TopAppBarDefaults.smallTopAppBarColors(),
                title = {
                    Text("Dice Mode")
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
                    IconButton(onClick = { /* TODO: FIGURE THIS OUT */ }) {
                        Icon(
                            imageVector = Icons.Filled.Menu,
                            contentDescription = "Localized description"
                        )
                    }
                },

                )

            var expanded by remember { mutableStateOf(false) }
            val suggestions = listOf("Item1", "Item2", "Item3")
            var selectedText by remember { mutableStateOf("") }

            var textfieldSize by remember { mutableStateOf(Size.Zero) }

            val icon = if (expanded)
                Icons.Filled.ArrowDropUp //it requires androidx.compose.material:material-icons-extended
            else
                Icons.Filled.ArrowDropDown

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
                var sliderPosition by remember { mutableFloatStateOf(1f) }
                var die1 by remember { mutableIntStateOf(0) }
                var die2 by remember { mutableIntStateOf(0) }
                var die3 by remember { mutableIntStateOf(0) }
                var die4 by remember { mutableIntStateOf(0) }
                var die5 by remember { mutableIntStateOf(0) }
                var die6 by remember { mutableIntStateOf(0) }
                var dieRandCap by remember { mutableIntStateOf(0) }

//                Image(
//                    painter = painterResource(id = R.drawable.baseline_casino_24),
//                    contentDescription = null,
//
//                    )
                Icon(rememberDie(), "Dice")

                Column {

                    Row(modifier = Modifier.padding(12.dp)) {
                        Button(
                            modifier = Modifier.padding(horizontal = 6.dp),
                            onClick = {
                            }) {
                            Text(sliderPosition.toString())
                        }
                        Slider(
                            modifier = Modifier.padding(horizontal = 6.dp),
                            value = sliderPosition,
                            onValueChange = { sliderPosition = it },
                            colors = SliderDefaults.colors(
                                thumbColor = MaterialTheme.colorScheme.secondary,
                                activeTrackColor = MaterialTheme.colorScheme.secondary,
                                inactiveTrackColor = MaterialTheme.colorScheme.secondaryContainer,
                            ),
                            steps = 4,
                            valueRange = 1f..6f,
                        )
                    }
                }
                Row(verticalAlignment = Alignment.CenterVertically) {
                    dieRandCap = DropDownExample()
                }
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Button(
                        modifier = Modifier.padding(horizontal = 8.dp, vertical = 8.dp),
                        onClick = {
                            println("Slider Position is: $sliderPosition")

                            die1 = (1..dieRandCap).random()
                            die2 = (1..dieRandCap).random()
                            die3 = (1..dieRandCap).random()
                            die4 = (1..dieRandCap).random()
                            die5 = (1..dieRandCap).random()
                            die6 = (1..dieRandCap).random()

                            println("$die1, $die2, $die3, $die4, $die5 $die6")

                        }) {
                        Text("Roll!")
                    }
                    Button(
                        modifier = Modifier.padding(horizontal = 8.dp, vertical = 8.dp),
                        onClick = {
                            die1 = 0
                            die2 = 0
                            die3 = 0
                            die4 = 0
                            die5 = 0
                            die6 = 0
                        }) {
                        Text("Clear!")
                    }
                }
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Button(
                        modifier = Modifier.padding(horizontal = 8.dp, vertical = 8.dp),
                        onClick = {

                        }) {

                        if (sliderPosition.toInt() == 1) {
                            Text("$die1")
                        } else if (sliderPosition.toInt() == 2) {
                            Text("$die1, $die2")
                        } else if (sliderPosition.toInt() == 3) {
                            Text("$die1, $die2, $die3")
                        } else if (sliderPosition.toInt() == 4) {
                            Text("$die1, $die2, $die3, $die4")
                        } else if (sliderPosition.toInt() == 5) {
                            Text("$die1, $die2, $die3, $die4, $die5")
                        } else if (sliderPosition.toInt() == 6) {
                            Text("$die1, $die2, $die3, $die4, $die5, $die6")
                        }
                        // Text("$die1, $die2, $die3, $die4, $die5 $die6")
                    }
                }
            }
        }
    }
}


@Composable
fun MinimalDialog() {
    val showDialog = remember { mutableStateOf(false) }

    Button(onClick = { showDialog.value = true }) {
        Text("Show Dialog")
    }

    if (showDialog.value) {
        AlertDialog(
            onDismissRequest = { showDialog.value = false },
            title = { Text("Simple Dialog") },
            text = { Text("This is a simple Jetpack Compose dialog.") },
            confirmButton = {
                Button(onClick = { showDialog.value = false }) {
                    Text("OK")
                }
            }
        )
    }
}

@Preview
@Composable
fun MinimalDialogPreview() {
    MinimalDialog()
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DropDownExample(): Int {
    val options = listOf("D4", "D6", "D8", "D10", "D12", "D20")
    var expanded by remember { mutableStateOf(false) }
    var selectedOptionText by remember { mutableStateOf(options[1]) }
    var dieRandCap = 0

    ExposedDropdownMenuBox(
        expanded = expanded,
        onExpandedChange = { expanded = !expanded },
        modifier = Modifier.padding(horizontal = 8.dp, vertical = 4.dp),
    ) {
        TextField(
            modifier = Modifier.menuAnchor(),
            readOnly = true,
            value = selectedOptionText,
            onValueChange = {},
            label = { Text("Dice Selector") },
            trailingIcon = { ExposedDropdownMenuDefaults.TrailingIcon(expanded = expanded) },
            colors = ExposedDropdownMenuDefaults.textFieldColors(),
        )
        ExposedDropdownMenu(
            expanded = expanded,
            onDismissRequest = { expanded = false },
        ) {
            options.forEach { selectionOption ->
                DropdownMenuItem(
                    text = { Text(selectionOption) },
                    onClick = {
                        selectedOptionText = selectionOption
                        expanded = false
                    },
                )
            }
        }
    }
    if (selectedOptionText == "D4") {
        dieRandCap = 4
    }
    else if (selectedOptionText == "D6") {
        dieRandCap = 6
    }
    else if (selectedOptionText == "D8") {
        dieRandCap = 8
    }
    else if (selectedOptionText == "D10") {
        dieRandCap = 10
    }
    else if (selectedOptionText == "D12") {
        dieRandCap = 12
    }
    else if (selectedOptionText == "D20") {
        dieRandCap = 20
    }
    return dieRandCap
}

@Preview(showBackground = true)
@Composable
fun DiceModePreview() {
    RNGToolTheme {
        DiceMode(rememberNavController())
    }
}