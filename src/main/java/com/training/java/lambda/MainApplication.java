package com.training.java.lambda;

import java.text.Collator;
import java.util.Arrays;
import java.util.Comparator;

import static java.text.Collator.*;

public class MainApplication {
    public static void main(String[] args) {
        System.out.println("Hello world....");

        String[] words = {"M", "\nSkyfall", "Q", "\t\tAdele\t"};
//        Arrays.sort(words, Collator.getInstance());
        Arrays.sort(words, (String s1, String s2) -> { return s1.trim().compareTo(s2.trim()); });
        System.out.println(Arrays.toString(words));

    }

//    private static class getInstance {
//    }
}
