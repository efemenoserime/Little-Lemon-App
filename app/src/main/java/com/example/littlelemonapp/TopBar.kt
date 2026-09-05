package com.example.littlelemonapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun TopBar() {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .padding(10.dp)
                .background(
                    colorResource(R.color.white)
                )
                .fillMaxWidth()
        ) {

            IconButton(
                onClick = { },
                modifier = Modifier.size(24.dp)
            ) {
                Image(painterResource(R.drawable.burger_menu_svgrepo_com), "Menu Icon")

            }
            Image(painterResource(R.drawable.lemon_svgrepo_com), "Little Lemon Logo")
            IconButton(onClick = {}, Modifier.size(24.dp)) {
                Image(
                    painterResource(R.drawable.cart_shopping_fast_svgrepo_com),
                    "Shopping Cart Icon"
                )
            }

    }
}

@Preview(showBackground = true)
@Composable
fun TopBarPreview() {
    TopBar()
}