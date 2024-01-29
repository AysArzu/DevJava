package day05scanners_incrementdecrement;

import java.util.Scanner;

public class Scanner03 {
    public static void main(String[] args) {
        //newline character ('\n') issue: when we gather the data with more than one single Scanner object,
        //skipping some entries is about entry stream in Scanner...
        //Especially with the methods like nextInt(), nextShort(), nextDouble(); we can encounter newline issue.
        //So we don't use newLine() after those numeric data methods, or we need to eliminate the issue in another way

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your age");
        int age = scanner.nextInt();

        //to fix the issue; eliminate ('\n') with an empty nextLine() methods use case...
        scanner.nextLine(); //directly proceeds to next entry....

        System.out.println("Enter a name");
        String name = scanner.nextLine();


    }

}
