package day12stringmanipulation;

public class StringManipulation02 {
    public static void main(String[] args) {
        //Example: Print unique characters in String on the console...
        // Alabama  ==> A, l, b, m       or      Albm
        //Miami => M,i,a,m   or   Miam
        //if a character is unique, first occurrence and last occurrence will be the same...
        String str = "Alabama";
        //use indexOf and lastIndexOf methods....
        if (str.indexOf("A") == str.lastIndexOf("A")) {
            System.out.print("A");
        }
        if (str.indexOf("l") == str.lastIndexOf("l")) {
            System.out.print("l");
        }
        if (str.indexOf("a") == str.lastIndexOf("a")) {
            System.out.print("a");
        }
        if (str.indexOf("b") == str.lastIndexOf("b")) {
            System.out.print("b");
        }
        if (str.indexOf("m") == str.lastIndexOf("m")) {
            System.out.println("m");
        }
        //Example 2: Convert all the digits into "*" in a card number except last 4 digits
        //  1234 6789 1234 6789 ==> **** **** **** 6789

        String cardNum = "1234 6789 1234 6789";
        int index = cardNum.length() - 4;
        String digits = cardNum.substring(index);
        String withAsterix = cardNum.substring(0, index).replaceAll("[0-9]", "*");
        String NewCard = withAsterix.concat(digits);
        System.out.println("NewCard = " + NewCard);


      /*


    String  firsPart =  cardNum.substring(0, 15).replaceAll("[0-9]", "*");
    System.out.println("firsPart = " + firsPart);


    String lastPart = cardNum.substring(15);
    System.out.println("lastPart = " + lastPart);


    String result =  firsPart + lastPart;
    System.out.println("result = " + result); //result = **** **** **** 6789

      String result1  = firsPart.concat(lastPart);
      System.out.println("result1 = " + result1); //result1 = **** **** **** 6789
       */

    }
}
