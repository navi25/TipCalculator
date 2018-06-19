package io.navendra.tipcalculator

import io.navendra.tipcalculator.model.RestaurantCalculator
import io.navendra.tipcalculator.model.TipCalculator
import org.junit.Assert.*
import org.junit.Before
import org.junit.Test

class RestaurantCalculatorTest{

    lateinit var calculator : RestaurantCalculator

    @Before
    fun setup(){
        calculator = RestaurantCalculator()
    }

    @Test
    fun testCalculateTip(){
        val checkAmountInput = 10.0
        val tipPercentageInput = 25.0

        val expectedTipCalculator = TipCalculator(
                checkAmount = checkAmountInput,
                tipPercentage = tipPercentageInput,
                tipAmount = 2.50,
                totalAmount = 12.50
        )
        assertEquals(calculator.calculateTip(checkAmountInput, tipPercentageInput),expectedTipCalculator)
    }
}