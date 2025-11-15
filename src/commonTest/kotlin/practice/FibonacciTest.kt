package org.itmo.practice

import io.kotest.core.spec.style.AnnotationSpec
import io.kotest.matchers.shouldBe
import org.itmo.practice.task1.fibonacci

class FibonacciTest : AnnotationSpec() {
    @Test
    fun `base values`() {
        fibonacci(0) shouldBe 0
        fibonacci(1) shouldBe 1
        fibonacci(2) shouldBe 1
        fibonacci(3) shouldBe 2
        fibonacci(10) shouldBe 55
    }

    @Test
    fun `recurrence property holds for 2 to 20`() {
        for (n in 2..20) {
            fibonacci(n) shouldBe fibonacci(n - 1) + fibonacci(n - 2)
        }
    }
}
