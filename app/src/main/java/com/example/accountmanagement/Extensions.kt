package com.example.accountmanagement

import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.WindowCompat

fun AppCompatActivity.enableEdgeToEdge() {
    WindowCompat.setDecorFitsSystemWindows(window, false)
}