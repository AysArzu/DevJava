package day15loops;

import java.util.Scanner;

public class ForLoop01 {
    public static void main(String[] args) {
        //Example : Calculate total value of the integers from 5 to 9
        int sum = 0;
        for (int i = 5; i < 10; i++) {
            sum += i;
        }
        System.out.println("Total value of the integers= " + sum);

        //Example 2: Calculate the multiplication of the numbers from 10 to 7

        int total = 1;
        for (int i = 10; i >6; i--) {
           total*=i;
        }
        System.out.println(total);
    }
}
