package com.ncxprogramming.rngtool

import androidx.compose.animation.core.tween
import androidx.compose.animation.slideInHorizontally
import androidx.compose.animation.slideOutHorizontally
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.AlertDialog
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.input.nestedscroll.nestedScroll
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.ncxprogramming.rngtool.ui.theme.RNGToolTheme

@Composable
fun RNGToolNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    startDestination: String = "MainMenu"
) {
    NavHost(
        modifier = modifier,
        navController = navController,
        startDestination = startDestination,
    ) {
        composable(
            "MainMenu",

        ) {
            MainMenu(
                onNavigateToNumberMode = {
                    navController.navigate("NumberMode")
                },
                onNavigateToDiceMode = {
                    navController.navigate("DiceMode")
                },
                onNavigateToCardMode = {
                    navController.navigate("CardMode")
                },
                onNavigateToMarbleMode = {
                    navController.navigate("MarbleMode")
                }
            )
        }
        composable(
            "NumberMode",
            enterTransition = {
                when (initialState.destination.route) {
                    "MainMenu" ->
                        slideInHorizontally(animationSpec = tween(300)) {
                                fullWidth -> fullWidth / 1
                        }
                    else -> null
                }
            },
            exitTransition = {
                when (targetState.destination.route) {
                    "MainMenu" ->
                        slideOutHorizontally(animationSpec = tween(300)) {
                                fullWidth -> fullWidth / 1
                        }
                    else -> null
                }
            }
        ) { NumberMode(navController = navController)
        }
        composable(
            "DiceMode",
            enterTransition = {
                when (initialState.destination.route) {
                    "MainMenu" ->
                        slideInHorizontally(animationSpec = tween(300)) {
                                fullWidth -> fullWidth / 1
                        }
                    else -> null
                }
            },
            exitTransition = {
                when (targetState.destination.route) {
                    "MainMenu" ->
                        slideOutHorizontally(animationSpec = tween(300)) {
                                fullWidth -> fullWidth / 1
                        }
                    else -> null
                }
            }

        ) { DiceMode(navController = navController)
        }
        composable(
            "CardMode",
            enterTransition = {
                when (initialState.destination.route) {
                    "MainMenu" ->
                        slideInHorizontally(animationSpec = tween(300)) {
                                fullWidth -> fullWidth / 1
                        }
                    else -> null
                }
            },
            exitTransition = {
                when (targetState.destination.route) {
                    "MainMenu" ->
                        slideOutHorizontally(animationSpec = tween(300)) {
                                fullWidth -> fullWidth / 1
                        }
                    else -> null
                }
            }

        ) { CardMode(navController = navController)
        }
        composable(
            "MarbleMode",
            enterTransition = {
                when (initialState.destination.route) {
                    "MainMenu" ->
                        slideInHorizontally(animationSpec = tween(300)) {
                                fullWidth -> fullWidth / 1
                        }
                    else -> null
                }
            },
            exitTransition = {
                when (targetState.destination.route) {
                    "MainMenu" ->
                        slideOutHorizontally(animationSpec = tween(300)) {
                                fullWidth -> fullWidth / 1
                        }
                    else -> null
                }
            }

        ) { MarbleMode(navController = navController)
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainMenu(
    onNavigateToNumberMode: () -> Unit,
    onNavigateToDiceMode: () -> Unit,
    onNavigateToCardMode: () -> Unit,
    onNavigateToMarbleMode: () -> Unit,
    ) {
    val scrollBehavior = TopAppBarDefaults.pinnedScrollBehavior()

    Scaffold(
        modifier = Modifier.nestedScroll(scrollBehavior.nestedScrollConnection),
        topBar = {
            TopAppBar(
                scrollBehavior = scrollBehavior,
                colors = TopAppBarDefaults.smallTopAppBarColors(),
                title = {
                    Text("RNGTool")
                },
                actions = {
                    AboutDialog()
                },)
        }
    ) { contentPadding ->
        Column(
            modifier = Modifier
                .padding(contentPadding)
        ) {
            Column {
                Button(onClick = onNavigateToNumberMode,
                    modifier = Modifier
                        .padding(all = 8.dp)
                        .fillMaxWidth(),
                    border = BorderStroke(1.dp, MaterialTheme.colorScheme.outline),
                    shape = RoundedCornerShape(10.dp),
                    colors = ButtonDefaults.buttonColors(contentColor = MaterialTheme.colorScheme.primary, containerColor = MaterialTheme.colorScheme.surfaceVariant),
                ) {
                    Row(modifier = Modifier.padding(all = 4.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Icon(rememberTag(), "Tag")
                        Text("Number Mode", fontSize = 18.sp, modifier = Modifier.padding(horizontal = 8.dp))
                    }
                    Spacer(modifier = Modifier.weight(1f))
                }
                Button(onClick = onNavigateToDiceMode,
                    modifier = Modifier
                        .padding(all = 8.dp)
                        .fillMaxWidth(),
                    border = BorderStroke(1.dp, MaterialTheme.colorScheme.outline),
                    shape = RoundedCornerShape(10.dp),
                    colors = ButtonDefaults.buttonColors(contentColor = MaterialTheme.colorScheme.primary, containerColor = MaterialTheme.colorScheme.surfaceVariant),
                ) {
                    Row(modifier = Modifier.padding(all = 4.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Icon(rememberCasino(), "Dice")
                        Text("Dice Mode", fontSize = 18.sp, modifier = Modifier.padding(horizontal = 8.dp)
                        )
                    }
                    Spacer(modifier = Modifier.weight(1f))
                }
                Button(onClick = onNavigateToCardMode,
                    modifier = Modifier
                        .padding(all = 8.dp)
                        .fillMaxWidth(),
                    border = BorderStroke(1.dp, MaterialTheme.colorScheme.outline),
                    shape = RoundedCornerShape(10.dp),
                    colors = ButtonDefaults.buttonColors(contentColor = MaterialTheme.colorScheme.primary, containerColor = MaterialTheme.colorScheme.surfaceVariant),
                ) {
                    Row(modifier = Modifier.padding(all = 4.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Icon(rememberLooksOne(), "Cards")
                        Text("Card Mode", fontSize = 18.sp, modifier = Modifier.padding(horizontal = 8.dp)
                        )
                    }
                    Spacer(modifier = Modifier.weight(1f))
                }
                Button(onClick = onNavigateToMarbleMode,
                    modifier = Modifier
                        .padding(all = 8.dp)
                        .fillMaxWidth(),
                    border = BorderStroke(1.dp, MaterialTheme.colorScheme.outline),
                    shape = RoundedCornerShape(10.dp),
                    colors = ButtonDefaults.buttonColors(contentColor = MaterialTheme.colorScheme.primary, containerColor = MaterialTheme.colorScheme.surfaceVariant),
                ) {
                    Row(modifier = Modifier.padding(all = 4.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Icon(rememberCircle(), "Circle")
                        Text("Marble Mode", fontSize = 18.sp, modifier = Modifier.padding(horizontal = 8.dp)
                        )
                    }
                    Spacer(modifier = Modifier.weight(1f))
                }
            }
        }
    }
}

@Composable
fun AboutDialog() {
    val showDialog = remember { mutableStateOf(false) }

    IconButton(onClick = { showDialog.value = true }) {
        Icon(
            imageVector = Icons.Filled.Menu,
            contentDescription = "Localized description"
        )
    }

    if (showDialog.value) {
        AlertDialog(
            onDismissRequest = { showDialog.value = false },
            title = { Text("About RNGTool Android") },
            text = { Text("An Android app that generates random numbers." +
                    "\n\nVersion 1.0\nSDK Version 34" +
                    "\nNCX Programming" ) },
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
fun GreetingPreview2() {
    RNGToolTheme {
        RNGToolNavHost()
    }
}