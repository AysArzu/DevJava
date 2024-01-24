package day2datatypesconcatenation;

public class Concatenation {
    public static void main(String[] args) {
        //Example: Create a String and two int data, and print the total value of them on the console...
        String s="Apple";
        int a=10;
        int b=25;
        System.out.println(s+a+b);//Apple1025
        System.out.println(s+ (a+b));//Apple35
        System.out.println(s+a*b);//Apple250
        System.out.println(a+b+s);//35Apple

        //in JAVA: "+" sign will be Addition when used between integers
        //in JAVA: "+" sign will be Concatenation when used with two String, and one String and one integer...
        //Concatenation is combining(joining) the data in the same line one after another...
        //If operations start with String, + sign becomes Concatenation. But multiplication and parenthesis has operation priority.
    }
}
