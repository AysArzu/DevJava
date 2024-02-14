package day14;

public class ForLoops {
    public static void main(String[] args) {
        //Example 6: In the given string, print the string except lowercases in it....
        //"Pwd12?Ab" ==> P12?A
        //continue; keyword is used to skip a data when condition is met.
        String word = "Pwd12?Ab";
        int length = word.length();
        for (int i = 0; i < length; i++) {
            char ch = word.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                continue;

            }
            System.out.print(ch);//P12?A
        }

    }
}
