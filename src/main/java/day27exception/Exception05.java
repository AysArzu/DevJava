package day27exception;

public class Exception05 {
    public static void main(String[] args) {
        //try kisminda birden fazla Exception olusturma ihtimali olan kod varsa, coklu "catch" kullanabilirsiniz.

        //Coklu "catch" kullandiginizda Exception Class'lar arasinda "parent - child" iliskisi yoksa, catch'lerin sirasi
        //onemli degildir. Ama kod'daki siralamaya uymak tavsiye edilir.

        //Coklu "catch" kullandiginizda Exception Class'lar arasinda "parent - child" iliskisi varsa, catch'lerin sirasi
        //onemlidir, child olan class ustte olmalidir.

        //Exception Class'lar arasinda "parent - child" iliskisi varsa, ya child class'i uste yazarak child ve parent class'lar
        //icin ozellestirilmis code'lar yazarsiniz.(Hirsiz icin 155, hasta icin 112 gibi)
        //Veya child'i hic kullanmaz sadece parent ile exception'lari handle etmeye calisirsiniz.(Hirsiz icin 911, hasta icin 911 gibi)

        //try blogundan sonra birden fazla catch bloğu kullanabilir miyiz?
        int a = 12;
        int b = 1;
        String s = "My Java";
       // getCharFromString(s, a, b);
        getCharFromString2(s, a, b);
    }

    public static void getCharFromString(String s, int a, int b) {
        try {
            int idx = a / b;
            char ch = s.charAt(idx);
            System.out.println(ch);
        } catch (ArithmeticException e) {
            System.out.println("Sifira bolme yapilamaz" + e.getMessage());
        }catch (StringIndexOutOfBoundsException e) {
            System.out.println("Olmayan index kullandiniz =" + e.getCause());
            //e.getCause() hatanin sebebi class'ta yukluyse verir, yoksa null verir
        }// bolme hataliysa sifira bolme varsa yani birinci hatayi aliriz eger indexi buyukse o zaman ikinci hatayi aliriz.
    }
    public static void getCharFromString2(String s,int a,int b){
        //2.yol: Tum exception turlerini tek bir catch’te yakalamak icin “Exception” adli parent kullanilir
        try {
            int idx = a / b;
            char ch = s.charAt(idx);
            System.out.println(ch);
        }catch (Exception e){
            System.out.println("Bir istisna olustu ==> "+e.getClass());
            //getClass() exception'in cesidini verir


        }
    }
}
