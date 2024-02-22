package day10stringmanipulation;

public class StringManipulation03 {
    public static void main(String[] args) {
//Example: Check the given password if it meets the following conditions

        //it shouldn't be empty
        //it shouldn't contain just space characters, there must be others as well
        //it shouldn't contain leading and ending spaces...

        //Note: check the difference between isEmpty() and isBlank()

        String pwd = "  abc  ";
        boolean first = !pwd.isEmpty(); //returns true when it is like "" ....
        System.out.println("first = " + first);

        boolean second = !pwd.isBlank();
        System.out.println("second = " + second);

        boolean third = pwd.trim().equals(pwd);
        System.out.println("third = " + third);

        if(!first){
            System.out.println("Password can not be empty!");
        }

        if(!second){
            System.out.println("There must be some characters other than spaces!");
        }

        if (!third){
            System.out.println("There should not be leading and ending spaces!");
        }


/*
       String pass = "    ";
       boolean isEmpty = pass.isEmpty(); //counts spaces and returns false...
       System.out.println("isEmpty = " + isEmpty); //false => not empty

        boolean isBlank = pass.isBlank(); //does not count spaces and return true
        System.out.println("isBlank = " + isBlank); //true => it is Blank */

    }
}
