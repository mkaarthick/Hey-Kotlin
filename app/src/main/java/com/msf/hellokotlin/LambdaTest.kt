package com.msf.hellokotlin

/**
 * Created by karthick on 10/7/2017.
 */

//interface Callback {
//    fun callback(result: String)
//}

//fun doAsync(x: Int, callback: Callback) {
//
//    callback.callback("finished")
//}


fun doAsync(x: Int, callback: (String) -> Unit) {
    callback("Finished")
}

fun test() {

//    doAsync(20, object : Callback {
//        override fun callback(result: String) {
//            print(result)
//
//        }
//
//    })


    doAsync(20) { result -> print(result) }


    val sum = { a: Int, b: Int -> a + b }
    applyOp(2, 3, sum)

    val mul = { a: Int, b: Int -> a * b }
    applyOp(2, 3, mul)
}

fun applyOp(x: Int, y: Int, f: (Int, Int) -> Int): Int = f(x, y)