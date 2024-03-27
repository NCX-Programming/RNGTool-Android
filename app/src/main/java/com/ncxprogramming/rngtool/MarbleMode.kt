package com.ncxprogramming.rngtool

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material.icons.filled.ArrowDropUp
import androidx.compose.material.icons.outlined.Info
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Slider
import androidx.compose.material3.SliderDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.ncxprogramming.rngtool.ui.theme.RNGToolTheme

@OptIn(ExperimentalMaterial3Api::class, ExperimentalLayoutApi::class)
@Composable
fun MarbleMode(navController: NavHostController) {
    val scrollBehavior = TopAppBarDefaults.pinnedScrollBehavior()

    Scaffold(
        modifier = Modifier.nestedScroll(scrollBehavior.nestedScrollConnection),
        topBar = {
            TopAppBar(
                scrollBehavior = scrollBehavior,
                colors = TopAppBarDefaults.smallTopAppBarColors(),
                title = {
                    Text("Marble Mode")
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
                    MarbleAboutDialog()
                    // AboutDialog()
                },

                )

            val expanded by remember { mutableStateOf(false) }
            listOf("Item1", "Item2", "Item3")

            if (expanded)
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
                var die1 by remember { mutableStateOf("A") }
                var die2 by remember { mutableStateOf("A") }
                var die3 by remember { mutableStateOf("A") }
                var die4 by remember { mutableStateOf("A") }
                var die5 by remember { mutableStateOf("A") }
                var die6 by remember { mutableStateOf("A") }

//                Image(
//                    painter = painterResource(id = R.drawable.baseline_casino_24),
//                    contentDescription = null,
//
//                    )
                Icon(rememberDie(), "Marble")

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
                            steps = 3,
                            valueRange = 1f..5f,
                        )
                    }
                }
//                Row(verticalAlignment = Alignment.CenterVertically) {
//                    dieRandCap = MarbleDropDown()
//                }
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Button(
                        modifier = Modifier.padding(horizontal = 8.dp, vertical = 8.dp),
                        onClick = {
                            println("Slider Position is: $sliderPosition")

                            die1 = NumToLetter()
                            die2 = NumToLetter()
                            die3 = NumToLetter()
                            die4 = NumToLetter()
                            die5 = NumToLetter()
                            die6 = NumToLetter()

                            println("$die1, $die2, $die3, $die4, $die5, $die6")

                        }) {
                        Text("Roll!")
                    }
                    Button(
                        modifier = Modifier.padding(horizontal = 8.dp, vertical = 8.dp),
                        onClick = {
                            die1 = ""
                            die2 = ""
                            die3 = ""
                            die4 = ""
                            die5 = ""
                            die6 = ""
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
                            Text(die1)
                        } else if (sliderPosition.toInt() == 2) {
                            Text("$die1, $die2")
                        } else if (sliderPosition.toInt() == 3) {
                            Text("$die1, $die2, $die3")
                        } else if (sliderPosition.toInt() == 4) {
                            Text("$die1, $die2, $die3, $die4")
                        } else if (sliderPosition.toInt() == 5) {
                            Text("$die1, $die2, $die3, $die4, $die5")
                        }
                        // Text("$die1, $die2, $die3, $die4, $die5 $die6")
                    }
                }
            }
        }
    }
}

fun NumToLetter(): String {
    var marble = ""
    val letterChooser = (1..26).random()

    when (letterChooser) {
        1 -> marble = "A"
        2 -> marble = "B"
        3 -> marble = "C"
        4 -> marble = "D"
        5 -> marble = "E"
        6 -> marble = "F"
        7 -> marble = "G"
        8 -> marble = "H"
        9 -> marble = "I"
        10 -> marble = "J"
        11 -> marble = "K"
        12 -> marble = "L"
        13 -> marble = "M"
        14 -> marble = "N"
        15 -> marble = "O"
        16 -> marble = "P"
        17 -> marble = "Q"
        18 -> marble = "R"
        19 -> marble = "S"
        20 -> marble = "T"
        21 -> marble = "U"
        22 -> marble = "V"
        23 -> marble = "W"
        24 -> marble = "X"
        25 -> marble = "Y"
        26 -> marble = "Z"
    }

    return marble
}

@Composable
fun MarbleAboutDialog() {
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
            title = { Text("About Marble Mode") },
            text = { Text("Generate up to 5 random letters by pressing Roll!") },
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
fun AboutDialogMarble() {
    AboutDialog()
}

@Preview(showBackground = true)
@Composable
fun MarbleModePreview() {
    RNGToolTheme {
        MarbleMode(rememberNavController())
    }
}