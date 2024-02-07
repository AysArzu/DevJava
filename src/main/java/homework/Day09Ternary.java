package homework;

public class Day09Ternary {
    public static void main(String[] args) {
        // Homework: Print the minimum of two integers on the console
        int a = 9;
        int b = 3;
        int minNumber = a > b ? b : a;
        System.out.println("Minimum from (" + a + " and " + b + ") is " + minNumber);
    }
}
