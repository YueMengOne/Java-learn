package com.yuemeng.ifdemo;

import java.util.Scanner;

public class IfDemo01 {
    public static void main(String[] args) {
        // 键盘录入女婿酒量，如果大于 2 斤，老丈人给出回应，反之不回应

        // 1. 创建一个变量输入酒量
        Scanner sc = new Scanner(System.in);
        int wine = sc.nextInt();

        // 2. 判断酒量是否大于 2 斤
        if (wine > 2) {
            System.out.println("小伙子，你酒量真好！");
        }
    }
}
