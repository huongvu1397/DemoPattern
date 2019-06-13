package com.solar.huong.singletonpattern

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val first = Singleton.instance
        first.b = "hello singleton"
        println(first.b)
        val second = Singleton()
        println("y ${second.b}")
        val thrid = Singleton.getInstancee()
        println("x ${thrid.b}")
    }
}
