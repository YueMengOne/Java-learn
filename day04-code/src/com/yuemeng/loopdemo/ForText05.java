package com.yuemeng.loopdemo;

import java.util.Scanner;

public class ForText05 {
    public static void main(String[] args) {
        /*
        * 统计满足条件的数字：
        * 键盘录入两个数字，表示一个范围。
        * 统计这个范围中。
        * 既能被3整除，又能被5整除数字有多少个？
        */

        // 1.创建两个变量存储用户输入的两个数字
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数字：");
        int start = sc.nextInt();
        System.out.println("请输入第二个数字：");
        int end = sc.nextInt();

        // 2.对比用户输入的两个数字，判断哪个数字大哪个数字小。
        // 数字小的赋值给start，数字大的赋值给end
        if (start > end) {
            int temp = start;
            start = end;
            end = temp;
        }

        // 3.使用for循环，遍历start到end的数字
        int count = 0;
        for (int i = start; i <= end; i++) {
            // 4.判断当前数字是否满足条件
            if (i % 3 == 0 && i % 5 == 0) {
                count++;
            }
        }

        // 5.打印结果
        System.out.println("在" + start + "到" + end + "之间，满足条件的数字有" + count + "个");
    }
}
