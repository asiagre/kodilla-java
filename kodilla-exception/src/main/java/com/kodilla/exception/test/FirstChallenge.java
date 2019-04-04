package com.kodilla.exception.test;

public class FirstChallenge {

    public double divide(double a, double b) {
        double result = 0.0;
        try {
            if(b == 0.0) throw new ArithmeticException();
            else result = a / b;
        } catch (ArithmeticException e) {
            System.out.println("You cannot divide by zero! Error: " + e);
        } finally {
            System.out.println("The method \"divide\" has ended.");
        }
        return result;
    }

    /**
     * This main can throw an ArithmeticException!!!
     * @param args
     */
    public static void main(String[] args) {

        FirstChallenge firstChallenge = new FirstChallenge();

        double result = firstChallenge.divide(3, 0);

        if(!(Double.isInfinite(result) || Double.isNaN(result) || result == 0.0)) {
            System.out.println(result);
        }
    }

}
