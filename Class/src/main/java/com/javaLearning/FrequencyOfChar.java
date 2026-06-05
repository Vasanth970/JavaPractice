package com.javaLearning;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class FrequencyOfChar {
    public static void main(String []args){

        String name = "Vasanth";
        Map<Character, Integer> freq = new HashMap<>();
        for(char c : name.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
           // freq.put(c,freq.getOrDefault(c, 0)+ 1 );
        }
        System.out.println(freq);

    }
}
