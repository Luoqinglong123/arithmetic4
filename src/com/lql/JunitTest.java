package com.lql;

import org.jetbrains.annotations.TestOnly;
import org.junit.Test;

/**
 * 1.1练习题
 *
 * @author LQL
 * @create 2017-09-20 16:11
 **/
public class JunitTest {
    @Test
    public void test1() {
        for3();

    }

    public static String getBinaryString(int param) {
        String res = "";
        for (int i = param; i > 0; i /= 2) {
            res = i % 2 + res;
        }
        return res;
    }

    public static String println(boolean[][] bool) {
        String res = "";
        for (int i = 0; i < bool.length; i++) {
            boolean[] att = bool[i];
            for (int j = 0; j < att.length; j++) {
                if (bool[i][j] == true)
                    System.out.print("* 行：" + i + "列：" + j + "\t");
                else
                    System.out.print("& 行：" + i + "列：" + j + "\t");

            }
        }
        return res;
    }

    public static int[][] exchange(int[][] param) {
        for (int i = 0; i < param.length; i++) {
            int[] att = param[i];
            for (int j = 0; j < att.length; j++) {
                int temp = param[i][j];
                param[i][j] = param[j][i];
                param[j][i] = temp;
            }
        }
        return param;
    }

    public static void for3() {
        int[] a = new int[10];
        for (int i = 0; i < 10; i++)
            a[i] = 9 - i;
        for (int i = 0; i < 10; i++)
            a[i] = a[a[i]];
        for (int i = 0; i < 10; i++)
            System.out.println(i);

    }
}
