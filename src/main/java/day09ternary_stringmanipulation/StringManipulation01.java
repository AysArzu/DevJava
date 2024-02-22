package day09ternary_stringmanipulation;

public class StringManipulation01 {
    public static void main(String[] args) {
        //String data types:is used to store sentences, words, symbols etc...

        //Example: Check the given string and calculate total number of characters in string....
        String s = "Java is so easy!";
        int length = s.length();
        System.out.println("Length of sentence is " + length);//Length of sentence is 16

        //*************************************************************************************
       /* in String variables, all the characters location in an index number...
        Index is zero-based characteristic...
        First character is in index 0 everytime...
        And index number increase from left to right one by one*/

        //Example: in the String above, fetch first and last character then print on the console
        //use charAt() method to fetch characters by using index...
        char firstCharacter = s.charAt(0);


        char last=s.charAt(length-1);
        char lastCharacter = s.charAt(s.length() - 1);

        System.out.println("First Character = " + firstCharacter);
        System.out.println("Last Character = " + lastCharacter);

        //Example: In the following string, replace "money" with "dollars"....

        String str = "Learn java earn 3456 money";

        String newstr = str.replace("money","dollars");
        System.out.println("newstr = " + newstr);//newstr = Learn java earn 3456 dollars

        //Example 2: Re,ove all the characters of "e" from the String above...
        String removedE =str.replaceAll("e","");
        System.out.println("removedE = " + removedE);//removedE = Larn java arn 3456 mony

        /*
        To define a group of data, we use Regular Expressions in java
        In short, we name REGEX...
        There are so many REGEX, but we will learn most common ones...

         1)All digits ==> [0-9]
         2)All lowercase letters ==> [a-z]
         3)All uppercase letters ==>[A-Z]
         4)All the letters ==>[a-zA-Z]
         5)All the letters and digits ==>[a-zA-Z0-9]
         6)All punctuation ==> \\p{Punct}--> noktalama isaretleri ,./? gibi
         7)All the vowels ==> [aeiouAEIOU]
             All a, x, y characters ==>[axy]
             From A -G and a-g ==>[A-Ga-g]

        //exclusive Regex
        It means "other than" or "except"
        8)All the characters other than digits ==>[^0-9]
        9)All the characters other than lowercase letters ==>[^a-z]
        10)All the characters other than  letters ==>[^a-zA-Z]
        11)All the characters other than space ==>[^ ]

        in the following part, there is no square bracket
        12) Only space character ==> \\s
        13)Expect space character ==> \\S
        14)Only digits ==>\\d
        15)Expect digits ==>\\D

         */
        //Example 3: in the given String above convert all digits into "*"
        //replaceAll(x,y) ==>first parameter for regex that we wanna remove, second one is to put something instead.
        String strWithStar = str.replaceAll("\\d","*");
        System.out.println("strWithStar = " + strWithStar);//strWithStar = Learn java earn **** money

        //Example 4: check the given string and calculate number of digits in it...
        String strDigits = str.replaceAll("\\D","");
        int size=strDigits.length();
        System.out.println("size = " + size);//size = 4
        //   int numOfDigits = str.replaceAll("[^0-9]", "").length();
        // I removed all the characters other than digits,
        // and counted number of characters in remaining part ("3456") with length()
    }
}
