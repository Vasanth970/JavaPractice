package com.javaLearning;

import io.cucumber.java.be.I;
import org.openqa.selenium.devtools.v85.systeminfo.SystemInfo;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class
RemoveDuplicates {
    public static void main(String[] args){
        int input[] = { 1,22,3,2,4,5,22,1,6};
       Set<Integer> duplicate = new HashSet<>();
       Set<Integer> sort = new TreeSet<>();
       for(int num :input){
           duplicate.add(num);
           sort.add(num);
       }
        System.out.println(duplicate);
        System.out.println(sort);
    }
}