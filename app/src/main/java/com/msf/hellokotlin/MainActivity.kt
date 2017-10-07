package com.msf.hellokotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

/**
 * This class has Basic concepts of Kotlin - Functions, Variables, String templates
 */
class MainActivity : AppCompatActivity() {
    private val TAG = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        toast("Hi")
        multiply(2)

        val textView = findViewById<TextView>(R.id.textView)
        textView.text = "Hello Kotlin"
        toast1("Hey ${textView.text}")

        /*Button click listener to show toast message*/
        button.setOnClickListener({ toast("You typed, ${message.text}") })

    }


    /**
     *To show toast message in compact style ;)
     */
    private fun toast1(message: String) = Toast.makeText(this, message, Toast.LENGTH_SHORT).show()

    /**
     * To show a toast message
     */
    private fun toast(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }

    /**
     * A function with return type of Int in a compact format
     */
    private fun multiply(myInt: Int) = Log.i(TAG, (myInt * 2).toString())


    private fun variables() {
        val x: Int = 20
        var string = "Hello"
    }

}
