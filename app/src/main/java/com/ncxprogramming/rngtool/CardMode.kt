package com.ncxprogramming.rngtool

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Info
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Slider
import androidx.compose.material3.SliderDefaults
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
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
import kotlin.math.round
import kotlin.math.roundToInt

@OptIn(ExperimentalMaterial3Api::class, ExperimentalLayoutApi::class)
@Composable
fun CardMode(navController: NavHostController) {
    val scrollBehavior = TopAppBarDefaults.pinnedScrollBehavior()
    rememberCoroutineScope()
    val snackbarHostState = remember { SnackbarHostState() }
    val aceValue by remember { mutableIntStateOf(0) }
    var switchValues by rememberSaveable(Unit) { mutableStateOf(arrayOf<Int>(0, 0)) }


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
                    // AboutDialog()
                }
            )
        },
        snackbarHost = {
            SnackbarHost(hostState = snackbarHostState)
        },
//        floatingActionButton = {
//            ExtendedFloatingActionButton(
//                text = { Text("Show snackbar") },
//                icon = { Icon(Icons.Filled.Image, contentDescription = "") },
//                onClick = {
//                    scope.launch {
//                        aceValue = switchValues[0]
//
//                        if (aceValue == 1) {
//                            snackbarHostState.showSnackbar("Aces are now equal to 11!")
//                        } else if (aceValue == 0) {
//                            snackbarHostState.showSnackbar("Aces are now equal to 1!")
//                        } else {
//                            snackbarHostState.showSnackbar("Ace Value currently unknown!")
//                        }
//                    }
//                }
//            )
//        }

    ) { contentPadding ->
        Column(
            modifier = Modifier
                .padding(contentPadding)
        ) {
            Column(
                modifier = Modifier.fillMaxWidth(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                val cards by remember { mutableStateOf(arrayOf<Int>(0, 0, 0, 0, 0, 0, 0)) }
                var sliderPosition by remember { mutableFloatStateOf(1f) }
                remember { mutableStateOf(cards.contentToString()) }

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
                    Button(
                        modifier = Modifier.padding(horizontal = 8.dp, vertical = 8.dp),
                        onClick = {

                        }) {

                        if (sliderPosition.toInt() == 1) {
                            Text("$cards[0]")
                        } else if (sliderPosition.toInt() == 2) {
                            Text("$cards[0], $cards[1]")
                        } else if (sliderPosition.toInt() == 3) {
                            Text("$cards[0], $cards[1], $cards[2]")
                        } else if (sliderPosition.toInt() == 4) {
                            Text("$cards[0], $cards[1], $cards[2], $cards[3]")
                        } else if (round(sliderPosition).toInt() == 5) {
                            Text("$cards[0], $cards[1], $cards[2], $cards[3], $cards[4]")
                        } else if (round(sliderPosition).toInt() == 6) {
                            Text("$cards[0], $cards[1], $cards[2], $cards[3], $cards[4], $cards[5]")
                        } else if (sliderPosition.toInt() == 7) {
                            Text(cards.contentToString())
                        }
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
                            var index = 0
                            while (index < cards.size) {
                                cards[index] = (1..13).random()
                                println(index)
                                index++
                            }

                            println(cards.contentToString())
                        

                        }) {
                        Text("Deal!")
                    }
                    Button(
                        modifier = Modifier.padding(horizontal = 8.dp, vertical = 8.dp),
                        onClick = {
                            for (card in cards) {
                                cards[card] = 0
                            }

                            println("aceValue: $aceValue")
                            println("switchValues: $switchValues")
//                            println("aceValue: $aceValue")
//                            println("aceValue: $aceValue")
//                            println("aceValue: $aceValue")
                        }) {
                        Text("Clear!")
                    }
                }
            }
        }
    }
}

//fun CardString(cards): () -> Unit {
//    var cards = {}
//
//
//    return cards
//}

@Composable
fun FilledCardExample(): Array<Int> {
    var aceValue by remember { mutableIntStateOf(0)}
    var showFace by remember { mutableIntStateOf(0)}
    val switchValues = arrayOf(0, 0)

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
            switchValues[0] = aceValue
        }
        Row(verticalAlignment = Alignment.CenterVertically) {
            Text(
                text = "Show Face Cards?   ",
                modifier = Modifier
                    .padding(16.dp),
                textAlign = TextAlign.Left,
            )
            showFace = FaceSwitch()
            switchValues[1] = showFace
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

@Preview(showBackground = true)
@Composable
fun CardModePreview() {
    RNGToolTheme {
        CardMode(rememberNavController())
    }
}