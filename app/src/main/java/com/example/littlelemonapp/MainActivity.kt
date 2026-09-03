package com.example.littlelemonapp

import android.os.Bundle
import android.widget.ImageView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.littlelemonapp.ui.theme.LittleLemonAppTheme

@Preview
@Composable
fun MainComposable() {
    Column(
        horizontalAlignment = Alignment.Start,
        verticalArrangement = Arrangement.Top,
        modifier = Modifier
            .background(color = colorResource(R.color.olive))
            .fillMaxSize()
            .padding(16.dp, 32.dp)
    ) {
        Text(
            text = stringResource(R.string.little_lemon),
            color = colorResource(R.color.lemon),
            fontSize = 32.sp,
            modifier = Modifier.padding(8.dp)
        )
        Text(
            text = stringResource(R.string.chicago), color = Color(0xFFFFFFFF),
            fontSize = 24.sp,
            modifier = Modifier.padding(8.dp)
        )
        Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Start) {
            Image(
                painterResource(R.drawable.woman),
                contentDescription = "Woman smiling",
                Modifier
                    .height(150.dp)
            )
            Text(
                stringResource(R.string.description_one),
                color = Color.White,
                fontSize = 21.sp,
                modifier = Modifier.padding(12.dp, 0.dp)
            )
        }
        Button(
            colors = ButtonDefaults.buttonColors(containerColor = colorResource(R.color.lemon)),
            onClick = {}

        ) {
            Text(text = stringResource(R.string.order))
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
                MainComposable()
                //}
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    LittleLemonAppTheme {
        Greeting("Android")
    }
}