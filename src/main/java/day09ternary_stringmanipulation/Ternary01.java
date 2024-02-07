package day09ternary_stringmanipulation;

import java.util.Scanner;

public class Ternary01 {
    public static void main(String[] args) {
        //Example:if two numbers have the same sign, return multiplication of them
        //if signs are different , print "I cannot multiply the number with different sign!
        Scanner scan = new Scanner(System.in);
        System.out.println("Please give a first number");
        int a = scan.nextInt();
        System.out.println("Please give a second number");
        int b = scan.nextInt();
        Object result = (a < 0 && b < 0) || (a > 0 && b > 0) ? (a * b) : "I cannot multiply the number with different sign!";
        System.out.println("result = " + result);
//Object is like Adam for mankind. It is above all the data types and covers all of them...
//It used memory  more, but sometimes we can use it to consider possible results in different data types...
    }
}
