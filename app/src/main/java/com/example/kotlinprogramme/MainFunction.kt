package com.example.kotlinprogramme

import android.os.Build
import androidx.annotation.RequiresApi
import java.util.*


@RequiresApi(Build.VERSION_CODES.N)
fun main() {
       val obj=  JavaProgrammes()
    //    for (k in  obj.BubbleSort(intArrayOf(1,3,1,4))) print("$k ")
        val arr = intArrayOf(2, 3, 5, 8, 9, 10, 11)
        val `val` = 17
        val arrSize = arr.size
//        println("${obj.isPairSum(arr, arrSize, `val`).first}--${obj.isPairSum(arr, arrSize, `val`).second}")
      //  println(obj.CheckArraySortedOrNot(intArrayOf(1,2,3,4,5),intArrayOf(1,2,3,4,5).size))
     //   println(Arrays.toString(obj.removeDuplicacyFromSortedArray(intArrayOf(2,3,3,5,5),intArrayOf(1,2,3,4,5).size)))
//        println(obj.PassZeroAtEnd().contentToString())
   obj.MaxProductSubArray()


    }

//time complexity o(logn)
//space comple o(1)






