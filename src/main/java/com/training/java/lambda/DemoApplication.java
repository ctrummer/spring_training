package com.training.java.lambda;

public class DemoApplication {

    public static void main(String[] args) {

        String outString = "Hello World - how are you";
        welcome(outString);
        String fine = "Thx fine";
        welcome(fine);
    }

    private static void welcome(String outString) {
        System.out.println(outString);
    }
}
