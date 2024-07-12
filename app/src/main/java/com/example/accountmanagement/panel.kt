package com.example.accountmanagement

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.chip.ChipGroup

class panel : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_panel)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val homebutton: ChipGroup = findViewById(R.id.homebutton)
        homebutton.setOnClickListener() {
            val intent = Intent(this, home::class.java)
            startActivity(intent)
        }
        val imagebtn1: ImageView = findViewById(R.id.imagebutton1)
        imagebtn1.setOnClickListener() {
            val intent = Intent(this, home::class.java)
            startActivity(intent)
            }

        val infobutton: ChipGroup = findViewById(R.id.infobutton)
        infobutton.setOnClickListener() {
            val intent = Intent(this, passConfirmation::class.java)
            startActivity(intent)
        }
        val imagebtn2: ImageView = findViewById(R.id.imagebutton2)
        imagebtn2.setOnClickListener() {
            val intent = Intent(this, passConfirmation::class.java)
            startActivity(intent)
        }

        val logoutbutton: ChipGroup = findViewById(R.id.logoutbutton)
        logoutbutton.setOnClickListener() {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
        val imagebtn3: ImageView = findViewById(R.id.imagebutton3)
        imagebtn3.setOnClickListener() {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}