package day09ternary_stringmanipulation;

public class Ternary03 {
    public static void main(String[] args) {
        int year = 2024;
        String result = 2024 % 100 == 0 ? (year % 400 == 0 ? "Leap Year" : "Not a Leap Year") : (year % 4 == 0 ? "Leap Year" : "Not a Leap Year");
        System.out.println(result);
    }
}
