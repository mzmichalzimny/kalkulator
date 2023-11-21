package com.kodilla.testing;

public class TestingMain {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        int addResult = calculator.add(5, 3);
        if (addResult == 8) {
            System.out.println("Test metody add zakończony");
        } else {
            System.out.println("Test metody add z błędem.");
        }

        int subtractResult = calculator.subtract(5, 3);
        if (subtractResult == 2) {
            System.out.println("Test metody subtract zakończony");
        } else {
            System.out.println("Test metody subtract z błędem.");
        }
    }
}
