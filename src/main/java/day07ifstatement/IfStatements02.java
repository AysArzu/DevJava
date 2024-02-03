package day07ifstatement;

import java.util.Scanner;

public class IfStatements02 {
    public static void main(String[] args) {
        /*
        When we have two conditions, we can use if-else statement...
        When we have conditions more than 2, we can use "if - else if- else if- ... - else
         */
        /*  if(specific scenario){

          }else if(another specific scenario){

          }else if(another specific scenario){

          }else{

          }*/
        Scanner scan = new Scanner(System.in);
        System.out.println("please enter a number");

        int num = scan.nextInt();
        if (num < 0) {
            System.out.println(num + " is a negative number");
        } else if (num == 0) {
            System.out.println(num + " is a neuter number");
        } else
            System.out.println(num + " is a positive number");
    }
}
