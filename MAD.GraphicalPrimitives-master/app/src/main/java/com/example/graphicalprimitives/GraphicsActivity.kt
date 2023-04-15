package com.example.graphicalprimitives

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class GraphicsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_graphics)
        supportActionBar?.hide()
    }
}