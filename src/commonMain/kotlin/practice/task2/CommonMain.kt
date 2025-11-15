package org.itmo.practice.task2

import org.koin.dsl.module
import org.koin.core.context.startKoin

expect object Platform {
    val name: String
}

interface GreetingService {
    fun greet(): String
}

class GreetingServiceImpl : GreetingService {
    override fun greet(): String =
        "Hello from ${Platform.name}"
}

val commonModule = module {
    single<GreetingService> { GreetingServiceImpl() }
}

fun initKoin() = startKoin {
    modules(commonModule)
}