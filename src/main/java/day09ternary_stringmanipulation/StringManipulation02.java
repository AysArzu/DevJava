package day09ternary_stringmanipulation;

public class StringManipulation02 {
    public static void main(String[] args) {

        //Example: In the following string, replace "money" with "dollars"....

        String str = "Learn java earn 3456 money";
        //replace(x,y) => first parameter is to remove, and second parameter is to put something instead...
        System.out.println(str);

        String updatedStr = str.replace("money" , "dollars");
        System.out.println("updatedStr = " + updatedStr);

        //Example 2: Remove all the characters of "e" from the String above....
        String strWithoutE = str.replace("e" , "");
        System.out.println("strWithoutE = " + strWithoutE); //strWithoutE = Larn java arn 3456 mony

                    /*
                    To define a group of data, we use Regular Expressions in Java
                    In short, we name it REGEX...
                    There are so many REGEX, but we will learn most common ones....

                1) All digits ==> [0-9]
                2) All lowercase letters ==> [a-z]
                3) All uppercase letters ==> [A-Z]
                4) All the letters ==> [a-zA-Z]
                5) All the letters and digits ==> [a-zA-Z0-9]
                6) All punctuations ==> \\p{Punct}
                7) All the vowels ==> [aeiouAEIOU]
                     All a, x, y characters ==> [axy]
                     From A - G and a - g ==> [A-Ga-g]


                //exclusive Regex ==> we use "^" to exclude defined group of data....
                //It means "other than" or "except"
               8) All the characters other than digits ==> [^0-9]
               9) All the characters other than lowercase letters ==> [^a-z]
               10) All the characters other than letters ==> [^a-zA-Z]
               11) All the characters other than space ==> [^ ]

                //in the following part, there is no square bracket
               12) Only space character ==> \\s
               13) Except space character ==> \\S
               14) Only digits ==> \\d
               15) Except digits ==> \\D
                        */

        //Example 3: in the given String above, convert all digits into "*"....
        //  String str = "Learn java earn 3456 money";
        //replaceAll(x, y) ==> first parameter for regex that we want to remove, second one is to put something instead

        String strWithStar = str.replaceAll("[0-9]", "*");
        System.out.println("strWithStar = " + strWithStar); //Learn java earn **** money



        //Example 4: check the given string and calculate number of digits in it...
        //  String str = "Learn java earn 3456 money";

        // => expected result is 4

        int numOfDigits = str.replaceAll("[^0-9]", "").length();
        System.out.println("numOfDigits = " + numOfDigits); //numOfDigits = 4
        // I removed all the characters other than digits,
        // and counted number of characters in remaining part ("3456") with length()...

    }
}
