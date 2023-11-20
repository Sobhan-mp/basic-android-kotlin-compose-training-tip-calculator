package com.example.tiptime

import com.example.tiptime.calculateTip
import org.junit.Assert.assertEquals
import org.junit.Test
import java.text.NumberFormat

class TipCalculatorTest {

    @Test
    fun tipCalculator_20PercentNoRoundUp(){
        //Given
        val amount = 20.00
        val tipPercent = 20.00
        val expectedValue = NumberFormat.getCurrencyInstance().format(4)
        //When
        val realValue = calculateTip(amount, tipPercent, false)
        //Then
        assertEquals(expectedValue, realValue)
    }
}