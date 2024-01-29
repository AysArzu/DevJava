package day05scanners_incrementdecrement;

import java.util.Scanner;

public class Scanner05 {
    public static void main(String[] args) {
        //Example:  Ask user to enter the width and the length of a rectangle,
        // then print the area and perimeter on the console

        //area: width * length
        //perimeter = 2* width + 2*length

        Scanner scan = new Scanner(System.in);
        System.out.println("enter the width and the length of a rectangle");
        float width = scan.nextFloat();
        float lenght = scan.nextFloat();
        float area = width * lenght;
        System.out.println("area = " + area);
        float perimeter = 2 * width + 2 * lenght;
        System.out.println("perimeter = " + perimeter);
    }
}
