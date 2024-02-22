package day10stringmanipulation;

public class StringManipulation04 {
    public static void main(String[] args) {

        //Example 1: Fetch first 4 characters in the given String...
        //substring(starting index) ==> returns portion of string by starting from specified index and
        // to the end of the string
        //substring(starting index, ending index) ==> returns a portion of string that begins with the character
        // specified in first parameter, and extends to the character at ending index
        //NOTE: (starting index)first parameter is inclusive, (ending index)second parameter is exclusive

        String s = "Java is funny";
        System.out.println(s);//Java is funny
        //fetch a portion from original string and create a new string....

        String firstFourChars = s.substring(0, 4);
        System.out.println("firstFourChars = " + firstFourChars);//firstFourChars = Java


        //Example 2: fetch "is" substring from the given string above....
        String isChar = s.substring(5, 7);
        System.out.println("isChar = " + isChar);//isChar = is

        //Example 3: fetch "funny" substring from the given string above...
        String funnyPart = s.substring(8, 13);
        System.out.println("funnyPart = " + funnyPart); //funny

        //2. way: use single parameter in method parenthesis
        String funnyPart2  =s.substring(8); //starts from index 8, goes till the end of string.
        System.out.println("funnyPart2 = " + funnyPart2);//funnyPart2 = funny

        //Example 4: check the given string above if it has "funny" in it....
        // contains()  ==> provides check for the existence of specified substring....
        boolean isFunny = s.contains("funny");
        System.out.println("isFunny = " + isFunny); //true


        //  String s = "Java is funny";

        //Example 5: Check the given string if it starts with "Java"
        //startsWith()
        boolean startsWithJava = s.startsWith("Java");
        System.out.println("startsWithJava = " + startsWithJava);//startsWithJava = true

        //Example 6: Check the given string if "is" substring starts from index 5
        //startsWith(a, b) => first parameter is for string, second one is for index
        boolean isStartsWithIndexFive = s.startsWith("is", 5);
        System.out.println("isStartsWithIndexFive = " + isStartsWithIndexFive);//isStartsWithIndexFive = true


        //Example 7: Check the given string if it ends with "funny"
        //endsWith()

        boolean endsWithFunny = s.endsWith("funny"); //true
        System.out.println("endsWithFunny = " + endsWithFunny);//endsWithFunny = true
    }
}
