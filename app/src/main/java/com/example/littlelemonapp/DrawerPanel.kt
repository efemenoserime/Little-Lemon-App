package com.example.littlelemonapp

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ExitToApp
import androidx.compose.material3.DrawerState
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch

@Composable
fun DrawerPanel(drawerState: DrawerState, scope: CoroutineScope) {
    List(10) { Text(text = "item#$it", modifier = Modifier.padding(20.dp, 10.dp)) }
    IconButton(onClick = {
        scope.launch { drawerState.close() }
    }) {
        Icon(imageVector = Icons.Default.ExitToApp, contentDescription = "Exit to App")
    }
}

@Preview
@Composable
fun DrawerPanelPreview() {
    val drawerState = rememberDrawerState(DrawerValue.Closed)
    val scope = rememberCoroutineScope()
    DrawerPanel(drawerState, scope)
}