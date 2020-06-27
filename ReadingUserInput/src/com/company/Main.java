package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // System.out takes data from program and outputs to the console
        // System.in takes data from console and inputs it to the program
        Scanner scanner = new Scanner(System.in);

        System.out.println("What is your birth year?");
        boolean hasNextInt = scanner.hasNextInt();

        int birthYear = scanner.nextInt();

        if (hasNextInt) {
            // We must call nextLine manually to actually get the next line. When you type the age, then hit Enter, the
            // Enter is interpreted as input, so the name variable below gets the value of that Enter input. Do this any
            // time you use a parse method that doesn't advance to the next line and you are needing to read a new line of
            // input
            scanner.nextLine();

            System.out.println("Enter your name: ");
            String name = scanner.nextLine();
            int age = 2020 - birthYear;

            if (age >= 0 && age <= 100) {
                System.out.println("Your name is " + name + " and you are " + age + " years old");
            } else {
                System.out.println("Invalid age");
            }
        } else {
            System.out.println("Unable to parse year of birth");
        }

        // Always close the scanner once you're done with it
        scanner.close();
    }
}
