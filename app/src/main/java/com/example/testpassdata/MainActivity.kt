package com.example.testpassdata

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var bt1 = findViewById(R.id.button1) as Button //在获取
        bt1.setOnClickListener {
            var intent = Intent()
            intent.setClass(this,Main2Activity::class.java)
            startActivity(intent)
        }
    }



}
