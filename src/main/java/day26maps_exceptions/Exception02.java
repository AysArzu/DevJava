package day26maps_exceptions;

public class Exception02 {
    public static void main(String[] args) {

        //2) NumberFormatException : Bir metnin sayisal bir deger olarak donusturulememesi durumunda olusur
        String s = "12345";
        convertStringToInt(s);
    }

    public static void convertStringToInt(String s) {
        int instS = Integer.valueOf(s);
        System.out.println(instS + 1);
    }
}
