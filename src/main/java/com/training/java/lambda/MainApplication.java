package com.training.java.lambda;

import java.text.Collator;
import java.util.Arrays;
import java.util.Comparator;

import static java.text.Collator.*;

public class MainApplication {
    public static void main(String[] args) {
        String helloWorldStr = "Hello world....";
        System.out.println(helloWorldStr);

        String[] words = {"M", "\nSkyfall", "Q", "\t\tAdele\t"};
//        Arrays.sort(words, Collator.getInstance());
        Arrays.sort(words, Comparator.comparing(String::trim));
        System.out.println(Arrays.toString(words));

    }

//    private static class getInstance {
//    }
}
