package day12stringmanipulation;

public class StringManipulation03 {
    public static void main(String[] args) {
//Example: Check the given password if it meets the following conditions

        //it shouldn't be empty
        //it shouldn't contain just space characters, there must be others as well
        //it shouldn't contain leading and ending spaces...

        //Note: check the difference between isEmpty() and isBlank()

        String pwd = "  abc  ";
        boolean isEmpty = pwd.isEmpty();
        boolean isContainSpace = pwd.replaceAll("\\S", "").isBlank();

/*
        String pass = "    ";
        boolean isEmpty = pass.isEmpty(); //counts spaces and returns false...
        System.out.println("isEmpty = " + isEmpty); //false => not empty
        boolean isBlank = pass.isBlank(); //does not count spaces and return true
        System.out.println("isBlank = " + isBlank); //true => it is Blank */
    }
}
