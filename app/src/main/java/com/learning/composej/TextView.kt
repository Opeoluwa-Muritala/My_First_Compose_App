package com.learning.composej

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Colors
import androidx.compose.material.MaterialTheme
import androidx.compose.material.MaterialTheme.colors
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Blue
import androidx.compose.ui.tooling.preview.Preview
import com.learning.composej.ui.theme.ComposejTheme
import com.learning.composej.ui.theme.Purple200


class TextView: ComponentActivity() {
    override fun onCreate(savedInstanceState:Bundle?){
        super.onCreate(savedInstanceState)
        setContent{
            ComposejTheme {
                Surface(modifier = Modifier.fillMaxSize(),
                color= Color.Transparent,
                shape = MaterialTheme.shapes.large,
                ) {myApp()

                }

            }
        }
    }
@Preview(showBackground=true)
@Composable
fun DefaultPreview(){
    ComposejTheme{
        myApp()

    }
}
    @Composable
    private fun myApp() {
        MaterialTheme(colors = MaterialTheme.colors,){
            Text(text = "Opeoluwa learns Jetpack Compose")
        }
        TODO("Not yet implemented")
    }
}