package homework;

public class Q2 {
    public static void main(String[] args) {

        //Check if a given string is a palindrome.
        String word = "kayak";
        String reversed = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed += word.charAt(i);
        }

        if (reversed.equalsIgnoreCase(word)) {
            System.out.println("Words are palindrome");
        } else {
            System.out.println("Words are not palindrome");
        }

    }
}
