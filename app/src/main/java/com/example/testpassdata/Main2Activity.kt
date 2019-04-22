package com.example.testpassdata

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        if (intent != null) {
            val intent = getIntent()
            val id = intent.getStringExtra("id")
            val name = intent.getStringExtra("name")
            println("###" + id + name)
        } else {

        }
    }
}
