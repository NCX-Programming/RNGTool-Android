package com.ncxprogramming.rngtool

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Image
import androidx.compose.material.icons.outlined.Info
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ExposedDropdownMenuBox
import androidx.compose.material3.ExposedDropdownMenuDefaults
import androidx.compose.material3.ExtendedFloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Slider
import androidx.compose.material3.SliderDefaults
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.Switch
import androidx.compose.material3.SwitchDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.ncxprogramming.rngtool.ui.theme.RNGToolTheme
import kotlinx.coroutines.launch
import kotlin.math.round
import kotlin.math.roundToInt

@OptIn(ExperimentalMaterial3Api::class, ExperimentalLayoutApi::class)
@Composable
fun CardMode(navController: NavHostController) {
    val scrollBehavior = TopAppBarDefaults.pinnedScrollBehavior()
    val scope = rememberCoroutineScope()
    val snackbarHostState = remember { SnackbarHostState() }
    var aceValue by remember { mutableIntStateOf(0) }
    var switchValues by rememberSaveable(Unit) { mutableStateOf(listOf<Int>(0, 0)) }


    Scaffold(
        modifier = Modifier.nestedScroll(scrollBehavior.nestedScrollConnection),
        topBar = {
            TopAppBar(
                scrollBehavior = scrollBehavior,
                colors = TopAppBarDefaults.smallTopAppBarColors(),
                title = {
                    Text("Card Mode")
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
                    CardAboutDialog()
                    AboutDialog()
                }
            )
        },
        snackbarHost = {
            SnackbarHost(hostState = snackbarHostState)
        },
        floatingActionButton = {
            ExtendedFloatingActionButton(
                text = { Text("Show snackbar") },
                icon = { Icon(Icons.Filled.Image, contentDescription = "") },
                onClick = {
                    scope.launch {
                        aceValue = switchValues[0]

                        if (aceValue == 1) {
                            snackbarHostState.showSnackbar("Aces are now equal to 11!")
                        } else if (aceValue == 0) {
                            snackbarHostState.showSnackbar("Aces are now equal to 1!")
                        } else {
                            snackbarHostState.showSnackbar("Ace Value currently unknown!")
                        }
                    }
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
                var sliderPosition by remember { mutableFloatStateOf(1f) }
                var card1 by remember { mutableIntStateOf(0) }
                var card2 by remember { mutableIntStateOf(0) }
                var card3 by remember { mutableIntStateOf(0) }
                var card4 by remember { mutableIntStateOf(0) }
                var card5 by remember { mutableIntStateOf(0) }
                var card6 by remember { mutableIntStateOf(0) }
                var card7 by remember { mutableIntStateOf(0) }
                var cardRandCap by remember { mutableIntStateOf(13) }

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
                            onValueChange = { sliderPosition = it.roundToInt().toFloat() },
                            colors = SliderDefaults.colors(
                                thumbColor = MaterialTheme.colorScheme.secondary,
                                activeTrackColor = MaterialTheme.colorScheme.secondary,
                                inactiveTrackColor = MaterialTheme.colorScheme.secondaryContainer,
                            ),
                            steps = 5,
                            valueRange = 1f..7f,
                        )
                    }
                }
                Row(verticalAlignment = Alignment.CenterVertically) {
                    switchValues = FilledCardExample()
                }
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Button(
                        modifier = Modifier.padding(horizontal = 8.dp, vertical = 8.dp),
                        onClick = {
                            println("Slider Position is: $sliderPosition")

                            card1 = (1..cardRandCap).random()
                            card2 = (1..cardRandCap).random()
                            card3 = (1..cardRandCap).random()
                            card4 = (1..cardRandCap).random()
                            card5 = (1..cardRandCap).random()
                            card6 = (1..cardRandCap).random()
                            card7 = (1..cardRandCap).random()

                            println("$card1, $card2, $card3, $card4, $card5, $card6, $card7")

                        }) {
                        Text("Deal!")
                    }
                    Button(
                        modifier = Modifier.padding(horizontal = 8.dp, vertical = 8.dp),
                        onClick = {
                            card1 = 0
                            card2 = 0
                            card3 = 0
                            card4 = 0
                            card5 = 0
                            card6 = 0
                            card7 = 0

                            println("aceValue: $aceValue")
                            println("switchValues: $switchValues")
//                            println("aceValue: $aceValue")
//                            println("aceValue: $aceValue")
//                            println("aceValue: $aceValue")
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
                            Text("$card1")
                        } else if (sliderPosition.toInt() == 2) {
                            Text("$card1, $card2")
                        } else if (sliderPosition.toInt() == 3) {
                            Text("$card1, $card2, $card3")
                        } else if (sliderPosition.toInt() == 4) {
                            Text("$card1, $card2, $card3, $card4")
                        } else if (round(sliderPosition).toInt() == 5) {
                            Text("$card1, $card2, $card3, $card4, $card5")
                        } else if (round(sliderPosition).toInt() == 6) {
                            Text("$card1, $card2, $card3, $card4, $card5, $card6")
                        } else if (sliderPosition.toInt() == 7) {
                            Text("$card1, $card2, $card3, $card4, $card5, $card6, $card7")
                        }
                    }
                }
            }
        }
    }
}

@Composable
fun FilledCardExample(): List<Int> {
    var aceValue by remember { mutableIntStateOf(0)}
    var showFace by remember { mutableIntStateOf(0)}
    var switchValues by rememberSaveable(Unit) { mutableStateOf(listOf<Int>(0, 0)) }

    Card(
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.surfaceVariant,
        ),
        modifier = Modifier
            .size(width = 270.dp, height = 130.dp)
    ) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Text(
                text = "Set Ace value to 11?",
                modifier = Modifier
                    .padding(16.dp),
                textAlign = TextAlign.Left,
            )
            aceValue = AceSwitch()
            switchValues[0].apply { aceValue }
        }
        Row(verticalAlignment = Alignment.CenterVertically) {
            Text(
                text = "Show Face Cards?   ",
                modifier = Modifier
                    .padding(16.dp),
                textAlign = TextAlign.Left,
            )
            showFace = FaceSwitch()
        }
    }
    return switchValues
}

@Composable
fun CardAboutDialog() {
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
            title = { Text("About Card Mode") },
            text = { Text("Change the slider to change how many cards you're drawing!" +
                    "\nPress the 'Deal!' button to draw new cards, and press 'Clear!' to clear them!" +
                    "") },
            confirmButton = {
                Button(onClick = { showDialog.value = false }) {
                    Text("OK")
                }
            }
        )
    }
}



@Composable
fun AceSwitch(): Int {
    var checked by remember { mutableStateOf(false) }
    var aceValue by remember { mutableIntStateOf(0)}

    Switch(
        modifier = Modifier.padding(horizontal = 8.dp, vertical = 8.dp),
        checked = checked,
        onCheckedChange = {
            checked = it
        },
    )
    if (checked) {
        aceValue = 1
    } else if (!checked) {
        aceValue = 0
    }
    return aceValue
}

@Composable
fun FaceSwitch(): Int {
    var checked by remember { mutableStateOf(false) }
    var faceValue by remember { mutableIntStateOf(0)}

    Switch(
        modifier = Modifier.padding(horizontal = 8.dp, vertical = 8.dp),
        checked = checked,
        onCheckedChange = {
            checked = it
        },
    )
    if (checked) {
        faceValue = 1
    } else if (!checked) {
        faceValue = 0
    }
    return faceValue
}


@Preview
@Composable
fun AceSwitchPreview() {
    AceSwitch()
}

@Preview
@Composable
fun MinimalDialogPreviewCard() {
    CardAboutDialog()
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun dropDownExample(): Int {
    val options = listOf("D4", "D6", "D8", "D10", "D12", "D20")
    var expanded by remember { mutableStateOf(false) }
    var selectedOptionText by remember { mutableStateOf(options[1]) }
    var cardRandCap = 0

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
        cardRandCap = 4
    } else if (selectedOptionText == "D6") {
        cardRandCap = 6
    } else if (selectedOptionText == "D8") {
        cardRandCap = 8
    } else if (selectedOptionText == "D10") {
        cardRandCap = 10
    } else if (selectedOptionText == "D12") {
        cardRandCap = 12
    } else if (selectedOptionText == "D20") {
        cardRandCap = 20
    }
    return cardRandCap
}

@Preview(showBackground = true)
@Composable
fun CardModePreview() {
    RNGToolTheme {
        CardMode(rememberNavController())
    }
}