package com.example.visitcard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.visitcard.ui.theme.VisitCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            VisitCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Nair", "Developer", "87456354763", "gfyeg@g.ru")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, title: String, number: String, email: String, modifier: Modifier = Modifier) {
    Column (
        verticalArrangement = Arrangement.Center,
        modifier = modifier

    ) {
        val imageAndroid = painterResource(R.drawable.android)
        val imageEmail = painterResource(R.drawable.pochta)
        val imagePhone = painterResource(R.drawable.zvonok)
        Image(
            painter = imageAndroid,
            contentDescription = null,
            contentScale = ContentScale.Fit,
            modifier =  Modifier
                .size(200.dp)
                .align(alignment = Alignment.CenterHorizontally)
        )
        Text(
            text = name,
            fontSize = 50.sp,
            modifier = Modifier
                .align(alignment = Alignment.CenterHorizontally)
        )
        Text(
            text = title,
            fontSize = 25.sp,
            modifier = Modifier
                .padding(bottom = 200.dp)
                .align(alignment = Alignment.CenterHorizontally)
        )
        Row(modifier = Modifier
            .align(alignment = Alignment.Start)) {
            Image(
                painter = imagePhone,
                contentDescription = null,
                contentScale = ContentScale.Fit,
                modifier =  Modifier
                    .size(20.dp)
            )
            Text(
                text = number,
                fontSize = 15.sp,
            )
        }
        Row(modifier = Modifier
            .align(alignment = Alignment.Start)) {
            Image(
                painter = imageEmail,
                contentDescription = null,
                contentScale = ContentScale.Fit,
                modifier =  Modifier
                    .size(20.dp)
            )
            Text(
                text = email,
                fontSize = 15.sp,
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    VisitCardTheme {
        Greeting("Nair", "Developer", "87456354763", "gfyeg@g.ru")
    }
}