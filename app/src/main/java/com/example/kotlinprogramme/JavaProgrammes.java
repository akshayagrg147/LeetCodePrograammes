package com.example.kotlinprogramme;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Stack;

public class JavaProgrammes {
    void mergeTwoIntervals() {
        int intervals[][] = new int[][]{{1, 2}, {3, 6}, {4, 8}, {9, 10}};
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        Stack<int[]> stack = new Stack<>();
        stack.add(intervals[0]);
        for (int i = 0; i < intervals.length - 1; i++) {
            int startpoint2 = intervals[i][0];
            int endpoint2 = intervals[i][1];
            int[] poparray = stack.pop();
            int startpoint1 = poparray[0];
            int endpoint1 = poparray[1];
            int endMax = Math.max(endpoint2, endpoint1);
            if (endpoint1 >= startpoint2) {
                int[] merge = new int[]{startpoint1, endMax};
                stack.add(merge);
            } else {
                stack.add(poparray);
                stack.add(intervals[i]);
            }
        }
        int[][] output = new int[stack.size()][2];
        for (int i = output.length - 1; i >= 0; i--) {
            int[] poparray = stack.pop();
            output[i][0] = poparray[0];
            output[i][1] = poparray[1];
            System.out.println(output[i][0] + "--" + output[i][1]);
        }

    }

    void callarray() {
        int[] arr = new int[]{2, 3, 1, 5, 11, 10};
        int x = divide(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println(x);

    }

    int divide(int[] arr, int start, int end) {
        int inversioncount = 0;
        if (start <= end)
            return 0;
        else {
            int mid = start + (end - start) / 2;
            inversioncount = inversioncount + divide(arr, start, mid);
            inversioncount = inversioncount + divide(arr, mid + 1, end);
            inversioncount = inversioncount + conquer(arr, start, mid, end);
        }
        return inversioncount;

    }

    private int conquer(int[] arr, int start, int mid, int end) {
        int[] merged = new int[end - start + 1];
        int idx1 = start;
        int idx2 = mid + 1;
        int x = 0;
        int inv_count = 0;
        while ((idx1 <= mid) && (idx2 <= end)) {
            if (arr[idx1] < arr[idx2]) {
                merged[x++] = arr[idx1++];
            } else {
                merged[x++] = arr[idx2++];
                inv_count = inv_count + (mid - idx1);
            }
        }
        while (idx1 <= mid)
            merged[x++] = arr[idx1++];
        while (idx2 <= end)
            merged[x++] = arr[idx2++];
        for (int i = 0, j = start; i < merged.length; i++, j++) {
            arr[j] = merged[i];
        }
        return inv_count;
    }

    public void bestTimeToSell() {
        int[] ab = new int[]{1, 2, 4, 5, 6};
        int maxprofit = 0;
        int maxelelement = ab[ab.length - 1];
        for (int i = maxelelement - 2; i >= 0; i--) {
            maxelelement = max(maxelelement, ab[i]);
            maxprofit = max(maxprofit, maxelelement - ab[i]);
        }
        System.out.println("max profit is " + maxprofit);


    }

    public int max(int a, int b) {
        int max = 0;
        if (a > b) {
            max = a;
        } else
            max = b;
        return max;

    }


    public void ConsecutiveNumberSize() {
        int[] ob = new int[]{2, 3, 4, 5, 1, 7, 8};

        int result = 0;
        HashSet<Integer> hashSet = new HashSet<>();
        for (int value : ob) {
            hashSet.add(value);
        }
        for (int i = 0; i < ob.length; i++)
            if (!hashSet.contains(ob[i] - 1)) {
                int var = ob[i] + 1;
                while (hashSet.contains(var)) {
                    var++;

                }
                result = Math.max(result, var - ob[i]);
            }
        System.out.println(result);
    }

    public void MaxProductSubArray() {
        int[] ob = new int[]{2, 3, 4, 5, -1, 7, 8};
        int max = ob[0];
        int min = ob[0];
        int result = ob[0];
        for (int i = 1; i < ob.length; i++) {
            if (ob[i] < 0) {
                swap(max, min);
            }
            max = Math.max(max * ob[i], ob[i]);
            min = Math.max(min * ob[i], ob[i]);
            result = Math.max(result, max);
        }
System.out.println(result);
    }
    public void swap(int a,int b){
        int temp=a;
        a=b;
        b=temp;
    }

    public void LargeNumberFactoril(int n) {
        int val = 2;
        int size = 0;
        int count = 0;
        ArrayList<Integer> obj = new ArrayList<>();
        obj.add(0, 1);
        size = 1;
        while (val <= n) {
            for (int i = size - 1; i >= 0; i--) {
                int temp = obj.get(i) * val + count;  //4*5+0 0 count=0  20 //2*5+2  12
                obj.set(i, temp % 10);//1 0  //0 2
                count = temp / 10;//2 //1
                System.out.println("count is1   "+obj.get(i)+"---"+count+"---"+size+"--"+obj+"--"+temp);
            }
            while(count!=0){
                obj.add(0,count);
                count=count/10;
                size++;
                System.out.println("count is2    "+count+"---"+size+"--"+obj);
            }
            val++;

        }
    }
}
