package com.yuemeng.test;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        /*
        * 题目 1:
        * 身高是具有遗传性的，子女的身高和父母的身高有一定的关系。
        * 假定，父母和子女的身高遗传关系如下
        * 儿子身高（厘米）＝(父亲身高＋母亲身高) ×1.08÷2
        * 女儿身高（厘米）＝(父亲身高×0.923＋母亲身高) ÷2
        * 现有父亲身高177CM,母亲身高165CM。求子女身高分别预计为多少？
        */

        // 1.创建两个变量存储父母的身高
        int fatherHeight = 177;
        int motherHeight = 165;

        // 2.使用算数运算符，计算儿子和女儿的身高
        double sonHeight = (fatherHeight + motherHeight) * 1.08 / 2;
        double daughterHeight = (fatherHeight * 0.923 + motherHeight) / 2;

        // 3.输出
        System.out.println("题目（1）：");
        System.out.println("儿子身高：" + sonHeight);
        System.out.println("女儿身高：" + daughterHeight);

        System.out.println("======================================");

        /*
        * 题目 2:
        * 红茶妹妹有21元钱，她攒了几天钱之后自己的钱比原来的两倍还多三块。
        * 绿茶妹妹有24元钱，她攒了几天钱之后自己的钱正好是原来的两倍。
        * 那么红茶和绿茶现在的钱一样多，请问对么？
        */

        // 1.创建两个变量存储钱数
        int redTea = 21;
        int greenTea = 24;

        // 2.使用算数运算符和赋值运算符，计算两个茶妹妹现在的钱数
        redTea = redTea + 2 * 3;
        greenTea = greenTea + 2 * 2;

        // 3.使用比较运算符，判断两个茶妹妹现在的钱数是否相等

        // 4.输出
        System.out.println("题目（2）：");
        System.out.println("红茶和绿茶现在的钱数" + (redTea == greenTea? "":"不") + "相等");

        System.out.println("======================================");

        /*
        * 题目 3:
        * 某小伙想定一份外卖，商家的优惠方式如下：
        *
        * - 鱼香肉丝单点24元
        * - 油炸花生米单点8元
        * - 米饭单点3元
        *
        * - 订单满30元8折优惠
        * - 鱼香肉丝优惠价16元
        * - 但是优惠价和折扣不能同时使用。
        *
        * 那么这个小伙要点这三样东西，最少要花多少钱？
        */

        // 1.创建变量存储价格
        int fish = 24;
        int pea = 8;
        int rice = 3;

        // 2.使用算数运算符计算不使用优惠时的总价
        int total = fish + pea + rice;

        // 3.使用三元运算符，判断总价是否满足打折条件，并求出总价
        double fullReduction = total >= 30 ? (int)(total * 0.8) : total;

        // 4.使用算数运算符，计算使用优惠价时的价格
        double discount = total - fish + 16;

        // 5.使用三元运算符，判断最终更合算的购买方式和花费
        double finalPrice = fullReduction > discount ? discount : fullReduction;
        System.out.println("题目（3）：");
        System.out.println("外卖共计：" + finalPrice);
        System.out.println("使用的优惠方式：" + (fullReduction > discount ? "30元8折优惠" : "商品优惠价"));

        System.out.println("======================================");

        System.out.println("题目（4）：4.0");

        System.out.println("======================================");

        System.out.println("题目（5）：TomasZhang");

        System.out.println("======================================");

        /*
        * 题目 6:
        * 数字6是一个真正伟大的数字，键盘录入两个整数。
        * 如果其中一个为6，最终结果输出true。
        * 如果它们的和为6的倍数。最终结果输出true。
        * 其他情况都是false。
        */

        // 1.创建两个变量存储键盘录入的两个整数
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个整数：");
        int num1 = sc.nextInt();
        System.out.println("请输入第二个整数：");
        int num2 = sc.nextInt();

        // 2.使用逻辑运算符，判断其中一个为6，最终结果输出true。
        boolean flag = num1 == 6 || num2 == 6;

        // 3.使用算数运算符和逻辑运算符，判断它们的和为6的倍数。最终结果输出true。
        flag = flag || (num1 + num2) % 6 == 0;

        // 4.通过三元运算符，控制最终输出结果
        System.out.println("题目（6）：");
        System.out.println(flag? "true" : "false");

        System.out.println("======================================");

        /*
        * 题目 7:
        * 键盘录入一个三位数，求这个三位数每一位的数字和。
        *
        * 举例：
        * - 键盘录入123
        * - 那么每一位数字相加为：1 + 2 + 3
        * - 和为：7。
        */

        // 1.创建变量存储键盘录入的三位数
//        Scanner scNum = new Scanner(System.in);
        System.out.println("请输入一个三位数：");
        int num = sc.nextInt();

        // 2.使用取余，求每一位数字
        // - 个位
        int ge = num % 10;
        // - 十位
        int shi = num / 10 % 10;
        // - 百位
        int bai = num / 100;

        // 3.使用加法，求每一位数字相加
        int sum = ge + shi + bai;

        // 4.输出
        System.out.println("题目（7）：");
        System.out.println("每一位数字相加为：" + sum);
    }
}
