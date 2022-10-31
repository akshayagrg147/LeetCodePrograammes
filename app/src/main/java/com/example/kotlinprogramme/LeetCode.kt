package com.example.kotlinprogramme

import android.os.Build
import androidx.annotation.RequiresApi
import java.util.*
import kotlin.collections.ArrayList

class LeetCode {
    fun gcd() { //gcd equals to hcf
        var number1 = 81
        var number2 = 51
        var i = 1
        var gcd = 0
        while ((i <= number1) && (i <= number2)) {
            if ((number1 % i == 0) && (number2 % i == 0)) {
                gcd = i
            }
            i++
        }
        println("gcd of two numbers $number1 $number2 is $gcd")
    }

    fun factorialNumber() {
        var number = 3
        var total = 1
        while (number > 0) {
            total *= (number)
            number -= 1
        }
        println("factorial number is $total")
    }

    fun twoSum(nums: IntArray, target: Int): IntArray {

        var finalresponse: IntArray = intArrayOf(0, 0)
        var response = false
        for (i in nums.indices) {
            for (j in (i + 1) until nums.size) {
                if (nums[i] + nums[j] == target) {
                    println("elements print $i $j")
                    response = true
                    finalresponse[0] = i
                    finalresponse[1] = j
                    break
                }

            }
            if (response)
                break
        }
        return finalresponse
    }

    fun LcmOfTwoNumbers() {
        var number1: Int = 11
        var number2 = 121
        var lcm = if (number1 > number2) number1 else number2
        while (true) {
            if ((lcm % number1 == 0) && (lcm % number2 == 0)) {
                break
            }
            lcm++
        }
        println("lcm of two number $number1 $number2 is $lcm")
    }

    fun MedianArray() {
        var l1 = ArrayList<Int>(listOf(1, 2, 3, 4))
        var l2 = ArrayList<Int>(listOf(4, 5, 6))

        println(l1.addAll(l2))
        var sum = 0
        for (i in l1.indices)
            sum += i


    }

    fun sumTwoArray() {
        val x: List<Int> = listOf(1, 2, 3, 4, 5, 6)
        val y: List<Int> = listOf(2, 3, 4, 5, 6, 7)
        val sum = (0 until x.size).map { x[it] + y[it] }
        var total = 0
        for (i in sum) {
            total += i

        }
        println("sum of two array is $sum and total is $total")
    }

    fun RepresentInMatrics() {
        val x: List<Int> = listOf(1, 2, 3, 4, 5, 6, 1, 1, 1)
        var row = 0
        var column = 0
        if (x.size > 0) {
            for (i in 2..9) {
                if (x.size % i == 0) {
                    row = i
                    column = x.size / i
                    break
                }
            }
            val matrics = Array(row) { IntArray(column) }
            for (i in 0..row - 1) {
                for (j in 0..column - 1) {
                    matrics[i][j] = x[0]
                }

            }
            println("$row  $column")

            for (row in 0..row - 1) {
                for (column in 0..column - 1) {
                    print("${matrics[row][column]}  ")
                }
                println()
            }

        }
    }

    fun Addition2dArraymatrics() {
        var x1 = arrayOf(intArrayOf(1, 2, 3), intArrayOf(2, 3, 4), intArrayOf(2, 3, 4))
        var x2 = arrayOf(intArrayOf(1, 1, 1), intArrayOf(2, 1, 2), intArrayOf(2, 3, 4))
        val sum = Array(3) { IntArray(3) }
        for (i in 0..2) {
            for (j in 0..2) {
                sum[i][j] = x1[i][j] + x2[i][j]
            }
        }

        for (row in 0..2) {
            for (column in 0..2) {
                print("${sum[row][column]}  ")
            }
            println()
        }
    }

    fun EachWordFirstLetterCaps() {
        val string = "hello akshay 12"
        val str = arrayOf<String>("")
        var totalString: String = ""
        val str1 = string.split(" ")
        for (st in str1) {
            val firstword = st.substring(0, 1).toUpperCase()
            val afterword = st.substring(1)
            totalString += firstword + afterword + " "
        }
        println(totalString)
    }

    //recursion

    fun printIncreasing(n: Int) {
        if (n == 0)
            return
        println("callingn number $n")
        printIncreasing(n - 1)


    }

    fun printfactorialRecursion(n: Int): Int {
        return if (n >= 1)
            n * printfactorialRecursion(n - 1)
        else
            1
    }

    fun BubbleSort(intArray: IntArray): IntArray {
        var list = intArray

        for (i in 0 until list.size - 1) {
            if (list[i] >= list[i + 1]) {
                var number = list[i]
                list[i] = list[i + 1]
                list[i + 1] = number
            }

        }
        return list
    }
    fun RearrangingNegativePositive(){
        val arr= intArrayOf(1,2,3,-1,5,-3,)
        var start=0
        var end=arr.size-1
        while (start<end){
            if(arr[end]<0){
                println("$start --- $end")
                if(arr[start]>=0)
                {  val temp=arr[end]
                arr[end]=arr[start]
                arr[start]=temp
                    end -= 1
                    start+=1}

            }
            else{
                start++
                end--
            }
        }
        for(i in arr.indices){
            println(arr[i])
        }
    }

    fun isPairSum(A: IntArray, N: Int, X: Int): Pair<Int, Int> {
        // represents first pointer
        var i = 0

        // represents second pointer
        var j = N - 1
        while (i < j) {

            // If we find a pair
            if (A[i] + A[j] == X) return Pair(A[i], A[j]) else if (A[i] + A[j] < X) i++ else j--
        }
        return Pair(0, 0)
    }

    fun SortedZeroOnes() {
        val arr = intArrayOf(0, 1, 1, 0)
        var combined = IntArray(arr.size)
        var count = 0
        for (zero in arr) {
            if (zero == 0)
                count += 1
        }

        for (cc in 0 until count) {
            combined[cc] = 0
        }
        for (cc in count until arr.size) {
            combined[cc] = 1
        }
        println(combined.size)

    }

    fun CheckArraySortedOrNot(elements: IntArray, n: Int): Int {
        if (n == 1 || n == 0)
            return 1//means sorted
        if (elements[n - 1] < elements[n - 2])
            return 0//not sorted
        return CheckArraySortedOrNot(elements, n - 1)
    }

    fun removeDuplicacyFromSortedArray(elements: IntArray, n: Int): IntArray {
        var list = ArrayList<Int>()

        if (n == 0 || n == 1) {
            return elements
        }
        for (i in 0 until n - 1) {
            if (elements[i] != elements[i + 1])
                list.add(elements[i])
        }
        list.add(elements[n - 1])
        return list.toIntArray()
    }

    fun callingNextPermutations() {
        //1 2 3 4 //1 3 2 4
        //5 4 3 2

        var array = arrayOf(4, 3, 2, 1)
        var getfirst = -1

        for (i in array.size - 2 downTo 0) {
            if (array[i] < array[i + 1]) {
                getfirst = i
                break
            }
        }
        if (getfirst != -1) {
            solving(array, getfirst)
        } else {
            array.reverse()

            for (i in array.size - 2 downTo 0) {
                if (array[i] < array[i + 1]) {
                    getfirst = i
                    break
                }
            }

            solving(array,getfirst)
        }

    }

    fun solving(array: Array<Int>, getfirst: Int) {
        var getsecond = 0
        for (i in array.size - 1 downTo 1) {
            if (array[i] > array[getfirst]) {
                getsecond = i
                break
            }

        }
        var temp = array[getfirst]
        array[getfirst] = array[getsecond]
        array[getsecond] = temp
        for (i in 0 until array.size) {
            println(array[i])

        }
    }

    fun PassZeroAtEnd(): IntArray {
        var array = intArrayOf(1, 0, 3, 0, 1, 1)
        var tempArray = IntArray(array.size)
        var count = 0
        for (i in 0 until array.size) {
            if (array[i] != 0) {
                println("cout1 is $count")
                tempArray[count++] = array[i]
                println("cout2 is $count")
            }
        }
        println("cout is $count")
        for (i in count until array.size) {
            tempArray[count++] = 0
        }
        return tempArray
    }

    fun sortString(): String {
        val str = "Akshay"
        var sort = str.toCharArray()
        Arrays.sort(sort)
        return String(
            sort
        )
    }

    fun maxSubArraySum(): Int {
        val a = intArrayOf(-2, -3, -2, -4, -2, -2, -5, -3)

        val size = a.size
        var max_so_far = Int.MIN_VALUE
        var max_ending_here = 0
        for (i in 0 until size) {
            max_ending_here = max_ending_here + a[i]
            if (max_so_far < max_ending_here) max_so_far = max_ending_here
            if (max_ending_here < 0) max_ending_here = 0
        }
        return max_so_far
    }

    fun CommonElementsInThreeSortedArray(){
        var l1= arrayListOf<Int>(1,2,3,4,5,6)
        var l2= arrayListOf<Int>(1,3,5,6,7)
        var l3= arrayListOf<Int>(1,2,3,4,5)
        var i:Int=0
        var j:Int=0
        var k:Int=0
        var listcount:Int=0
        while (i<l1.size && j<l2.size && k<l3.size){
            if(l1[i]==l2[j]&& l2[j]==l3[k]){
                println(l1[i])
                i++
                j++
                k++
            }
            else if(  l2[j]<l3[k])
                j++
            else if(l1[i]<l2[j])
                i++
            else
                k++
        }

    }
    @RequiresApi(Build.VERSION_CODES.N)
    fun majorityElement(): Int {
        val nums = intArrayOf(-2, -3, -2, -4, -2, -2, -5, -3)
        val map: MutableMap<Int, Int> = HashMap()
        var maxValueInMap = 0
        for (i in nums.indices) {
            map[nums[i]] = map.getOrDefault(nums[i], 0) + 1
            maxValueInMap = Collections.max(map.values)

        }
        for (mp in map.entries) {
            if (mp.value == maxValueInMap) {
                return mp.key
            }
        }
        return 0
    }

}