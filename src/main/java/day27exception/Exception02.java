package day27exception;

public class Exception02 {
    public static void main(String[] args) {

        //2) NumberFormatException : Bir metnin sayisal bir deger olarak donusturulememesi durumunda olusur
        String s = "12345#";
        convertStringToInt(s);
    }

    public static void convertStringToInt(String s) {
        try {
            int instS = Integer.valueOf(s);
            System.out.println(instS + 1);// 1'i donusturup donusturmedigini anlamak icin yazdik 12345
        } catch (NumberFormatException e) {
            System.out.println("Donusum icin rakam disi karakter kullanmayiniz : " + e.getMessage());

        }// FileWriter, PrintWriter ile exceptionlari disariya alabiliriz
    }


}
