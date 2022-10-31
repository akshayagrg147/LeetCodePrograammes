package com.example.kotlinprogramme

import android.os.Build
import androidx.annotation.RequiresApi
import java.text.SimpleDateFormat
import java.util.*


class PrintingStars {
    fun calculatetime(){
        val toDayCalendar = Calendar.getInstance()
        val current_Date = toDayCalendar.time
        val format1 = SimpleDateFormat("yyyy-MM-dd'T'HH:mm:")

        val date = format1.parse("2022-09-21T13:44:12.587316Z")
        val cal = Calendar.getInstance()

        cal.time = date!!
        cal.add(Calendar.HOUR, 24)
        val hours:Int=((current_Date.time-cal.time.time)  / (1000*60*60)).toInt()
        println("$hours")
        if( cal.time>current_Date ){
            println("show cancel ${current_Date}")
        }
        else{
            println("not show cancel ${current_Date}")
        }


    }
    fun removeDuplicateList(){
        var list= arrayListOf<Int>(1,2,3,1,2)
        for (i in 0 until list.size){
            print(list[i])
        }
    }
    fun MoveegativeNumber(){
        var list=arrayListOf<Int>(1,2,3,1,2,1)
        var list1:MutableList<Int> = mutableListOf()
        for(i in 0 until list.size){
            if(list[i]>0){
                list1[i] =list[i]
            }
        }
    }
    fun UnIonAndIntersaction(){
        val l1= arrayListOf<Int>(1,2,3,4,5)
        val l2= arrayListOf<Int>(2,3,4,5)
        var union= hashSetOf<Int>()
         var x=if(l1.size<l2.size) l1.size else l2.size
        for(i in 0 until l1.size){
            union.add(l1[i])
        }
        for(i in 0 until l2.size){
            union.add(l2[i])
        }
        println(union)
        //intersaction


    }

    fun rotateByOneArray(){
        val list= mutableListOf<Int>(1,2,3,4,5) //5 1 2 3 4
        var i=0
        val j=list.size-1
        while (i!=j){
            val temp=list[i]
            list[i]=list[j]
            list[j]=temp
            i++
        }
        for(i in 0 until list.size){
            println(list[i])
        }
    }
    @RequiresApi(Build.VERSION_CODES.N)
    fun UnionIntersactionUsingHashMap(){
        val l1= arrayListOf<Int>(1,2,2,3,4,5)
        val l2= arrayListOf<Int>(2,3,4,5)
        var union= hashMapOf<Int, Int>()
        var intersaction= hashMapOf<Int, Int>()
        for(i in 0..l1.size-1){
            union.put(l1[i],union.getOrDefault(l1[i], 0) + 1)
        }
//        for(i in 0..l2.size-1){
//            union.put(l2[i],union.getOrDefault(l2[i], 0) + 1)
//        }
        for(mp in union.entries ){
            println("${mp.key} ${mp.value}")

        }
            //intersaction
        for(i in 0..l2.size-1){
            if(union.containsKey(l2[i]))
                intersaction.put(l2[i],intersaction.getOrDefault(l2[i], 0) + 1)
        }
        for(mp in intersaction.entries ){
            println("${mp.key} ${mp.value}")

        }
    }
    fun arraySort(){
        var elements= mutableListOf<Int>(2,3,4,1,2)
        Arrays.sort(elements.toTypedArray())
        println(elements[1])
    }
    fun NumberCount(){
        println("Enter any name")
        val stringInput = readLine()!!
        var name=stringInput
        var containswird=""
        var count=1
        var string=name.toCharArray()
        for(c in 0 until name.length){
            for(d in 1 until name.length)
            {
                if((name[c]==name[d]))
                {count++
                }

            }
            if(!containswird.contains(name[c]))
            println("${name[c]} is $count")
            containswird=containswird+name[c]
            count=0
        }
    }

    fun printingSequencestar(){
        var n=5
        var value:Char = 'a'

        for(i in 0 until n )
        {
            for(j in 0 until i)
            {

                print(value)
                value++
            }

            println()
        }

    }
    fun printingReverseStar(){
//        *****
//        ****
//        ***
//        **
//        *

        var n=5
        for(i in n downTo 0 )
        {
            for(j in 0 until i)
                print("*")
            println()
        }
    }
    fun printingSideReverseStar(){
//           *
//          **
//         ***
//        ****
        var n=5
        for(i in 0 until  n )
        {
            for( j in n-i downTo 1)
            {
                print(" ")
            }

            for(j in 0 until  i)
                print("*")
            println()
        }
    }
    fun printingSideReverseOnReverseStar(){
//        *****
//         ****
//          ***
//           **
//            *
        var n=5
        for(i in n downTo   0 )
        {
            for( j in n-i downTo 1)
            {
                print(" ")
            }

            for(j in 0 until  i)
                print("*")
            println()
        }
    }
}