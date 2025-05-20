package com.yuemeng.test;

import java.util.Scanner;

public class IfTest01 {
    public static void main(String[] args) {
        /*
        * 题目 1:
        * 李雷想买一个价值7988元的新手机
        * 她的旧手机在二手市场能卖1500元
        * 而手机专卖店推出以旧换新的优惠
        * 把她的旧手机交给店家，新手机就能够打8折优惠。
        * 为了更省钱，李雷要不要以旧换新？
        * 请在控制台输出。
        */

        // 1. 定义变量记录手机价格
        double price = 7988;
        double oldPhonePrice = 1500;

        // 2. 判断是否以旧换新
        // 2.1 判断专卖店回收价格是否大于旧手机价格
        if ((price * 0.2) - oldPhonePrice > 0) {
            System.out.println("以旧换新");
        }else {
            System.out.println("不要以旧换新");
        }

        System.out.println("=".repeat(30));

        /*
        * 题目 2:
        * 让用户依次录入三个整数
        * 求出三个数中的最小值，并打印到控制台。
        */

        // 1. 定义变量保存用户输入的数字
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数字：");
        int num1 = sc.nextInt();
        System.out.println("请输入第二个数字：");
        int num2 = sc.nextInt();
        System.out.println("请输入第三个数字：");
        int num3 = sc.nextInt();

        // 2. 判断三个数中的最小值
        int min = num1 < num2 ? (num1 < num3 ? num1 : num3) : (num2 < num3 ? num2 : num3);
        System.out.println(min);

        System.out.println("=".repeat(30));

        /*
        * 题目 3:
        * 某银行推出了整存整取定期储蓄业务
        * 其存期分为一年、两年、三年、五年到期凭存单支取本息。
        * 存款年利率表如下：
        *
        * - 存期 年利率（%）
        * - 一年 2.25
        * - 两年 2.7
        * - 三年 3.25
        * - 五年 3.6
        *
        * 请存入一定金额（1000起存），存一定年限（四选一），计算到期后得到的本息总额。
        * 提示：
        * - 存入金额和存入年限均由键盘录入
        * - 本息计算方式：本金 + 本金 × 年利率 × 年限
        */

        // 1. 定义变量保存用户输入的存款金额和存款年限
        System.out.println("请输入存款金额：");
        int money = sc.nextInt();
        System.out.println("请输入存款年限：");
        int year = sc.nextInt();

        // 2. 用 if 判断年份并适配对应的年利率
        double rate = 0;
        if (year == 1) {
            rate = 2.25;
        }else if (year == 2) {
            rate = 2.7;
        }else if (year == 3) {
            rate = 3.25;
        }else if (year == 5) {
            rate = 3.6;
        }else {
            System.out.println("输入的存款年份错误！");
        }

        // 3. 计算本息总额
        double total = money + money * rate * year;
        System.out.println("本息总额：" + total);

        System.out.println("=".repeat(30));

    }
}
