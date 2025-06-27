package org.example;

public class DoWhile {
    public static void main(String[] args) {
       int i = 10;
               do{
                   System.out.println(i);
                   i ++;
               } while (i <  5);

               //the variable i starts at 10, so the condition i < 5 is false immediately -
        //yet the do/while loop still runs once:
    }
}
