package day14loops;

public class ForLoops01 {
    public static void main(String[] args) {
//Interview Question
        //Example 8: Calculate total value of the digits in the given integer.
        // 745 => 7 + 4 + 5 = 16

        int a = 745;
        int sum = 0;
        for (int i = a; i > 0; i /= 10) {
            sum += i % 10;
        }
        System.out.println("sum = " + sum);
//Homework : Calculate total value of first two digits and last two digits in the given integer
        //result =116
        int s = 1997;
        int toplam = 0;
        for (int i = s; i > 0; i /= 100) {
            toplam += i % 100;
        }
        System.out.println("toplam = " + toplam);
        //Example 9: Print non-repeated characters of the given String on the console
        // "loops" => lps

        //indexOf and lastIndexOf
        String s3 = "loops";
        String uniqueChars = "";

        for (int i = 0; i < s3.length(); i++) {
            char ch = s3.charAt(i);

            if (s3.indexOf(ch) == s3.lastIndexOf(ch)) {

                 uniqueChars += ch;

            }


        }
        System.out.println("uniqueChars = " + uniqueChars); //uniqueChars = lps

        
    }
}
