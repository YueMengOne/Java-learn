package com.yuemeng.ifdemo;

import java.util.Scanner;

public class IfText03 {
    public static void main(String[] args) {
        /*
        * 影院选座：
        * 假设某影院售卖了i00张票，票的序号为1~100。
        * 其中奇数票号坐左侧，偶数票号坐右侧。
        * 键盘录入一个整数表示电影票的票号。
        * 根据不同情况，给出不同的提示： 如果票号为奇数，那么打印坐左边
        * 如果票号为偶数，那么打印坐右边。
        */

        // 1.创建一个变量，用于接收用户输入的票号
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入电影票的票号：");
        int ticketNumber = sc.nextInt();

        // 2.判断票是否有效
        if (ticketNumber >= 1 && ticketNumber <= 100) {
            if (ticketNumber % 2 == 1) {
            System.out.println("请坐左侧");
        } else {
            System.out.println("请坐右侧");
        }

        } else {
            System.out.println("无效的票号");
        }
    }
}
