package com.yuemeng.ifdemo;

import java.util.Scanner;

public class IfTest02 {
    public static void main(String[] args) {
        /*
        * 商品付款：
        * 假设，用户在超市实际购买，商品总价为：600元。
        * 键盘录入一个整数表示用户实际支付的钱。
        * 如果付款大于等于600，表示付款成功。否则付款失败。
        */

        // 1. 创建一个变量，存储用户实际支付的钱
        Scanner sc = new Scanner(System.in);
        int money = sc.nextInt();

        // 2. 判断用户是否付款成功
        if (money >= 600) {
            System.out.println("恭喜你，付款成功！");
        }
        else {
            System.out.println("很遗憾，付款失败！");
        }
    }
}
