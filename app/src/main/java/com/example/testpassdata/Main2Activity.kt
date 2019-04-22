package com.example.testpassdata

import android.app.Activity
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock.EXTRA_MESSAGE
import android.util.Log

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val intent = getIntent()
        val id = intent.getStringExtra("id")
        val name = intent.getStringExtra("name")
        println("###1 " + id + name)


        //更新,被intent的activity反向传值
        var data01 = "123456"
        val intent02 = Intent()
        intent02.putExtra("value", data01)
        setResult(RESULT_OK, intent02)
//        finish()//这个执行会让当前的activity停止 不执行的话点击安卓返回键也能回到之前的activity
    }
}
