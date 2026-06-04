package com.javaLearning;

import org.openqa.selenium.devtools.v85.systeminfo.SystemInfo;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args){
        int input[] = { 1,22,3,2,4,5,22,1,6};
        Set<Integer> set = new HashSet<>();
        for (int num : input)
            set.add(num);
            System.out.println(set);
    }
}
