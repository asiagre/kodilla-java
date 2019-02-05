package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args) {
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if(result.equals("theForumUser")) {
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        System.out.println("Test - pierwszy test jednostkowy:");

        Calculator calculator = new Calculator();

        int resultOfAdding = calculator.add(4, 5);

        int resultOfSubtraction = calculator.subtract(6, 3);

        System.out.print("Adding testing: ");

        if(resultOfAdding == (4 + 5)) {
            System.out.println("OK");
        } else {
            System.out.println("Error!");
        }

        System.out.print("Subtraction testing: ");

        if(resultOfSubtraction == (6 - 3)) {
            System.out.println("OK");
        } else {
            System.out.println("Error!");
        }

    }
}
