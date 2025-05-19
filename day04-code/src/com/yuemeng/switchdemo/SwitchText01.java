package com.yuemeng.switchdemo;

import java.util.Scanner;

public class SwitchText01 {
    public static void main(String[] args) {
        /*
        * 运动计划：
        * 键盘录入星期数，显示今天的减肥活动
        *
        * 周一：跑步
        * 周二：游泳
        * 周三：慢走
        * 周四：骑行
        * 周五：拳击
        * 周六：爬山
        * 周日：自由
        */

        // 1.键盘录入星期数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入星期数：");
        int week = sc.nextInt();

        // 2.显示今天的减肥活动
        // 方式 1:
        /*switch (week) {
            case 1:
                System.out.println("跑步");
                break;
            case 2:
                System.out.println("游泳");
                break;
            case 3:
                System.out.println("慢走");
                break;
            case 4:
                System.out.println("骑行");
                break;
            case 5:
                System.out.println("拳击");
                break;
            case 6:
                System.out.println("爬山");
                break;
            case 7:
                System.out.println("自由");
                break;
            default:
                System.out.println("输入有误");
                break;
        }*/

        // 方式 2:
        /*switch (week) {
            case 1 -> {
                System.out.println("跑步");
            }
            case 2 -> {
                System.out.println("游泳");
            }
            case 3 -> {
                System.out.println("慢走");
            }
            case 4 -> {
                System.out.println("骑行");
            }
            case 5 -> {
                System.out.println("拳击");
            }
            case 6 -> {
                System.out.println("爬山");
            }
            case 7 -> {
                System.out.println("自由");
            }
            default -> {
                System.out.println("输入有误");
            }
        }*/

        // 方式 3:
        switch (week) {
            case 1 -> System.out.println("跑步");
            case 2 -> System.out.println("游泳");
            case 3 -> System.out.println("慢走");
            case 4 -> System.out.println("骑行");
            case 5 -> System.out.println("拳击");
            case 6 -> System.out.println("爬山");
            case 7 -> System.out.println("自由");
            default -> System.out.println("输入有误");
        }
    }
}
