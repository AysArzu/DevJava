package day08ifstatements_switch;

import java.util.Scanner;

public class Ternary01 {
    public static void main(String[] args) {
        //another conditional statement syntax: ternary...
        /*
        condition ? part-for-true : part-for-false;
           (c)    ?     (t)       :      (f)      ;
         */
        //Example: create a ternary to print absolute value of given number...
        int number = -5;
        int absNum = number < 0 ? number * (-1) : number;
        System.out.println("absolute = " + absNum);
        //in ternary; we need to keep returning data in a related data type then we can print...


    }
}
