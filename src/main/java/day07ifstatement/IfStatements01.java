package day07ifstatement;

import java.util.Scanner;

public class IfStatements01 {
    public static void main(String[] args) {

        //Example: Check the number entered by user if it is even or odd...

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number...");

        int num = input.nextInt();

        if (num % 2 == 0) { //if a number is divisible by 2 => it is "even"

            System.out.println("The number you entered is even!");

        }

        if (num % 2 != 0) { //if a number is not divisible by 2 => it is "odd"

            System.out.println("The number you entered is odd!");

        }
      /*  if else Statements
        if is used to define a specific scenario....
        when I have two different scenarios, and only one will be true, I can use "else" part for the second..
         ...scenario instead of another independent if body
        When I use If and else, else will be executed when if returns false in the first statement.
        So Java will save energy in comparison to two independent if statements...
*/
        if (num % 2 == 0) { //if a number is divisible by 2 => it is "even"

            System.out.println("The number you entered is even!");

        }

       else { //if a number is not divisible by 2 => it is "odd"

            System.out.println("The number you entered is odd!");

        }
    }
}
