package day04operatorscastingscanner;

import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {
    /*
        I want to get input from another system; so I need something more in my class...
        So far I assigned all the data inside the class on my own...
        This time, I will allow an external user to enter data into my system...
     */
        //1)Create an instance/object from Scanner class which is member of java.util...
//how to create object:
        //ClassName   + objectName  = "new"  keyword   + ClassName();
        Scanner scan = new Scanner(System.in);//input will come through the parameter of Scanner class
        System.out.println("scan.nextInt() = " + scan.nextByte());
    }
}
