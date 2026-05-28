package com.javaLearning;

public class ReverseString {
    public static void main(String args[]) {
        String name = "Vasanth";
        String reverse1 = new StringBuilder(name).reverse().toString();
        System.out.println(reverse1);
    }
}
