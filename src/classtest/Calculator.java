package com.example.java;

import cct.classtest.utilities.BasicMath;
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        String s1 = getInput("Enter a number: ");
        String s2 = getInput("Enter a number: ");
        String op = getInput("Choose an operation (+ - * /):");

        double result = 0;

        try {
            switch (op) {
                case "+":
                    result = BasicMath.addValues(s1, s2);
                    break;
                case "-":
                    result = BasicMath.subtractValues(s1, s2);
                    break;
                case "*":
                    result = BasicMath.multiplyValues(s1, s2);
                    break;
                case "/":
                    result = BasicMath.divideValues(s1, s2);
                    break;
                default:
                    System.out.println("Unrecognized operation!");
                    return;
            }

            System.out.println("The answer is " + result);

        } catch (Exception e) {
            System.out.println("Number formatting exception " + e.getMessage());
        }
    }
    
public static String getInput(String prompt) {
        System.out.println(prompt);
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }
    
}
