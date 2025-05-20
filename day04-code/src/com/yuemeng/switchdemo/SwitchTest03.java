package com.yuemeng.switchdemo;

import java.util.Scanner;

public class SwitchTest03 {
    public static void main(String[] args) {
        /*
        * 用户选择：
        * 假设现在我们拨打了一个机票预定电话。
        * 电话中语音提示：
        * - 1 机票查询
        * - 2 机票预订
        * - 3 机票改签
        * - 4 退出服务
        * - 其他按键也是退出服务。
        *
        * 请使用 Switch 模拟该业务逻辑。
        */

        // 1.键盘录入用户的选择
        Scanner sc = new Scanner(System.in);
        System.out.println("请选择：");
        int choice = sc.nextInt();

        // 2.根据选择做不同的处理
        switch (choice){
            case 1 -> System.out.println("机票查询");
            case 2 -> System.out.println("机票预订");
            case 3 -> System.out.println("机票改签");
            default -> System.out.println("退出服务");
        }
    }
}
