package com.example.littlelemonapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import com.example.littlelemonapp.ui.theme.LittleLemonAppTheme

@Preview
@Composable
fun HomeScreen() {
    val context = LocalContext.current
    Column(
    ) {
        UpperPanel()
        LowerPanel()
    }
}

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LittleLemonAppTheme {
                //Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                HomeScreen()
                //}
            }
        }
    }
}