package com.yuemeng.switchdemo;

import java.util.Scanner;

public class SwitchText02 {
    public static void main(String[] args) {
        /*
        * 休息日和工作日：
        * 键盘录入一个星期数，判断是休息日还是工作日
        * - 1-5为工作日，6-7为休息日
        */

        // 1.键盘录入星期数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入星期数：");
        int week = sc.nextInt();

        // 2.判断是工作日还是休息日
        switch (week){
            case 1,  2, 3, 4, 5 -> System.out.println("工作日");
            case 6, 7 -> System.out.println("休息日");
            default -> System.out.println("输入有误");
        }
    }
}
