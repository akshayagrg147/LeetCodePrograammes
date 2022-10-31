package com.example.kotlinprogramme

class ArrayListOperations {
    fun ArrayListOperations(){
        var list = mutableListOf("dd","ww")
        list.add("ak")
        println(list[0])
        println(list.contains("ak") )
        println("akkkk kdm dj".contains("kdm"))
        println("akkkk kdm dj".reversed())
        var list1="ak kk pk".split(" ")
        println(list1[list1.size-1])
        for(i in list1.size-1 downTo 0)
            println(list1[i])

    }
}

//difference beteen mutable list and arraylist
//mutable list that denotes to list hing any type of data type
//but arraylist u specifically saying i want arrylist
