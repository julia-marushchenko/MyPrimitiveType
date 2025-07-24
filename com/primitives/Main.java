// Java program to practice java primitive integer type and passing value

package com.primitives;

// Main class
public class Main {

    // Main class
    public static void main(String[] args) {

        // Creating and initializing local variable in stack memory
        int integer_variable = 8;

        // Calling method change
        change(integer_variable);

        // Printing value of integer_variable to console
        System.out.println(integer_variable); // Output: 8
    }

    // Method change (int number) to demonstrate passing value to outer variable
    public static void change(int number){
        number = 11;
    }
}
