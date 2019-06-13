package com.example

import junit.framework.TestCase.assertEquals
import org.junit.Test

class MathControllerTests {
    @Test
    fun ThisWorks() {
        val test = MathController()

        val actual = test.calc(1, 2)
        assertEquals(3, actual)
    }
}
