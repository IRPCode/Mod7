package com.example.unitconverter

import org.junit.Test
import java.lang.Character.isDigit

class ValidatorTest {
    @Test
    fun checkInput() {
        val userInput = 2 //fake user input for example, running through similar steps as actual program
        val newInput = userInput * 2.20462 //recreating process in MainActivity.kt
        if (newInput.toDouble() == 4.40924) {
            println("Valid input!")
        } else {
            println("Invalid input.")
        }
    }
}

