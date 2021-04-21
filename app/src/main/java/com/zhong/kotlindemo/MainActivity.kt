package com.zhong.kotlindemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    //sjk branch
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView
        setContentView(R.layout.activity_main)
        val ss = "sjk"
        Log.e("ss",ss)
    }
}