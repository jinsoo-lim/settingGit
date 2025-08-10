package com.jin01.settingGit.day04_lambda;

import java.util.Arrays;
import java.util.List;

public class TestLambda {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("Banana","Apple","Cherry","Durian");
        fruits.sort((a, b) -> a.length() - b.length());
//        Collections.sort(fruits, (a,b) -> a.compareTo(b));
        System.out.println(fruits);
    }
}
