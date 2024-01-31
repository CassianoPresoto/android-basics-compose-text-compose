package com.example.app_test

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.app_test.ui.theme.App_testTheme
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            App_testTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun AppTestCardPreview() {
    App_testTheme {
        GreetingImage(
            stringResource(R.string.compose_text_body),
            stringResource(R.string.compose_text_sub), stringResource(R.string.compose_text_title)
        )
    }
}

@Composable
fun GreetingImage(body: String, sub: String, title: String, modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.bg_compose_background)
    Box {
        Image(
            painter = image,
            contentDescription = null
        )
        GreetingTextTitle(
            title = title,
            modifier = Modifier
                .fillMaxSize()
                .padding(start = 10.dp).padding(110.dp)
        )
    }
}

@Composable
fun GreetingTextTitle(title: String, modifier: Modifier = Modifier) {
    Column(
        modifier = modifier.fillMaxSize()
            .padding(8.dp), verticalArrangement = Arrangement.Top

    ) {
        Text(
            text = title,
            fontSize = 30.sp,
        )
    }
}

@Composable
fun GreetingTextSub(sub: String, modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .padding(8.dp),
        verticalArrangement = Arrangement.Top
    ) {
        val color = Color.Black
        Text(
            text = sub,
            textAlign = TextAlign.Start,
            fontSize = 30.sp,
            color = color
        )
    }
}

@Composable
fun GreetingTextBody(body: String, modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .padding(8.dp),
        verticalArrangement = Arrangement.Top
    ) {
        val color = Color.Black
        Text(
            text = body,
            textAlign = TextAlign.Start,
            fontSize = 30.sp,
            color = color
        )
    }
}
