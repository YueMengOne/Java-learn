package com.yuemeng.arithmeticoperator;

public class ArithmeticOperatorDemo03 {
    public static void main(String[] args) {
        // ++ 和 --
        int a = 10;

        a++; // a = a + 1;
        System.out.println(a);

        a--; // a = a - 1;
        System.out.println(a);

        ++a; // a = a + 1;
        System.out.println(a);

        --a; // a = a - 1;
        System.out.println(a);

        System.out.println("========================");

        int b = 10;
        int c = b++;
        int d = ++b;

        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
    }
}
