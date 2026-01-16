package com.example.itewhulina

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.itewhulina.ui.theme.ItewHuliNaTheme

class Student1Activity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ItewHuliNaTheme {
                Student1Screen()
            }
        }
    }
}

@Composable
fun Student1Screen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        Image(
            painter = painterResource(id = R.drawable.student1),
            contentDescription = "Student 1 Picture",
            modifier = Modifier.size(160.dp)
        )

        Spacer(modifier = Modifier.height(20.dp))

        Text(
            text = "Lagman, Hans Jacob",
            fontSize = 22.sp
        )
    }
}

@Preview(showBackground = true)
@Composable
fun Student1Preview() {
    ItewHuliNaTheme {
        Student1Screen()
    }
}
