package com.yuemeng.ifdemo;

import java.util.Scanner;

public class IfTest05 {
    public static void main(String[] args) {
        /*
        * 商品的价格：
        * 商场都会有VIP的会员制，根据不同的会员会有不同的折扣。
        * 假设商品总价为1000。
        * 键盘录入会员级别，并计算出实际支付的钱。
        * 会员1级：打9折。
        * 会员2级：打8折。
        * 会员3级：打7折。
        * 非会员：不打折，要打也是打骨折。
        */

        // 1.创建一个变量，记录商品的总价
        int price = 1000;

        // 2. 创建一个变量，存储用户输入的会员级别
        Scanner sc = new Scanner(System.in);
        int level = sc.nextInt();

        // 3. 根据用户输入的会员级别，计算出实际支付的钱并输出
        if (level == 0){
            System.out.println("实际支付：" + price);
        }else if (level == 1) {
            System.out.println("实际支付：" + price * 9 / 10);
        }
        else if (level == 2) {
            System.out.println("实际支付：" + price * 8 / 10);
        }
        else if (level == 3) {
            System.out.println("实际支付：" + price * 7 / 10);
        }
        else {
            System.out.println("请重新输入会员级别！");
        }
    }
}
