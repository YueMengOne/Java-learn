package com.yuemeng.text;

public class IfText02 {
    public static void main(String[] args) {
        /*
        * 题目 4:
        * 某商场购物可以打折，具体规则如下：
        * - 普通顾客购不满100元不打折，满100元打9折；
        * - 会员购物不满200元打8折，满200元打7.5折；
        * - 不同打折规则不累加计算。
        *
        * 请根据此优惠计划进行购物结算。
        *
        * 键盘录入
        * - 顾客的类别（0表示普通顾客，1表示会员）
        * - 购物的折前金额（整数即可）
        *
        * 输出
        * - 应付金额（小数类型）。
        */

        // 1. 创建一个0-999之间的随机整数，赋予一个变量，当作购物商品的总价
        int price = (int)(Math.random() * 1000);
        System.out.println("购物商品的总价：" + price);

        // 2. 创建一个0或1的随机数，当作用户的会员级别
        int level = (int)(Math.random() * 2);
        System.out.println("会员级别：" + level);

        // 3. 根据用户输入的会员级别，计算出实际支付的钱
        double priceNum = 0;
        if (level == 0) {
            if (price < 100) {
                priceNum = price;
            }
            else {
                priceNum = price * 9.0 / 10.0;
            }
        }
        else {
            if (price < 200) {
                priceNum = price * 8.0 / 10.0;
            }
            else {
                priceNum = price * 7.5 / 10.0;
            }
        }

        // 4. 输出
        System.out.println("应付金额：" + priceNum);
    }
}
