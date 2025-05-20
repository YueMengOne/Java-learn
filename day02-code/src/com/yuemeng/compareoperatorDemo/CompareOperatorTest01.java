package com.yuemeng.compareoperatorDemo;

import java.util.Scanner;

public class CompareOperatorTest01 {
    public static void main(String[] args) {
        /*
        * 您和您的约会对象在餐厅里面正在约会。
        * 键盘录入两个整数，表示你和你约会对象衣服的时髦度。
        * （手动录入0~10之间的整数，不能录其他）
        * 如果你的时髦程度大于你对象的时髦程度，相亲就成功，输出true。
        * 否则输出false。
        */

        // 1. 键盘录入两个整数，表示你和你约会对象衣服的时髦度。
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你的时髦程度：");
        int my = scanner.nextInt();
        System.out.println("请输入你的对象时髦程度：");
        int you = scanner.nextInt();

        // 2. 比较两个整数的大小
        boolean result = my > you;

        // 3. 输出结果
        System.out.println(result);
    }
}
