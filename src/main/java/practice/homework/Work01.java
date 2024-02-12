package practice.homework;

import java.util.Scanner;

public class Work01 {
    public static void main(String[] args) {
//Data Types:
//Write a Java program to declare and initialize variables of different data types (int, double, char, boolean, String) and print their values.
        int a1 = 12;
        double a2 = 12.3;
        char a3 = 'A';
        boolean a4 = true;
        String a5 = "Learn java earn money";
        System.out.println("integer value = " + a1);
        System.out.println("double value = " + a2);
        System.out.println("char value = " + a3);
        System.out.println("boolean value = " + a4);
        System.out.println("String value = " + a5);
//Write a Java program to perform arithmetic operations (addition, subtraction, multiplication, division) on two integer variables and display the results.
        int b1 = 12;
        int b2 = 3;
        int sum = b1 + b2;
        int subtraction = b1 - b2;
        int multiplication = b1 * b2;
        int division = b1 / b2;
        System.out.println("sum of " + b1 + " and " + b2 + " = " + sum);
        System.out.println("subtraction of " + b1 + " and " + b2 + " = " + subtraction);
        System.out.println("multiplication of " + b1 + " and " + b2 + " = " + multiplication);
        System.out.println("division of " + b1 + " and " + b2 + " = " + division);
//Write a Java program to convert a string to an integer and vice versa. Take user input for a string and convert it to an integer, then convert it back to a string and print both. (find related method by yourself... parseInt())
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        String numString = scan.next();
        int convertedInteger = Integer.parseInt(numString);
        String convertedString = String.valueOf(convertedInteger);
        System.out.println("convertedString = " + convertedString);
        System.out.println("convertedInteger = " + convertedInteger);
//        Scanner Class:
//Write a Java program to accept two numbers from the user using the Scanner class, add them, and display the result.
        System.out.println("Enter two number");
        int c1 = scan.nextInt();
        int c2 = scan.nextInt();
        int sumOfTwoNum = c1 + c2;
        System.out.println("sum of two numbers = " + sumOfTwoNum);

//Write a Java program to accept a string input from the user using the Scanner class and display it.
        System.out.println("Please enter your name");
        String name = scan.nextLine();
        System.out.println("Your name is " + name);

//        Write a Java program to accept three integer inputs from the user using the Scanner class, find their sum, and display it.
        System.out.println("Please enter three number. I add them for you");
        int d1 = scan.nextInt();
        int d2 = scan.nextInt();
        int d3 = scan.nextInt();
        int sumD = d1 + d2 + d3;
        System.out.println("Sum of three integer = " + sumD);

//        Write a Java program to accept a double input from the user using the Scanner class, multiply it by 2, and display the result.
//                Note: You can use Scanner class in any of the solutions if you wish.
        System.out.print("Enter a double number: ");
        double doubleNumber = scan.nextDouble();
        double mutliplyBy2 = doubleNumber * 2;
        System.out.println("The result of multiplying  = " + mutliplyBy2);


//        Increment/Decrement:

//Write a Java program to demonstrate post-increment and pre-decrement operators. Take an integer input from the user, perform post-increment, and pre-decrement operations on it, then display the results.
        System.out.println("Enter a number");
        int e = scan.nextInt();
        int postIncrement = e++;
        int preDecrement = --e;
        System.out.println("postIncrement = " + postIncrement);
        System.out.println("preDecrement = " + preDecrement);

//   Write a Java program to calculate the area of a rectangle. Take length and width as integer inputs from the user, then calculate and display the area.
        System.out.println("Enter rectangle's length ");
        int f1 = scan.nextInt();
        int f2 = scan.nextInt();
        int area = f1 * f2;
        System.out.println("area of rectangle = " + area);

//  Write a Java program to demonstrate the use of compound assignment operators. Take an integer input from the user, add 5 to it using a compound assignment operator, and display the result.
        System.out.println("Please enter a number");
        int g1 = scan.nextInt();
        g1 += 5;
        System.out.println("New result = " + g1);


//                If Statements:

//        Write a Java program to check whether a number entered by the user is positive, negative, or zero using if statements.
        System.out.println("Enter a number");
        int h = scan.nextInt();
        if (h > 0) {
            System.out.println("The entered number is positive");
        } else if (h == 0) {
            System.out.println("The entered number is zero");

        } else System.out.println("The entered number is negative");

//Write a Java program to determine the largest of three numbers entered by the user using if-else statements.
        System.out.println("Enter three number. I find for you which one is largest");
        int i1 = scan.nextInt();
        int i2 = scan.nextInt();
        int i3 = scan.nextInt();
        if (i1 > i2 && i1 > i3) {
            System.out.println("The largest number is: " + i1);
        } else if (i2 > i3 && i2 > i1) {
            System.out.println("The largest number is: " + i2);
        } else System.out.println("The largest number is: " + i3);

//Write a Java program to check whether a character entered by the user is a vowel or a consonant using if-else statements.
        System.out.print("Enter a character: ");
        char j = scan.next().toLowerCase().charAt(0);
        if (j >= 'a' && j <= 'z') {
            if (j == 'a' || j == 'e' || j == 'i' || j == 'o' || j == 'u') {
                System.out.println("The character is vowel");
            } else System.out.println("The character is constant");
        } else System.out.println("invalid input");

//Write a Java program to check whether a year entered by the user is a leap year or not using if-else statements.
        System.out.print("Enter a year: ");
        int year = scan.nextInt();
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("Leap year");
        } else {
            System.out.println("Not a leap year");
        }
//Write a Java program to find the maximum of two numbers entered by the user without using the Math.max() method, only using if statements.
        System.out.println("Enter two numbers. I will find for you which one is bigger");
        int k1 = scan.nextInt();
        int k2 = scan.nextInt();
        if (k1 > k2) {
            System.out.println("First number is bigger");
        } else if (k2 > k1) {
            System.out.println("Second number is bigger");
        } else System.out.println("Both numbers are equal");

//                Ternary Operator:
//Write Java program to check whether a number entered by the user is even or odd using the ternary operator.
        System.out.println("Enter a number. I will say he number is odd or even ");
        int l = scan.nextInt();
        String result = l % 2 == 0 ? "Even " : "Odd";
        System.out.println("The number is " + result);

//Write Java program to find the maximum of two numbers entered by the user using the ternary operator.
        System.out.println("Enter two numbers");
        int m1 = scan.nextInt();
        int m2 = scan.nextInt();
        int bigger = m1 > m2 ? m1 : m2;
        System.out.println("Bigger number is " + bigger);

//Write Java program to check whether a character entered by the user is a vowel or a consonant using the ternary operator.
        System.out.print("Enter a character");
        char n = scan.next().toLowerCase().charAt(0);
        String result1 = n >= 'a' || n <= 'z' ? (n == 'a' || n == 'e' || n == 'i' || n == 'o' || n == 'u' ? "vovel" : "constant") : "invalid character";
//        Write Java program to check whether a number entered by the user is positive, negative, or zero using the ternary operator.
        System.out.println("Enter a number");
        int o = scan.nextInt();
        String result3 = o > 0 ? "Positive" : (o < 0 ? "Negative" : "Zero");
        System.out.println("The entered number is " + result3);

//                Switch Statements:
//Write Java program to check the day of the week based on the number entered by the user using a switch statement.
        System.out.println("Enter a number between 1 and 7");
        byte p = scan.nextByte();
        String dayOfWeek;
        switch (p) {
            case 1:
                dayOfWeek = "Sunday";
                break;
            case 2:
                dayOfWeek = "Monday";
                break;
            case 3:
                dayOfWeek = "Tuesday";
                break;
            case 4:
                dayOfWeek = "Wednesday";
                break;
            case 5:
                dayOfWeek = "Thursday";
                break;
            case 6:
                dayOfWeek = "Friday";
                break;
            case 7:
                dayOfWeek = "Saturday";
                break;
            default:
                dayOfWeek = "Invalid day number";
        }
        System.out.println("Day of the week is " + dayOfWeek);

//Write Java program to determine the number of days in a month entered by the user using a switch statement.
        System.out.println("Enter a number between 1 and 12");
        byte r = scan.nextByte();
        int daysInMonth = 0;
        switch (r) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                daysInMonth = 31;
                break;
            case 2:
                daysInMonth = 28;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                daysInMonth = 30;
                break;
            default:
                System.out.println("Invalid number");
        }
        System.out.println("The number if days is" + daysInMonth);

//Write Java program to determine the type of triangle based on sides entered by the user using a switch statement.
        System.out.println("Enter the sides of the triangle");
        byte s1 = scan.nextByte();
        byte s2 = scan.nextByte();
        byte s3 = scan.nextByte();

        if (s1 <= 0 || s2 <= 0 || s3 <= 0) {
            String triangle0 = "invalid input";
        } else if (s1 == s2 && s2 == s3) {
            String triangle1 = "Equilateral triangle";
        } else if (s1 == s2 || s1 == s3 || s2 == s3) {
            String triangle2 = " Isosceles triangle";
        } else {
            String triangle3 = "Scalene triangle";
        }

    }
}
