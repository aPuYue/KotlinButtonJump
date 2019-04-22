package com.example.testpassdata

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var bt1 = findViewById(R.id.button1) as Button
        bt1.setOnClickListener {
            var intent = Intent(this,Main2Activity::class.java)
            intent.putExtra("id", "3");
            intent.putExtra("name", "Tom")
            startActivityForResult(intent, 0)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {//返回结果在data里面
        super.onActivityResult(requestCode, resultCode, data)

        when(requestCode) {
            0 -> { //必须设置case 之前就设置的0
                val dataWeWant = data?.getStringExtra("value")
                println("###2 " + dataWeWant)
            }
        }
    }



}
