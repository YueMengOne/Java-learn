package com.yuemeng.test;

import java.util.Scanner;

public class IfTest03 {
    public static void main(String[] args) {
        /*
        * 2019年1月1日起，国家推出新的个人所得税政策，起征点上调值5000元。
        * 也就是说税前工资扣除三险一金（三险一金数额假设是税前工资的10%）后如果不足5000元
        * 则不交税。如果大于5000元，那么大于5000元的部分按梯度交税，
        * 具体梯度比例如下：
        * - 0 ~ 3000元的部分，交税3%
        * - 3000 ~ 12000元的部分，交税10%
        * - 12000 ~ 25000的部分，交税20%
        * - 25000 ~ 35000的部分，交税25%
        * - 35000 ~ 55000的部分，交税30%
        * - 55000 ~ 80000的部分，交税35%
        * - 超过80000的部分，交税45%
        *
        * 比如：黑马某学员入职一家企业后，税前工资是15000
        * 则他每月该交个税的部分是15000-1500-5000=8500元，
        * 个税缴纳数额是3000×3%+5500×10%=640元。
        * 税后工资12860元。
        *
        * 请完成一个个税计算程序，在用户输入税前工资后
        * 计算出他对应的纳税数额，以及税后工资为多少？
        */

        // 1.定义一个变量，用来保存用户输入的税前工资
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入税前工资：");
        int xqg = sc.nextInt();

        // 2.计算三险一金的额
        double sxj = xqg * 0.1;

        // 3.计算个人所得税
        // 3.1.定义一个变量，用来保存个税
        double gs = 0;      // 个税
        double nsNum = 0;   // 还未计算纳税的钱
        // 3.2.判断交完三险一金后的税前工资是否大于5000元
        // 如果大于5000元，则继续判断，否则直接打印个税为0
        if (xqg - sxj >= 5000) {
            nsNum = xqg - sxj - 5000;
            // 需纳税部分金额小于等于3000元
            if (nsNum <= 3000) {
                gs = nsNum * 0.03;
            }
            // 需纳税部分金额大于3000元，小于等于12000元
            else if (nsNum <= 12000) {
                gs = 3000 * 0.03 + (nsNum - 3000) * 0.1;
            }
            // 需纳税部分金额大于12000元，小于等于25000元
            else if (nsNum <= 25000) {
                gs = 3000 * 0.03 + 9000 * 0.1 + (nsNum - 12000) * 0.2;
            }
            // 需纳税部分金额大于25000元
            else {
                // 先计算小于25000的部分
                gs = 3000 * 0.03 + 9000 * 0.1 + (nsNum - 12000) * 0.2;
                // 再计算大于25000的部分
                if (nsNum <= 35000) {
                    gs += (nsNum - 25000) * 0.25;
                }
                // 大于35000
                else if (nsNum <= 55000) {
                    gs += (nsNum - 25000) * 0.25 + (nsNum - 35000) * 0.3;
                }
                // 大于55000
                else if (nsNum <= 80000) {
                    gs += (nsNum - 25000) * 0.25 + (nsNum - 35000) * 0.3 + (nsNum - 55000) * 0.35;
                }
                // 大于80000
                else {
                    // 先计算小于80000的部分
                    gs += (nsNum - 25000) * 0.25 + (nsNum - 35000) * 0.3 + (nsNum - 55000) * 0.35;
                    if (nsNum > 80000) {
                        gs += (nsNum - 80000) * 0.45;
                    }
                }
            }

        }

        // 4.打印个税和税后工资
        System.out.println("个税为：" + gs);
        System.out.println("税后工资为：" + (xqg - sxj - gs));
    }
}
