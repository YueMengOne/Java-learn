package com.yuemeng.switchdemo;

public class SwitchDemo01 {
    public static void main(String[] args) {
        // 1.创建一个变量。记录我心里想吃的面
        String noodles = "陕西油泼面";

        // 2.创建switch语句，进行匹配
        switch (noodles) {
            case "兰州拉面":
                System.out.println("兰州拉面真好吃");
                break;
            case "陕西油泼面":
                System.out.println("陕西油泼面真好吃");
                break;
            case "北京杂酱面":
                System.out.println("北京杂酱面真好吃");
                break;
            case "武汉热干面":
                System.out.println("武汉热干面真好吃");
                break;
            default:
                System.out.println("吃方便面");
                break;
        }
    }
}
