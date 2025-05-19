package com.yuemeng.text;

import java.util.Scanner;

public class ForText05 {
    public static void main(String[] args) {
        /*
        * 给定两个整数，被除数dividend和除数divisor（都是正数，且不超过int的范围） 。
        * 将两数相除，要求不使用乘法、除法和 % 运算符。
        * 得到商和余数。
        */

        // 1. 键盘录入两个整数，被除数和除数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入被除数：");
        int dividend = sc.nextInt();
        System.out.println("请输入除数：");
        int divisor = sc.nextInt();

        // 2. 定义变量保存商和余数
        int quotient = 0;
        int remainder = 0;

        // 3. 循环相减，直到被除数小于除数
        while (dividend >= divisor) {
            dividend -= divisor;
            quotient++;
        }

        // 4. 输出商和余数
        System.out.println("商：" + quotient);
        System.out.println("余数：" + dividend);
    }
}
