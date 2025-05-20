package com.yuemeng.ternaryoperator;

import java.util.Scanner;

public class TernaryOperatorTest01 {
    public static void main(String[] args) {
        /*
        * 动物园里有两只老虎，体重分别通过键盘录入获得，
        * 请用算法实现，判断两只老虎的体重是否相同
        */

        // 键盘录入两只老虎的体重
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入第一只老虎的体重：");
        int weight1 = scanner.nextInt();
        System.out.println("请输入第二只老虎的体重：");
        int weight2 = scanner.nextInt();

        // 通过三元运算符判断两只老虎的体重是否相同
        String result = weight1 == weight2 ? "两只老虎的体重相同" : "两只老虎的体重不相同";
        System.out.println(result);
    }
}
