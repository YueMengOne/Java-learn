package com.yuemeng.ifdemo;

public class IfTest01 {
    public static void main(String[] args) {
        /*
        * 自动驾驶：
        * 汽车无人驾驶会涉及到大量的判断
        * 当汽车行驶的时候遇到了红绿灯，就会进行判断
        * - 如果红灯亮，就停止
        * - 如果黄灯亮，就减速
        * - 如果绿灯亮，就行驶
        */

        // 创建三个布尔型变量，记录灯灯状态
        boolean isLightRed = true;
        boolean isLightYellow = false;
        boolean isLightGreen = false;

        // 判断信号灯
        if (isLightRed) {
            System.out.println("停止");
        } else if (isLightYellow) {
            System.out.println("减速");
        } else if (isLightGreen) {
            System.out.println("行驶");
        } else {
            System.out.println("未能识别信号灯");
        }
    }
}
