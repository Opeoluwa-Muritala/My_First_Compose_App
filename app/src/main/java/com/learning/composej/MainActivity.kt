package com.learning.composej

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.learning.composej.ui.theme.ComposejTheme
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults.buttonColors
import androidx.compose.material.ButtonColors as ButtonColors1


class MainActivity : ComponentActivity() {
    private val Purple200 = Color(0xFFBB86FC)
    private val Purple500 = Color(0xFF6200EE)
    private val Purple700 = Color(0xFF3700B3)
    private val Teal200 = Color(0xFF03DAC5)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposejTheme {
                Snackbar{
                   Text( text="JetPack Compose Setup")
                }
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background,
                    shape = MaterialTheme.shapes.small,

                ) {
                    MyApp()
                }
            }

        }
    }


    @Preview(showBackground = true)
    @Composable
    fun DefaultPreview() {
        ComposejTheme {
            MyApp();
        }
    }
    @Composable
    fun MyApp() {
        MaterialTheme(
        ) {
            //Material Components like Button, Card, Switch, etc.
            snackbar()
            mybutton()

        }
    }
    @Composable
    private fun snackbar(){
        Snackbar(){
            Text(text = "Demo Application")
        }
    }
@Composable
    private fun mybutton() {
    Button(onClick = {  val intent = Intent(this,TextView::class.java)
        startActivity(intent)
        finish()},
        contentPadding = PaddingValues(start = 20.dp,
            top = 15.dp,
            end = 20.dp,
            bottom= 15.dp),
        shape = MaterialTheme.shapes.large,
        colors = buttonColors(backgroundColor = Color.Magenta,
            contentColor = Color.Blue),
    ) {
        Text(text = "Click",)
    }

    }
}

