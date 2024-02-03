package day05scanners_incrementdecrement;

import java.util.Scanner;

public class Scanner04 {
    public static void main(String[] args) {
        //Example: Ask user to enter two different numeric data
        //calculate: total value, difference, multiplication and division of numbers in different lines...
        //use double

        //create instance from scanner class
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter two numbers...");

        double firstNumber =  input.nextDouble();
        double secondNumber = input.nextDouble();

        System.out.println("Total= " + (firstNumber + secondNumber));
        System.out.println("Difference= " + (firstNumber - secondNumber));
        System.out.println("Multiplication= " + (firstNumber * secondNumber));
        System.out.println("Division= " + (firstNumber / secondNumber));

        System.out.println("Division= " + String.format("%.2f",firstNumber / secondNumber));
        System.out.println("Division= " + String.format("%.3f",(firstNumber / secondNumber)));




    }
}
