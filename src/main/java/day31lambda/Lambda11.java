package day31lambda;

import java.util.PrimitiveIterator;
import java.util.stream.IntStream;

public class Lambda11 {
    public static void main(String[] args) {

        // System.out.println(getSumFromSevenToSeventy());
        //System.out.println(getSumFromSevenToSeventy2());
        int multiply = getMultiplythreeToNine();
        //   System.out.println(multiply);//181440
        //   System.out.println(getMultiplythreeToNine2());
        //System.out.println(getFactorial(9));//362880
        System.out.println(getSumOfBetweenTwoInteger(9, 2));//868
    }

    /*
a) IntStream - primitive int değerleri üzerinde ardışık işlemler yapmayı sağlar.(LongStream, DoubleStream'de var)
b) range - Belirtilen başlangıç (dahil) ve bitiş değerleri (haric) arasında ardışık sayıları
temsil eden bir akış oluşturur.
c) rangeClosed - Belirtilen başlangıç (dahil) ve bitiş değerleri (dahil) arasında ardışık sayıları
temsil eden bir akış oluşturur.
d) addExact - tam ekle - İki int veya long değerini toplar. Math class'tadir.
e) getAsInt - OptionalInt sınıfında bulunan bir metottur.Eğer bir değer mevcutsa bu değeri döndürür.(IntStream kullaninca bunu kullaniriz)
Eğer bir değer mevcut değilse bir NoSuchElementException hatası fırlatır.
*/
    //1) 7'den 70'e kadar tum tamsayilarin toplamini veren kodu yaziniz
    public static int getSumFromSevenToSeventy() {
        return IntStream.range(7, 70).sum();//2394

    }

    public static int getSumFromSevenToSeventy2() {
        return IntStream.rangeClosed(7, 70).reduce(Math::addExact).getAsInt();//2464 =>70'i dahil ettik

    }

    //2)  3'den 9'a kadar tum tamsayilarin carpimini veren methodu olusturunuz.
    //multiplyExact - İki int veya long değerini çarpar. Math class'tadir
    public static int getMultiplythreeToNine() {
        return IntStream
                .rangeClosed(3, 9)
                .reduce(Math::multiplyExact)
                .getAsInt();
    }

    public static int getMultiplythreeToNine2() {
        return IntStream
                .range(3, 10)
                .reduce(Math::multiplyExact)
                .getAsInt();
    }

    //3)Size verilen sayinin faktoriyelini hesaplayan kodu yaziniz.
    //3! = 1 * 2 * 3 = 6
    //0! = 1
    //Negatif sayıların faktöriyeli yoktur
    public static int getFactorial(int num) {

        if (num < 0) {
            System.out.println("Negatif sayıların faktöriyeli yoktur");
            return -1;
        } else if (num == 0) {
            return 1;
        } else {
            return IntStream.rangeClosed(1, num).reduce(Math::multiplyExact).getAsInt();
        }

    }

    //4)Size verilen iki tamsayi arasindaki tum cift sayilarin toplamini veren kodu yaziniz.
    //baslangic ve bitis dahil degil.
    //sum metodu, IntStream üzerindeki tüm elemanların toplamını hesaplar ve bu toplamı döndürür.
    public static int getSumOfBetweenTwoInteger(int a, int b) {
        if (a > b) {
            int temp = a;
            a = b;
            b = temp;
        }
        return IntStream
                .range(a + 1, b)
                .filter(Utils::isNumberEven)
                .sum();
    }
}
