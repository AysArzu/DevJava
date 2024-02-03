package day07ifstatement;

import java.util.Scanner;

public class IfStatements03 {
    public static void main(String[] args) {

        //Example: Ask user to enter number of the day in a week and print day name based on the input

        Scanner inputDay = new Scanner(System.in);
        System.out.println("Please enter a number for day of the week!");
        int dayNumber = inputDay.nextInt();
        if(dayNumber < 1 || dayNumber > 7){
            System.out.println("Invalid day number!");
        } else if(dayNumber == 1){
            System.out.println("Sunday");
        } else if (dayNumber == 2) {
            System.out.println("Monday");
        } else if (dayNumber == 3) {
            System.out.println("Tuesday");
        } else if (dayNumber == 4) {
            System.out.println("Wednesday");
        } else if (dayNumber == 5) {
            System.out.println("Thursday");
        } else if (dayNumber == 6) {
            System.out.println("Friday");
        } else {
            System.out.println("Saturday");
        }
    }
}

