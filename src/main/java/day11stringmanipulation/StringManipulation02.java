package day11stringmanipulation;

import java.util.Scanner;

public class StringManipulation02 {
    public static void main(String[] args) {

          /*
            Example: Check the given password by user and validate with following criteria...
            i) must contain at least 8 characters
            ii) must not contain space characters
            iii) must contain at least one uppercase
            iv) must contain at least one lowercase
            v) must contain at least one digit
             */
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your password!");

        String pwd = input.nextLine(); //"Pss123 Tk"

        // i) must contain at least 8 characters
        boolean lengthControl = pwd.length() >= 8; //if this returns true, first item will be validated...
        System.out.println("lengthControl = " + lengthControl);


        // ii) must not contain space characters
        boolean spaceCheck = pwd.replaceAll("[^ ]" , "").isEmpty(); //if there is any space in remaining part, this returns false
        //boolean spaceCheck = pwd.replaceAll("[^ ]" , "").length() == 0;              // if there is no space, returns true and 2. item is validated...
        System.out.println("spaceCheck = " + spaceCheck);


        // iii) must contain at least one uppercase
        boolean upperCaseCheck = pwd.replaceAll("[^A-Z]", "").length() > 0;
        System.out.println("upperCaseCheck = " + upperCaseCheck);


        //  iv) must contain at least one lowercase
        boolean lowerCaseCheck = pwd.replaceAll("[^a-z]", "").length() > 0; //if returns true, there is lowercase
        System.out.println("lowerCaseCheck = " + lowerCaseCheck);


        // v) must contain at least one digit
        boolean digitCheck = pwd.replaceAll("[^0-9]", "").length() > 0;
        System.out.println("digitCheck = " + digitCheck);

        boolean isValid = lengthControl && spaceCheck && upperCaseCheck && lowerCaseCheck && digitCheck;

        if(isValid){
            System.out.println("Password is valid...");
        }else{

            System.out.println("Invalid password...");
        }

    }

}
