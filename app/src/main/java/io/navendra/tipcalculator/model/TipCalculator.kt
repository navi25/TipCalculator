package io.navendra.tipcalculator.model

data class TipCalculator(
        val checkAmount : Double = 0.0,
        val tipPercentage : Double = 0.0,
        val tipAmount : Double = 0.0,
        val totalAmount : Double = 0.0
)