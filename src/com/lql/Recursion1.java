package com.lql;

/**
 * 这是个递归小练习
 *
 * @author LQL
 * @create 2017-09-21 15:13
 **/
public class Recursion1 {
    public static void main(String[] args) {
        System.out.println( CommomDivisor(105,24));
    }
    //普通递归
    public static int myStery(int a, int b) {
        if (b == 0) return 0;
        if (b % 2 == 0) return myStery(a + a, b / 2);
        return myStery(a + a, b / 2) + a;
    }
    //欧几里得算法
    public static int CommomDivisor(int x, int y) {
        if (x == 1 || y == 1)
            return 1;
        if (x < y) {
            int temp = x;
            x=y;
            y=temp;
        }
        if(x%y==0)
            return y;
        else {
            x=x%y;
            System.out.println("x="+x+",y="+y);
            return CommomDivisor(x,y);
        }

    }
}
