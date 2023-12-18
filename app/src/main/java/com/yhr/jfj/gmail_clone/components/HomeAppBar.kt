package com.yhr.jfj.gmail_clone.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.CardElevation
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.yhr.jfj.gmail_clone.R

@Composable
fun HomeAppBar() {
    Box(
        modifier = Modifier.padding(10.dp)
    ) {
        Card(
            modifier = Modifier.requiredHeight(50.dp),
            shape = RoundedCornerShape(10.dp),
            elevation = CardDefaults.cardElevation(6.dp)
        ) {
            Row(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(8.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(imageVector = Icons.Default.Menu, contentDescription = "Menu")
                Spacer(modifier = Modifier.width(16.dp))
                Text(
                    text = "Search in emails",
                    modifier = Modifier
                        .weight(2.0f)
                )
                Image(
                    painter = painterResource(id = R.drawable.riyad),
                    contentDescription = "Riyad",
                    modifier = Modifier
                        .size(30.dp)
                        .clip(shape = CircleShape)
                        .background(color = Color.Gray)
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun HomeAppBarPreview() {
    HomeAppBar()
}