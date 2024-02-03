package day06_incrementdecrement_ifstatement;

public class IfStatement {
    public static void main(String[] args) {

        //IF STATEMENTS: If is a conditional statements in JAVA
        //When the condition returns true, related code block (if body within {} ) will be executed...

        //If you work hard, you will get offer...

        //  if(condition is defined){ codes to be executed when condition true}

        if(100 < 15){

            System.out.println("If you see this message, condition is satisfied (true)");
        }


        //Example:
        if(7 == 4 + 3){
            System.out.println("Condition is true, you see the message...body is executed...");
        }


        //Example1: If the number is a digit, print "Digit" on the console...
        int num = 12;

        num -= 4;

        if(num >= 0 && num < 10){

            System.out.println(num + " is a DIGIT");
        }

        //Example2: If a number has three digits, print "This number has 3 digits" on the console

        int n = 67;

        n += 50;

        if(n > 99 && n < 1000){
            System.out.println(n + " has 3 digits.");
        }



    }
}
