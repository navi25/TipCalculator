package io.navendra.tipcalculator.model

class RestaurantCalculator{

    fun calculateTip(checkAmount:Double, tipPercentage:Double) : TipCalculator{
        var tipAmount = (checkAmount*tipPercentage)/100
        var totalAmount = checkAmount + tipAmount
        return TipCalculator(checkAmount,tipPercentage,tipAmount,totalAmount)
    }
}