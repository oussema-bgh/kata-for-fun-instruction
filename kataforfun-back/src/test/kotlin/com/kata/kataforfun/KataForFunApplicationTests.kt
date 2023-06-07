package com.kata.kataforfun

import com.kata.kataforfun.services.KataForFunService
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.mockito.InjectMocks
import org.mockito.Spy
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class KataForFunApplicationTests {

    @Spy
    @InjectMocks
    private val kataForFunService: KataForFunService? = null


    @Test
    fun input_1_then_1() {
        Assertions.assertEquals("1", kataForFunService!!.convertNumber(1))
    }


    @Test
    fun input_3_then_KataKata() {
        Assertions.assertEquals("KataKata", kataForFunService!!.convertNumber(3))
    }

    @Test
    fun input_5_then_ForFor() {
        Assertions.assertEquals("ForFor", kataForFunService!!.convertNumber(5))
    }

    @Test
    fun input_7_then_Fun() {
        Assertions.assertEquals("Fun", kataForFunService!!.convertNumber(7))
    }

    @Test
    fun input_9_then_Kata() {
        Assertions.assertEquals("Kata", kataForFunService!!.convertNumber(9))
    }

    @Test
    fun input_51_then_KataFor() {
        Assertions.assertEquals("KataFor", kataForFunService!!.convertNumber(51))
    }

    @Test
    fun input_53_then_ForKata() {
        Assertions.assertEquals("ForKata", kataForFunService!!.convertNumber(53))
    }

    @Test
    fun input_33_then_KataKataKata() {
        Assertions.assertEquals("KataKataKata", kataForFunService!!.convertNumber(33))
    }

    @Test
    fun input_27_then_KataFun() {
        Assertions.assertEquals("KataFun", kataForFunService!!.convertNumber(27))
    }

    @Test
    fun input_15_then_KataForFor() {
        Assertions.assertEquals("KataForFor", kataForFunService!!.convertNumber(15))
    }


}
