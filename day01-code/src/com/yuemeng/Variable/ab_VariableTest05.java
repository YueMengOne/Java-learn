package com.yuemeng.Variable;

public class ab_VariableTest05 {
    // 主入口
    public static void main(String[] args) {
        // 小明账户bankBalance初始值有500.00元
        double bankBalance = 500.00;
        // 存入250元
        bankBalance = bankBalance + 250.00;
        // 支出100元
        bankBalance = bankBalance - 100.00;
        // 打印剩余存款
        System.out.println("小明账户的存款有" + bankBalance + "元");
    }
}