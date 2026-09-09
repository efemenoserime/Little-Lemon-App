package com.example.littlelemonapp

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

@Composable
fun UpperPanel(navController: NavHostController) {
    val context = LocalContext.current
    Column(
        horizontalAlignment = Alignment.Start,
        verticalArrangement = Arrangement.Top,
        modifier = Modifier
            .background(color = colorResource(R.color.olive))
            .padding(12.dp, 16.dp)
            .fillMaxWidth()
    ) {
        Text(
            text = stringResource(R.string.little_lemon),
            color = colorResource(R.color.lemon),
            fontSize = 40.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(8.dp)
        )
        Text(
            text = stringResource(R.string.chicago), color = Color(0xFFEDEFEE),
            fontSize = 24.sp,
        )
        Row(Modifier.padding(top = 18.dp)) {
            Image(
                painterResource(R.drawable.upperpanelimage),
                contentDescription = "Upper panel image",
                Modifier
                    .height(150.dp)
                    .clip(RoundedCornerShape(20.dp))
            )
            Text(
                stringResource(R.string.description),
                color = colorResource(R.color.text_white),
                fontSize = 18.sp,
                modifier = Modifier
                    .padding(bottom = 28.dp, start = 16.dp)
                    .fillMaxWidth(0.6f)
            )
        }
        Button(
            colors = ButtonDefaults.buttonColors(containerColor = colorResource(R.color.lemon)),
            onClick = {
                Toast.makeText(context, "Order successful!", Toast.LENGTH_SHORT).show()
                navController.navigate(MenuListRoute)
            }

        ) {
            Text(
                text = stringResource(R.string.order),
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF333333)
            )
        }
    }
}

@Preview
@Composable
fun UpperPanelPreview() {
    val navController = rememberNavController()
    UpperPanel(navController)
}