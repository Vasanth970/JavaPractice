package com.javaLearning;

import io.cucumber.java.bs.A;

import java.util.Arrays;

public class SumOfInput {
    public static void main(String args[]){
        int input[] = {1,2,33,67,3,1,9,6,5,5,4,9,6};
        int sum = Arrays.stream(input).sum();
        int sumUnique = Arrays.stream(input).distinct().sum();
        System.out.println(sum);
        System.out.println(sumUnique);

    }
}
