package com.msf.hellokotlin

/**
 * Created by karthick on 10/7/2017.
 */
open class Person(name: String = "Mano", val age: Int = 12) {
    var name: String = name
        get() = "Name : $field"
        set(value) {
            if (value != field) {
                field = value
            }
        }

}

class Developer : Person {
    constructor(name: String) : super(name)
    constructor(age: Int) : super(age = age)

}


fun test() {
    val person = Person("Thiyaga", 50)
    val age = person.age
    val name = person.name
}