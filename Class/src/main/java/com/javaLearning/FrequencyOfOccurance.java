package com.javaLearning;

import java.util.HashMap;
import java.util.Map;

public class FrequencyOfOccurance {
public static void main(String[] args){
    int input[] = {1,2,1,3,2,3,55,1};
    Map<Integer,Integer> freq = new HashMap<>();
    {
        for (int num : input) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
             }
        System.out.println(freq);
        }
    }
}
