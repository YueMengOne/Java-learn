package com.yuemeng.arithmeticoperator;

import java.util.Scanner;

public class ArithmeticOperatorTest1 {
    public static void main(String[] args) {
        // 键盘录入一个三位数，获取其中的个位，十位，百位

        // 1.键盘录入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个三位数：");
        int number = sc.nextInt();

        int ge = number % 10;
        int shi = number / 10 % 10;
        int bai = number / 100;

        System.out.println("个位：" + ge);
        System.out.println("十位：" + shi);
        System.out.println("百位：" + bai);
    }
}
