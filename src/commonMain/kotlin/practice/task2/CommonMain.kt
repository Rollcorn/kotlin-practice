package org.itmo.practice.task2

import org.koin.core.module.Module
import org.koin.dsl.module
import org.koin.core.context.startKoin

interface PlatformInfo {
    val name: String
}

expect fun platformModule(): Module

interface GreetingService {
    fun greet(): String
}

class GreetingServiceImpl(
    private val platformInfo: PlatformInfo
) : GreetingService {
    override fun greet(): String = "Hello from ${platformInfo.name}"
}

val commonModule = module {
    single<GreetingService> { GreetingServiceImpl(get()) }
}

fun initKoin() = startKoin {
    modules(
        commonModule,
        platformModule()
    )
}
