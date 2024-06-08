package com.example.rcexamapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val estartbutton:Button= findViewById(R.id.button_start)
        val exitbutton:Button= findViewById(R.id.button_Exit)
        estartbutton.setOnClickListener {
            val intent1= Intent(this,ExamHomeActivity::class.java)

            startActivity(intent1)
        }

        // exit button
        exitbutton.setOnClickListener {


             // exit the app
            System.exit(0)
        }

    }
}