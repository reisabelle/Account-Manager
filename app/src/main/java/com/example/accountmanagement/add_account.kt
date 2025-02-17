package com.example.accountmanagement

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class add_account : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_add_account)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val submitbtn: Button = findViewById(R.id.submitbtn)
        submitbtn.setOnClickListener() {
            val intent = Intent(this, Accounts::class.java)
            startActivity(intent)
        }

        val backbtn3: ImageView = findViewById(R.id.backbtn3)
        backbtn3.setOnClickListener() {
            val intent = Intent(this, Accounts::class.java)
            startActivity(intent)
        }
    }
}