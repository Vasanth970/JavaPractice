package org.example;

public class Boolean {
    public static void main (String[]args){
      //A boolean type is declared with the boolean keyword and can only take the values true or false:
        boolean isJavaFun = true;
        boolean isFishTasty = false;
        System.out.println(isJavaFun);
        System.out.println(isFishTasty);
        int x = 9;
        int y = 10;
        int myAge = 25;
        int votingAge = 18;
        System.out.println(x > y);
        System.out.println(x == y);
        if(myAge > votingAge){
            System.out.println("I'm able to vote");
        } else {
            System.out.println("Not able to vote");
        }
    }
}
