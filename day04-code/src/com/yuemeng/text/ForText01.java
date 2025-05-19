package com.yuemeng.text;

import java.util.Scanner;

public class ForText01 {
    public static void main(String[] args) {
        /*
        * 键盘录入两个数字number1和number2表示一个范围
        * 求这个范围之内的数字和。
        */

        // 1.键盘录入两个数字number1和number2表示一个范围
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数字：");
        int number1 = sc.nextInt();
        System.out.println("请输入第二个数字：");
        int number2 = sc.nextInt();

        // 2.判断number1和number2的大小关系
        if (number1 > number2) {
            int temp = number1;
            number1 = number2;
            number2 = temp;
        }

        // 3.求这个范围之内的数字和
        int sum = 0;
        for (int i = number1; i <= number2; i++) {
            sum += i;
        }
        System.out.println("sum = " + sum);
    }
}
