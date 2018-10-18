package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Choose one of these assignments to run by uncommenting only the corresponding line
//        assignment_1_multiplication_table();
//        assignment_2_calculator();
//        assignment_3_prime_numbers();
    }

    // Prints out a multiplication table of 8 from 1 to 10
    public static void assignment_1_multiplication_table() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("8 x " + i + "=" + (8 * i));
        }
    }

    // Simple calculator that does operations on two numbers
    public static void assignment_2_calculator() {
        boolean isRunning = true;
        while (isRunning) {
            // Create a `Scanner` object to be able to read user input from console
            Scanner scanner = new Scanner(System.in);


            System.out.println("Enter the first real number: ");
            double firstNumber = scanner.nextDouble();
            // After after `scanner.nextDouble` `scanner.nextInt`, or any other method that reads less than a line
            // it is recommended to call `scanner.nextLine` right after it
            // because if the user presses `3` then `Enter` the stream of user input will be read by
            // scanner as `3\n` where `\n` is the special character meaning `go to next line`
            // `scanner.nextDouble` will only read the `3` and remove it from the flush
            // and leaving us with a trailing `\n`
            // Next time we want to get a line of text from the user
            // the `\n` will be interpreted as an end of line, which is what we don't want
            scanner.nextLine();
            // after this line, the stream will be empty

            System.out.println("Enter the second real number: ");
            double secondNumber = scanner.nextDouble();
            // same thing here
            scanner.nextLine();

            System.out.println("Operations possible:");
            System.out.println(" - addition");
            System.out.println(" - subtraction");
            System.out.println(" - multiplication");
            System.out.println(" - division");
            System.out.println(" - remainder");

            // This will hold the user operation
            String operation;

            // booleans, when defined, have default value of `false`
            // therefore this following line
            boolean inputIsCorrect;
            // is equivalent to writing:
            // `boolean inputIsCorrect = false`

            do {
                System.out.println("Enter the operation you want to do: ");
                operation = scanner.nextLine();

                // because we want to make sure the user does not give incorrect input
                // we keep asking the user to make a choice of operation
                // until they give a correct choice
                // The way we track whether the user did that or not is through the
                // `inputIsCorrect` boolean variable
                // It will be set to `true` in all the operations cases except in the
                // `else` branch, which means the given operation does not match any
                // possible known operation, where we set it to false


                // Also, we use `equalsIgnoreCase` instead of `equals` because
                // we do not want to treat `addition`, `aDDitTion` or `ADDITION` as different inputs
                // We ignore the case

                if (operation.equalsIgnoreCase("addition")) {
                    inputIsCorrect = true;
                    double result = firstNumber + secondNumber;
                    System.out.println(firstNumber + " + " + secondNumber + " = " + result);
                    // do addition
                } else if (operation.equalsIgnoreCase("subtraction")) {
                    inputIsCorrect = true;
                    double result = firstNumber - secondNumber;
                    System.out.println(firstNumber + " - " + secondNumber + " = " + result);
                } else if (operation.equalsIgnoreCase("multiplication")) {
                    inputIsCorrect = true;
                    double result = firstNumber * secondNumber;
                    System.out.println(firstNumber + " x " + secondNumber + " = " + result);
                } else if (operation.equalsIgnoreCase("division")) {
                    inputIsCorrect = true;
                    // Division by zero is undefined in math,
                    // therefore instead of ignoring the error and giving a result of
                    // `Infinity` we explain to the user that it is not possible to divide by zero
                    if (secondNumber == 0) {
                        System.out.println("You cannot divide by zero");
                    } else {
                        double result = firstNumber / secondNumber;
                        System.out.println(firstNumber + " / " + secondNumber + " = " + result);
                    }
                } else if (operation.equalsIgnoreCase("remainder")) {
                    inputIsCorrect = true;
                    double result = firstNumber % secondNumber;
                    System.out.println(firstNumber + " % " + secondNumber + " = " + result);
                } else {
                    inputIsCorrect = false;
                    // We let the user know that the operation is not possible
                    System.out.println("The given operation is not possible.");
                }
            } while (!inputIsCorrect); // ... and keep asking him to enter a correct value

            // We ask the user whether they want to run the calculator program again
            // The loop will stop once the user enters anything other than `y`, case insensitively
            System.out.println("Would you like to calculate something again? (y\\n) : ");
            String userChoice = scanner.nextLine();
            isRunning = userChoice.equalsIgnoreCase("y");
        }
    }


    // Prints all prime numbers between 1 and 100
    public static void assignment_3_prime_numbers() {
        for (int i = 1; i <= 100; i++) {
            // We only print the prime numbers by checking
            // inside the if condition
            if (isPrime(i)) {
                System.out.print(i + ", ");
            }
        }
    }

    // Checks whether the number is prime or not
    public static boolean isPrime(int x) {
        // version given in class:
        // slow but works
//        if (x == 0) return false;
//        if (x == 1) return false;
//        for (int i = 2; i <= x - 1; i++) {
//            if (x % i == 0) {
//                return false;
//            }
//        }

        // faster version, especially with big numbers
        // we use Math.sqrt(x) to take the square root of x
        // The reason is that the biggest divisor of x (except x itself)
        // cannot be bigger than its square root
        if (x == 0) return false;
        if (x == 1) return false;
        for (int i = 2; i <= Math.sqrt(x); i++) {
            if (x % i == 0) {
                return false;
            }
        }

        return true;
    }

}
