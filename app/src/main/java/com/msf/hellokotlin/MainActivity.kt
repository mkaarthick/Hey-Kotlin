package com.msf.hellokotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private val TAG = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        toast("Hi")
        multiply(2)
        variables()

        val textView = findViewById<TextView>(R.id.textView)
        textView.text = "Hello Kotlin"
        toast1("Hey ${textView.text}")


    }

    private fun toast1(message: String) = Toast.makeText(this, message, Toast.LENGTH_SHORT).show()

    private fun toast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_LONG).show()
    }

    private fun multiply(myInt: Int) = Log.i(TAG, (myInt * 2).toString())

    private fun variables() {
        val x: Int = 20
        var string = "Hello"
    }

}
