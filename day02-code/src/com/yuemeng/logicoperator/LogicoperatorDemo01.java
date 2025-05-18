package com.yuemeng.logicoperator;

public class LogicoperatorDemo01 {
    public static void main(String[] args) {
        // 1.& 并且
        // 两边值都为true，结果为true
        System.out.println(true & true);
        System.out.println(true & false);
        System.out.println(false & true);
        System.out.println(false & false);

        System.out.println("====================================");

        // 2.| 或者
        // 两边值有一个为true，结果为true
        System.out.println(true | true);
        System.out.println(true | false);
        System.out.println(false | true);
        System.out.println(false | false);

        System.out.println("====================================");

        // 3.^ 异或
        // 两边值不同，结果为true
        System.out.println(true ^ true);
        System.out.println(true ^ false);
        System.out.println(false ^ true);
        System.out.println(false ^ false);

        System.out.println("====================================");

        // 4.! 非
        System.out.println(!true);
        System.out.println(!false);
    }
}
