package com.yuemeng.Variable;

public class ab_VariableTest01 {
    // 主入口
    public static void main(String[] args) {
        // 一开始没有乘客
        int count = 0;
        // 第一站：上去一位乘客
        count = count + 1;
        // 第二站：上去两位乘客，下来一位乘客
        count = count + 2 - 1;
        // 第三站：上去两位乘客，下来一位乘客
        count = count + 2 - 1;
        // 第四站：下来一位乘客
        count = count - 1;
        // 第五站：上去一位乘客
        count = count + 1;
        // 请问：到了终点站有多少位乘客
        System.out.println("到了终点站还有：" + count + " 名乘客");
    }
}
