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
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.ncxprogramming.rngtool.ui.theme.RNGToolTheme
import kotlin.math.roundToInt


@OptIn(ExperimentalMaterial3Api::class, ExperimentalLayoutApi::class)
@Composable
fun CardMode(navController: NavHostController) {
    val scrollBehavior = TopAppBarDefaults.pinnedScrollBehavior()
    val scope = rememberCoroutineScope()
    val snackbarHostState = remember { SnackbarHostState() }
    val aceValue by remember { mutableIntStateOf(0) }
    var switchValues by remember { mutableStateOf(Array<Boolean>(2) { false }) }


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
                val cardRandCap by remember { mutableIntStateOf(13) }

                FinalRandom(sliderPosition, card1, card2, card3, card4, card5, card6, card7, switchValues)

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
                    switchValues = settingsCard()
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

//                            card1 = 12
//                            card2 = 12
//                            card3 = 12
//                            card4 = 12
//                            card5 = 12
//                            card6 = 12
//                            card7 = 12

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
            }
        }
    }
}

@Composable
private fun FinalRandom(
    sliderPosition: Float,
    card1: Int,
    card2: Int,
    card3: Int,
    card4: Int,
    card5: Int,
    card6: Int,
    card7: Int,
    switchValues: Array<Boolean>
) {
    var cardStrings by remember { mutableStateOf("") }
    val cards = emptyList<Int>().toMutableList()
    val density = LocalDensity.current
    val configuration = LocalConfiguration.current
    val screenWidthPx = with(density) { configuration.screenWidthDp.dp.roundToPx() }

    cards += card1
    cards += card2
    cards += card3
    cards += card4
    cards += card5
    cards += card6
    cards += card7
    cardStrings = JavaMethods.CardString(sliderPosition.toInt(), cards, switchValues).toString()

    Text(
        text = cardStrings,
        fontSize = (screenWidthPx/36).sp,
        style = TextStyle(fontSize = 42.sp),
        fontWeight = FontWeight.Bold,
        textAlign = TextAlign.Center,
        modifier = Modifier.fillMaxWidth()
    )

}

@Composable
fun settingsCard(): Array<Boolean> {
    var aceValue by remember { mutableStateOf(false) }
    var showFace by remember { mutableStateOf(false) }
    var switchValues by remember { mutableStateOf(Array<Boolean>(2) { false }) }

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
            aceValue = aceSwitch()
            switchValues[0] = aceValue
        }
        Row(verticalAlignment = Alignment.CenterVertically) {
            Text(
                text = "Show Point Value?   ",
                modifier = Modifier
                    .padding(16.dp),
                textAlign = TextAlign.Left,
            )
            showFace = faceSwitch()
            switchValues[1] = showFace
        }
    }
    println(switchValues[0])
    println(switchValues[1])
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
fun aceSwitch(): Boolean {
    var checked by remember { mutableStateOf(false) }
    var aceValue by remember { mutableStateOf(false) }


    Switch(
        modifier = Modifier.padding(horizontal = 8.dp, vertical = 8.dp),
        checked = checked,
        onCheckedChange = {
            if (checked) {
                checked = false
            } else {
                checked = true
            }
            println("Face Switched\n[line 358] checked = $checked")

        },
    )
    if (checked) {
        aceValue = true
    } else if (!checked) {
        aceValue = false
    }
    return aceValue
}

@Composable
fun faceSwitch(): Boolean {
    var checked by remember { mutableStateOf(false) }
    var faceValue by remember { mutableStateOf(false) }

    Switch(
        modifier = Modifier.padding(horizontal = 8.dp, vertical = 8.dp),
        checked = checked,
        onCheckedChange = {
            if (checked) {
                checked = false
            } else {
                checked = true
            }
            println("Ace Switched\n[line 384] checked = $checked")
        },
    )
    if (checked) {
        faceValue = true
    } else if (!checked) {
        faceValue = false
    }
    return faceValue
}

@Preview(showBackground = true)
@Composable
fun CardModePreview() {
    RNGToolTheme {
        CardMode(rememberNavController())
    }
}