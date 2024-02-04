package day08ifstatements_switch;

import java.util.Scanner;

public class Switch02 {
    public static void main(String[] args) {
        //When user enters number of moth, print the related month name and the month names afterwards
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter number of the month");
        int monthNumber = scan.nextInt();//can be string, int, short, byte, char
        switch (monthNumber){
            case 1:
                System.out.println("January");
            case 2:
                System.out.println("February");
            case 3:
                System.out.println("March");
            case 4:
                System.out.println("April");
            case 5:
                System.out.println("May");
            case 6:
                System.out.println("June");
            case 7:
                System.out.println("July");
            case 8:
                System.out.println("August");
            case 9:
                System.out.println("September");
            case 10:
                System.out.println("October");
            case 11:
                System.out.println("November");
            case 12:
                System.out.println("December");
                break;//we can use this keyword where we want to stop in positive scenario
            default:
                System.out.println("Enter a valid number");
        }//Note: Data type of the variable in switch parenthesis can be:
        //1)String  2) int  3)byte  4)short  5)char
        //switch does not accept 1)long  2)boolean  3)float  4)double as data type for variables in parentheses
    }
}
