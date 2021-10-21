package com.belajar;

public class App {
    public static void main(String[] args) throws Exception {
        int a = 1;
        int b = a;

        System.out.println(a + " dan " + b);

        a = 2;

        System.out.println(a + " dan " + b);

        b = a;
        System.out.println(a + " dan " + b);

        a = 4;
        System.out.println(a + " dan " + b);
    }
}
