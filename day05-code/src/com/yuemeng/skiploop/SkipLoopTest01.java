package com.yuemeng.skiploop;

public class SkipLoopTest01 {
    public static void main(String[] args) {
        // 1.跳过某一次循环
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                // 跳过当前循环，继续下次循环
                continue;
            }
            System.out.println("i=" + i);
        }

        System.out.println("--------------------------------");

        // 2.结束整个循环
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                // 结束整个循环
                break;
            }
            System.out.println("i=" + i);
        }
    }
}
