package com.example

import io.micronaut.validation.Validated

@Validated
class MathController {
    fun calc(
        a: Int,
        b: Int
    ): Int {
        return a+b
    }
}