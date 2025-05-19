package com.yuemeng.ifdemo;

import java.util.Scanner;

public class IfText04 {
    public static void main(String[] args) {
        /*
        * 小明的礼物：
        * 根据不同的分数送不同的礼物。
        * - 如果是95~100分，送自行车一辆
        * - 如果是90~94分，游乐场玩一天
        * - 如果是80~89分，送变形金刚一个
        * - 如果是80分以下，揍一顿：
        */

        // 1.创建一个变量，用于接收小明的考试成绩
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入小明考试成绩：");
        int score = sc.nextInt();

        // 对异常成绩处理
        if (score >= 0 && score <= 100) {
            // 2.判断小明成绩，并送礼物
            if (score >= 95) {
                System.out.println("送自行车一辆");
            } else if (score >= 90) {
                System.out.println("游乐场玩一天");
            } else if (score >= 80) {
                System.out.println("送变形金刚一个");
            } else {
                System.out.println("成绩太差，揍一顿");
            }
            return;
        } else {
            // 输入的成绩不合法
            System.out.println("成绩异常，请重新输入");
        }



    }
}
