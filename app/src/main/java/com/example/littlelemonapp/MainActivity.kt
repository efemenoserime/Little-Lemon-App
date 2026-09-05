package com.example.littlelemonapp

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.littlelemonapp.ui.theme.LittleLemonAppTheme

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Preview
@Composable
fun HomeScreen() {
    Scaffold(topBar = { TopBar() }) {
        val context = LocalContext.current
        Column(
        ) {
            UpperPanel()
            LowerPanel()
        }
    }
}

@Composable
fun AppScreen() {
    var count by rememberSaveable {
        mutableIntStateOf(0)
    }
    MenuItem(count, { count++ }, { count-- })
}

@Preview
@Composable
fun MenuItemPreview() {
    var count by rememberSaveable {
        mutableIntStateOf(0)
    }
    MenuItem(count, onDecrement = { count-- }, onIncrement = { count++ })
}

@Composable
fun MenuItem(count: Int, onIncrement: () -> Unit, onDecrement: () -> Unit) {
    Column(
        Modifier
            .background(Color(0xFFEFEDEE))
            .padding(12.dp)
            .fillMaxWidth(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {

        Text("Greek Salad", fontSize = 20.sp, fontWeight = FontWeight.Bold)
        Row(
            Modifier
                .fillMaxWidth(), horizontalArrangement = Arrangement.Center
        ) {
            IconButton(onClick = onDecrement) {
                Icon(painterResource(R.drawable.minus), contentDescription = "Minus")
            }
            Text(
                text = "$count",
                modifier = Modifier.padding(12.dp),
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF3E3E33)
            )
            IconButton(onClick = onIncrement) {
                Icon(painterResource(R.drawable.plus), contentDescription = "Plus")
            }
        }

        Button(modifier = Modifier.fillMaxWidth(), onClick = {}) {
            Text("Add", Modifier.padding(0.dp, 26.dp))
        }
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

               // AppScreen()
            }
        }
    }
}