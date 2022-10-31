package com.example.kotlinprogramme

class ExtractDigitFromString {
    fun extractingDigit(){
        val str = "Bidkiar 4331 Lake, Kaithal,12 Haryana 136027"
        val numbers = Regex("[0-9]{6}").findAll(str)
            .map(MatchResult::value)
            .toList()

        var greates=numbers[0]
        println("greates number $greates")
        for(i in 0 until numbers.size-1)
        {

            if(numbers[i]>greates)
            {
                greates=numbers[i]
            }
        }
        println("greates number $greates")


    }
}