package day27exception;

public class Exception03 {
    public static void main(String[] args) {
        //3) StringIndexOutOfBoundsException, bir String nesnesinin karakter dizisindeki
        // geçersiz bir indekse erişmeye çalışıldığında ortaya çıkan bir istisna türüdür.
        String s = "Java";
        karakterSec(s, 4);
    }

    public static void karakterSec(String s, int idx) {
        try {
            char ch = s.charAt(idx);
            System.out.println(ch);
        } catch (StringIndexOutOfBoundsException e) {
            System.err.println("Olmayan indexleri kullanmayiniz :"+ e.getMessage());//e=serr kirmizi uyari verir
           // e.printStackTrace();//Kod yazan hatalari gormek isterse kullanir.
                                 // Exception gosterir ama exception firlatmaz

        }
        System.out.println("App calisiyor"); // e.printStackTrace(); calismayi durdurmaz
    }
}
