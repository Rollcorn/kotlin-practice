package org.itmo.practice.task2

import org.koin.core.module.Module
import org.koin.dsl.module

class JvmPlatformInfo : PlatformInfo {
    override val name: String =
        "JVM (${System.getProperty("os.name")})"
}

actual fun platformModule(): Module = module {
    single<PlatformInfo> { JvmPlatformInfo() }
}
