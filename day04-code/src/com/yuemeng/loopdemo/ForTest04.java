package com.yuemeng.loopdemo;

public class ForTest04 {
    public static void main(String[] args) {
        /*
        * 求和:
        * 在实际开发中，如果要获取一个范围中的每一个数据时，也会用到循环
        * 比如：求 1-100 之间的偶数和
        */

        // 定义一个变量，用来记录和
        int sum = 0;

        // 使用 for 循环求和
        for (int i = 1; i <= 100; i++){
            // 判断当前 i 是不是偶数
            if (i % 2 == 0){
                sum += i;
            }
        }

        // 打印求和的结果
        System.out.println(sum);
    }
}
