package com.yuemeng.ternaryoperator;

import java.util.Scanner;

public class TernaryOperatorText02 {
    public static void main(String[] args) {
        /*
        * 一座寺庙里住着三个和尚
        * 已知他们的身高分别为150cm、210cm、165cm
        * 请用程序实现获取这三个和尚的最高身高。
        */

        // 用三个变量分别表示三个和尚的高度
        int height1 = 150;
        int height2 = 210;
        int height3 = 165;

        // 通过三元运算符获取三个和尚的最高身高
        int max = height1 > height2 ? (height1 > height3 ? height1 : height3) : (height2 > height3 ? height2 : height3);
        System.out.println("三个和尚的最高身高是：" + max);

    }
}
