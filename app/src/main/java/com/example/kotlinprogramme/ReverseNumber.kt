package com.example.kotlinprogramme

class ReverseNumber {
    fun reverseNumber() {
        var number = 1234
        var reverese = 0
        while (number != 0) {
            val digit = number % 10
            reverese = reverese * 10 + digit
            number /= 10


        }
        println("reverse value :$reverese")
    }

    fun primeNumber() {

        for (i in 2 until 30) {//3
            var value: Boolean = true
            for (j in i - 1 downTo 2) //2
            {
                if (i % j == 0) {
                    value = false
                    break
                }

            }
            if (value)
                println("checking time $i---" + value)


        }
    }
    fun oddNumber(){

        for(i in 1 until 10)
        {var bln:Boolean=true
            if(i%2==0)
                bln=false
            if(bln)
                println(i)

        }
    }
    fun stawappingtwoNumber(){
        var a=2
        var b=5
        a+=b
        b-=b
        a-=b
        println("$a $b")

    }

    fun armstrongNumber(){
        var number=153
        var orignalNumber=number
        var sum=0
        while (number!=0)
        {var result=number % 10
            sum += (result*result*result)
            number /= 10


        }
        if(orignalNumber==sum)
        {
            println("armtrong number")
        }
        else
            println("armtrong not number")

    }

}