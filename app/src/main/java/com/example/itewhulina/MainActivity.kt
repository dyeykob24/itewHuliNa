package com.example.itewhulina

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import com.example.itewhulina.ui.theme.ItewHuliNaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ItewHuliNaTheme {
                MainScreen()
            }
        }
    }
}

@Composable
fun MainScreen() {
    val context = LocalContext.current

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Button(onClick = {
            context.startActivity(
                Intent(context, Student1Activity::class.java)
            )
        }) {
            Text("Student 1")
        }

        Button(onClick = {
            context.startActivity(
                Intent(context, Student2Activity::class.java)
            )
        }) {
            Text("Student 2")
        }

        Button(onClick = {
            context.startActivity(
                Intent(context, Student3Activity::class.java)
            )
        }) {
            Text("Student 3")
        }

        Button(onClick = {
            context.startActivity(
                Intent(context, Student4Activity::class.java)
            )
        }) {
            Text("Student 4")
        }

        Button(onClick = {
            context.startActivity(
                Intent(context, Student5Activity::class.java)
            )
        }) {
            Text("Student 5")
        }
    }
}
