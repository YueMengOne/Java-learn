package com.yuemeng.logicoperator;

public class LogicoperatorDemo02 {
    public static void main(String[] args) {
        // 1.&& 逻辑与
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println(false && false);

        System.out.println("====================================");

        // 2.|| 逻辑或
        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || true);
        System.out.println(false || false);

        System.out.println("====================================");

        // 3.短路逻辑运算具有短路效果
        // 当左边的表达式能确定最终结果时，右边的表达式不再计算
        int a = 10;
        int b = 20;
        boolean result = 11 < 5 && ++b < 5;
        System.out.println(result);
        System.out.println(a);
        System.out.println(b);
    }
}
