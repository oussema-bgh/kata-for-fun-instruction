package com.kata.kataforfun.services

import org.springframework.stereotype.Service

@Service
class KataForFunService {

    fun convertNumber(inputNumber: Int): String {

        val digitsList = inputNumber.toString().map { it.toString().toInt() }.toList()


        val resultDivisors = StringBuilder()
        val resultElement = StringBuilder()

        when (inputNumber) {
            in Int.MIN_VALUE..Int.MAX_VALUE -> {
                if (inputNumber % 3 == 0) {
                    resultDivisors.append("Kata")
                }
                if (inputNumber % 5 == 0) {
                    resultDivisors.append("For")
                }
            }
        }
        if (inputNumber == 3) {
            resultElement.append("Kata")
        }
        if (inputNumber == 5) {
            resultElement.append("For")
        }
        if (inputNumber == 7) {
            resultElement.append("Fun")
        }



        if (digitsList.size > 1) {
            digitsList.forEach { element ->
                when {
                    0 == element % 3 -> resultDivisors.append("Kata")
                    0 == element % 5 -> resultDivisors.append("For")
                    7 == element -> resultElement.append("Fun")
                }
            }
        }
        resultDivisors.append(resultElement.toString())

        return if (resultDivisors.isEmpty()) {
            inputNumber.toString()
        } else {
            return resultDivisors.toString()
        }
    }

}