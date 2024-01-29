package day05scanners_incrementdecrement;

import java.util.Scanner;

public class Scanner06 {
    public static void main(String[] args) {
        //Example: Ask user to enter an integer with 5 digits
        //calculate total value of first and last 2 digits
        //45825 ==> 45 + 25 : 70 ....

        //by dividing by 1000, we will have 45.825 => int removes decimal part and we have 45 as result
        //now we are done with first two digits....

        //if we use modulus operator (mod method) : we can get remainder in division operation
        //So when we divide our number by 100; last two digits will be remainder...

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter an integer with 5 digits");
        int number = scan.nextInt();
        int firstTwoDigits = number / 1000;
        int lastTwoDigits = number % 100;
        int totalValue = firstTwoDigits + lastTwoDigits;
        System.out.println("totalValue = " + totalValue);
    }
}
