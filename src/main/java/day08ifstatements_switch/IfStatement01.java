package day08ifstatements_switch;

import java.util.Scanner;

public class IfStatement01 {
    public static void main(String[] args) {
        //Example: Based on the entered age, print the phase on the console
        //0-4 => infant
        //5-12 => child
        //13-20 => teen
        //21-40 => adult
        //41+ => middle age
        Scanner input = new Scanner(System.in);
        System.out.println("Tell me your age to see your phase!");
        int age  = input.nextInt();
        if(age<0) {
            System.out.println("Invalid age!");
        }else if(age < 5){
            System.out.println("Infant");
        } else if (age < 13) {
            System.out.println("Child");
        }else if (age < 21){
            System.out.println("Teen");
        } else if (age < 41) {
            System.out.println("Adult");
        }else{
            System.out.println("Middle Age");
        }
    }
}
