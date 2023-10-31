package com.solvd.laba.block1.task1;

public class User {
    public static void main(String[] args) {
        if (args.length < 3) {
            System.out.println("Try again. Write down your first, last name and age");

        } else {
            String firstName = args[0];
            String lastName = args[1];
            int age = Integer.parseInt(args[2]);

            System.out.println("USER INFO:");
            System.out.println("First Name: " + firstName);
            System.out.println("Last Name: " + lastName);
            System.out.println("Age: " + age);

        }
    }
}

