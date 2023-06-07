package com.kata.kataforfun.services

import org.springframework.stereotype.Component

@Component
class KataForFunService {

    fun convertNumber(inputNumber: Int): String {
        println(inputNumber);

        val digitsList = inputNumber.toString().map { it.toString().toInt() }.toList()


        val resultDivisors = StringBuilder()
        val resultElment = StringBuilder()


        if(0 == inputNumber % 3){
            resultDivisors.append("Kata")
        }
        if(0 == inputNumber % 5){
            resultDivisors.append("For")
        }
        if(3 == inputNumber ){
            resultElment.append("Kata")
        }
        if(5 == inputNumber ){
            resultElment.append("For")
        }
        if (7 == inputNumber) {
            resultElment.append("Fun")
        }

        if(digitsList.size>1) {
            for (element in digitsList) {

                println("element $element");
                println("result_Divisors $resultDivisors");
                println("result_Elment $resultElment");


                if (0 == element % 3) {
                    resultDivisors.append("Kata")
                }
                if (0 == element % 5) {
                    resultDivisors.append("For")
                }
                if (7 == element) {
                    resultElment.append("Fun")
                }
            }
        }
        println("result_Divisors version prefinal $resultDivisors");
        println("result_Elment version final $resultElment");


        resultDivisors.append(resultElment.toString());
        println("result_Divisors final $resultDivisors");

        return if (resultDivisors.isEmpty()) {
            inputNumber.toString()
        } else {
            return resultDivisors.toString()
        }
    }

}