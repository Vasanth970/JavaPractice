package org.example;

public class Loops {
    public static void main(String[] args) {
        int dice = 1;
        while (dice <= 6) {
            if (dice < 6) {
                System.out.println("Fail");
            } else {
                System.out.println("Pass");
            }
            dice = dice + 1;
            //If the loop passes the values ranging from 1 to 5, it prints "Fail". Whenever it passes the value 6, it prints "Pass".
        }
    }
}