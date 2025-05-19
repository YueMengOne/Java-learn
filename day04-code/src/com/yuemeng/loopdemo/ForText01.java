package com.yuemeng.loopdemo;

public class ForText01 {
    public static void main(String[] args) {
        // 打印 1-5 和 5-1

        // 1.打印 1-5
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }

        System.out.println("=".repeat(30));

        // 2.打印 5-1
        for (int i = 5; i >= 1; i--) {
            System.out.println(i);
        }
    }
}
