package com.jin01.settingGit;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class TestLambda {
    public static void main(String[] args) {
        List<String> fruits = Arrays.asList("Banana","Apple","Cherry","Durian");
        Collections.sort(fruits, (a,b) -> a.length()-b.length());
//        Collections.sort(fruits, (a,b) -> a.compareTo(b));
        System.out.println(fruits);
    }
}
