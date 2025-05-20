package com.yuemeng.Scanner;// 导包
import java.util.Scanner;

public class ac_ScannerTest01 {
    public static void main(String[] args) {
        // 创建对象
        Scanner sc = new Scanner(System.in);
        // 接收数据
        System.out.println("请输入第一个整数：");
        int i = sc.nextInt();

        System.out.println("请输入第二个整数：");
        int j = sc.nextInt();

        System.out.println("i + j = " + (i + j));
    }
}