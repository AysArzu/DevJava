package day09ternary_stringmanipulation;

import java.util.Scanner;

public class StringManipulation03 {
    public static void main(String[] args) {
/*
  Example: Check the given password by user and validate with following criteria...
  i) must contain at 8 least characters
  ii) must not contain space characters
  iii) must contain at least one uppercase
  iv) must contain at least one lowercase
  v) must contain at least one digit
   */
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your password");
        String pass = scan.nextLine();
        //  i) must contain at 8 least characters
        boolean length = pass.length() > 7;
        //  ii) must not contain space characters
        boolean space = pass.replaceAll("\\S", "").isEmpty();
        //boolean space = pass.replaceAll("\\S", "").length()==0 ;

        //  iii) must contain at least one uppercase
        boolean uppercase = pass.replaceAll("[^A-Z]", "").length() > 0;
        //  iv) must contain at least one lowercase
        boolean lowercase = pass.replaceAll("[^a-z]", "").length() > 0;
        //  v) must contain at least one digit
        boolean digit = pass.replaceAll("\\D", "").length() > 0;

        boolean result = length && space && uppercase && lowercase && digit;
        System.out.println(result);


    }
}
