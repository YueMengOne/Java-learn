package com.yuemeng.logicoperator;

import java.util.Scanner;

public class LogicoperatorTest01 {
    public static void main(String[] args) {
        /*
        * 数字 6 是一个真正伟大的数字，键盘录入两个整数。
        * 如果其中一个为6，最终结果输出true。
        * 如果它们的和为6的倍数。最终结果输出true。
        * 其他情況都是false。
        */

        // 键盘录入两个整数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个整数：");
        int num1 = sc.nextInt();
        System.out.println("请输入第二个整数：");
        int num2 = sc.nextInt();

        // 判断
        boolean flag = (num1 == 6) || (num2 == 6) || ((num1 + num2) % 6 == 0);

        // 输出
        System.out.println(flag);
    }
}
