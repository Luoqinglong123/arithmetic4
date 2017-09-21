package com.lql;

import java.util.Arrays;

/**
 * 这是二分法查找算法
 *
 * @author LQL
 * @create 2017-09-20 14:26
 **/
public class BinarySearch {
    public static int rank(int[] a, int key) {
        Arrays.sort(a);
        int lo = 0, hi = a.length - 1;
        while (lo <= hi) {
            int mid = (hi+lo) / 2;
            if (key > a[mid]){
                lo = mid + 1;}
           else if (key < a[mid]){
                hi = mid - 1;}
            else
                return mid;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] a = {2, 3, 4, 1, 6, 3, 8};
        System.err.println(rank(a, 6));
    }


}
