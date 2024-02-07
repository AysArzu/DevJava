package day09ternary_stringmanipulation;

public class Ternary02 {
    public static void main(String[] args) {
//Example: Check the given number if it is 3 digits number or not
//and print "3 Digits" or "Not 3 Digits"

        int a = 167;
        a = Math.abs(a); //abs() returns absolute value of the integers....


        String result = (a > 99 && a < 1000) ? ("Three Digits") : ("Not Three Digits");


        System.out.println("result = " + result);
    }
}
