package org.example;

public class Switch {
    public static void main(String[] args) {

        int day = 5;
        switch (day) {

            case 1:
                System.out.println("Day1");
                break;
            case 2:
                System.out.println("Day2");
                break;
            case 3:
                System.out.println("Day3");
                break;
            default:
                System.out.println("No Holiday");
                  /*Instead of writing many if..else statements, you can use the switch statement.
                The switch statement selects one of many code blocks to be executed:
                 The switch expression is evaluated once.
                The value of the expression is compared with the values of each case.
                If there is a match, the associated block of code is executed.
                    The break and default keywords are optional*/

        }
    }
}


