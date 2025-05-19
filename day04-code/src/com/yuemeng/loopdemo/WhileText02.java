package com.yuemeng.loopdemo;

import java.util.Scanner;

public class WhileText02 {
    public static void main(String[] args) {
        /*
        * 回文数：
        * 如果 x 是一个回文数则输出 true，否则输出 false
        */

        // 1.定义一个变量获取用户输入的数字
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数字：");
        int x = sc.nextInt();

        // 2.定义一个变量，用来存储翻转后的数字
        int num = 0;

        // 3.定义一个变量，用来存储用户输入的数字
        int temp = x;

        // 4.使用while循环，将 x 翻转
        while (temp != 0) {
            // 5.从右往左获取每一位数字
            int ge = temp % 10;
            // 6.记录下获取到的数字
            num = num * 10 + ge;
            // 7.修改x的值
            temp /= 10;
        }

        // 8.判断 num 是否和 x 相等
        if (num == x) {
            System.out.println(temp + "是回文数");
        } else {
            System.out.println(temp + "不是回文数");
        }
    }
}
