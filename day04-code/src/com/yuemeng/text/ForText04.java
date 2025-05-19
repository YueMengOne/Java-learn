package com.yuemeng.text;

import java.util.Scanner;

public class ForText04 {
    public static void main(String[] args) {
        /*
        * 需求：
        * 给你一个整数 x
        * 如果 x 是一个回文整数，打印 true ，否则，返回 false
        *
        * 解释：
        * 回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
        *
        * 例如:
        * 121 是回文，而 123 不是。
        */

        // 1. 获取用户输入的整数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int x = sc.nextInt();

        // 2.创建一个临时变量，用于翻转整数
        int temp = x;

        // 3.创建一个变量，用于保存翻转后的整数
        int num = 0;

        // 4.开始翻转整数
        while (temp != 0){
            // 4.1 获取当前数字的个位
            int ge = temp % 10;
            // 4.2 将个位加到num上
            num = num * 10 + ge;
            // 4.3 抹掉个位数字
            temp /= 10;
        }

        // 5.判断是否是回文整数
        if (x == num){
            System.out.println("回文整数");
        } else {
            System.out.println("非回文整数");
        }
    }
}
