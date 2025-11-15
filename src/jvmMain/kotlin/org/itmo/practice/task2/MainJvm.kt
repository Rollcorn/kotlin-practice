package org.itmo.practice.task2

import org.koin.java.KoinJavaComponent.getKoin

fun main() {
    initKoin()

    val greetingService: GreetingService = getKoin().get()

    println(greetingService.greet())
}
