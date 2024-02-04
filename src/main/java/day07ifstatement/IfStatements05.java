package day07ifstatement;

import java.util.Scanner;

public class IfStatements05 {
    public static void main(String[] args) {
//the information provided by customer:
        //if it is female
        //and greater than 60, print "She can retire"

        //if it is male
        //and greater than 65, print "He can retire"

        Scanner scan = new Scanner(System.in);
        System.out.println("Please write your gender");
        String gender = scan.next().toLowerCase();
        System.out.println("Please write your age");


        int age = scan.nextInt();
        if (gender.equals("female")) {
            if (age >= 60) {
                System.out.println("She can retire");
            } else {
                System.out.println("She can not retire");
            }
        } else if (gender.equals("male")) {
            if (age >= 65) {
                System.out.println("He can retire");
            } else System.out.println("He can not retire");
        } else System.out.println("wrong gender entered");
    }
}
