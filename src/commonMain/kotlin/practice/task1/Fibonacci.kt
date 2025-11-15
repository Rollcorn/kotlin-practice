package org.itmo.practice.task1

fun fibonacci(n: Int): Int {
    var fst: Int = 0
    var snd : Int = 1
    for (i in 1..n) {
        val tmp = fst + snd
        fst = snd
        snd = tmp
    }
    return fst
}

fun main() {
    while (true) {
        println("Enter your input: ")
        val n =  readln().toInt()
        println(fibonacci(n))
    }
}
