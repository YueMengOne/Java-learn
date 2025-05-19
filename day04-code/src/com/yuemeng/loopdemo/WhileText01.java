package com.yuemeng.loopdemo;

public class WhileText01 {
    public static void main(String[] args) {
        /*
        * 世界最高山峰是珠穆朗玛峰（8844.43米=8844430毫米）
        * 假如我有一张足够大的纸，它的厚度是0.1毫米。
        * 请问，我折叠多少次，可以折成珠穆朗玛峰的高度？
        */

        // 1.定义两个变量，用来记录纸张的高度和折叠次数
        double paperHeight = 0.1;
        int count = 0;

        // 2.开始折叠
        while (paperHeight < 8844430.0){
            paperHeight *= 2;
            count++;
        }

        // 3.打印结果
        System.out.println("折叠了" + count + "次，可以折成珠穆朗玛峰的高度");
    }
}
