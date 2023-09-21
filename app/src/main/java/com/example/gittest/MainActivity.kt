package com.example.gittest

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.gittest.ui.theme.GitTestTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            GitTestTheme {
                val cat = Kitty()
                val dog = Dog()
            }
        }
    }
}