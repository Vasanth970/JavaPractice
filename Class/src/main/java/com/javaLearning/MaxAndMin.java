package com.javaLearning;

import io.cucumber.java.bs.A;

import java.util.Arrays;

public class MaxAndMin {
    public static void main(String[]args){
        int input[] = {1,2,1,4,1,3,55,98,-2};
      int max = Arrays.stream(input).max().getAsInt();
      int min = Arrays.stream(input).min().getAsInt();
        System.out.println(max);
        System.out.println(min);

    }
}
