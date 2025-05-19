package com.yuemeng.ternaryoperator;

import java.util.Scanner;

public class TernaryOperatorDemo01 {
    public static void main(String[] args) {
        // 使用三元运算符，获取两个数的最大值

        // 键盘录入两个整数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个整数：");
        int a = sc.nextInt();
        System.out.println("请输入第二个整数：");
        int b = sc.nextInt();

        // 使用三元运算符，获取两个数的最大值
        int max = a > b ? a : b;
        System.out.println("两个数中的最大值是：" + max);
    }
}
