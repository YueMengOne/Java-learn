package com.yuemeng.loopdemo;

public class ForText02 {
    public static void main(String[] args) {
        /*
        * 断线重连:
        * 玩游戏的时候，如果网不好那么会经常断线重连。
        * 那么断线重连这个业务逻辑就需要重复执行。
        * 假设现在公司要求，断线重连的业务逻辑最多只写5次。
        * 请用代码实现。
        *
        * 备注：
        * - 断线重连的业务逻辑可以用输出语句替代。
        */

        for(int i = 1; i <= 5; i++){
            System.out.println("断线重连次数：" + i + "次");
        }
    }
}
