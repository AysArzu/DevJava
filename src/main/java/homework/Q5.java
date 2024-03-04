package homework;

public class Q5 {


    public static void main(String[] args) {
        String input = "ali";
        generatePermutations(input);
    }

    private static void generatePermutations(String str) {
        generatePermutations("", str);
    }

    private static void generatePermutations(String harf, String input) {
        int n = input.length();
        if (n == 0) {
            System.out.println(harf);
        } else {
            for (int i = 0; i < n; i++) {
                generatePermutations(harf + input.charAt(i), input.substring(0, i) + input.substring(i + 1));
            }
        }
    }
}