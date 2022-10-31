package com.example.kotlinprogramme

import android.util.Log

class FiboniciiSeries1 {
    fun FiboniciiSeries (){
        var a=0
        var b=1
        var sum=0
        for(i in 0 until 10)
        {
          sum=a+b
          print(" $a")
            a=b
            b=sum
        }

    }
}