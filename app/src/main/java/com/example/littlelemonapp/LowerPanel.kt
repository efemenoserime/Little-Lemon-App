package com.example.littlelemonapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun LowerPanel() {
    Column {
        WeeklySpecial()
        MenuDish()
    }
}


@Composable
fun WeeklySpecial() {
    // to be defined
    Card(Modifier.fillMaxWidth()) {
        Text(
            "Weekly Special",
            Modifier.padding(8.dp),
            fontSize = 26.sp,
            fontWeight = FontWeight.Bold
        )
    }
}


@Composable
fun MenuDish() {
    // to be defined
    Card(Modifier.fillMaxWidth()) {
        Row(
            Modifier
                .fillMaxWidth()
                .padding(8.dp)
        ) {
            Column {
                Text("Greek Salad", fontSize = 18.sp, fontWeight = FontWeight.Bold)
                Text(
                    "The famous Greek salad of crispy lettuce, peppers, olives, our Chicago ...",
                    Modifier
                        .fillMaxWidth(.75f)
                        .padding(0.dp, 5.dp),
                    color = Color.Gray,

                    )
                Text("$12.99", color = Color.Gray, fontWeight = FontWeight.Bold)
            }
            Image(painterResource(R.drawable.greeksalad), "Green Salad Image")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun LowerPanelPreview() {
    LowerPanel()
}

