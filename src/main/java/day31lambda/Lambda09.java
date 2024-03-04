package day31lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda09 {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("Ali");
        myList.add("Elif");
        myList.add("Yusuf");
        myList.add("Elif");
        myList.add("Zeynep");
        myList.add("Mustafa");

//        eIleBaslamayan(myList);
//        karakterSayisi5tenAz(myList);
//        List<String> list =karakterSayisi5tenBuyuk(myList);
//        System.out.println(list);
//        System.out.println(karakterSayisi5tenAzElemanlar(myList) +" new");
//        tekrarsizBuyukOrderedList(myList);//ALİ ELİF MUSTAFA YUSUF ZEYNEP
        kucuktenBuyuge(myList);//ali elif yusuf zeynep mustafa

    }

    //ornek 9: Bir List’teki E ile baslayanlar haric tum elemanlari
    // console’a yazdiran method’u olusturunuz.
    public static void eIleBaslamayan(List<String> myList) {
        myList.
                stream().
                filter(t -> !t.startsWith("E")).
                forEach(t -> System.out.print(t + " "));//Ali Yusuf Zeynep Mustafa

    }

    //ornek 10: Bir List’te karakter sayisi 5’den az olan tum elemanlari
    // tekrarsiz olarak console’a yazdiran method’u olusturunuz.
    public static void karakterSayisi5tenAz(List<String> myList) {
        myList.
                stream().
                distinct().
                filter(t -> t.length() < 5).
                forEach(Utils::printInTheSameLineWithSpace);//Ali Elif
    }

    //ornek 11: Bir List’teki karakter sayisi 5’den cok olan tum elemanlari
    // buyuk harflerle bir listin icinde veren method’u olusturunuz.
    public static List<String> karakterSayisi5tenBuyuk(List<String> myList) {
        //collect(Collectors.toList()) - Java'nın Stream API'sindeki bir işlemdir.
        // Bu işlem, bir stream'de işlenmiş olan elemanları bir listeye toplar.
        return myList.
                stream().
                filter(t -> t.length() > 5).
                map(String::toUpperCase).
                collect(Collectors.toList());

    }

    //ornek 12: Bir List'teki karakter sayisi 5’den az olan tum elemanlari tekrarsiz olarak kucuk harflerle
    // natural order da console'a yazdiran method'u olusturunuz.
    public static List<String> karakterSayisi5tenAzElemanlar(List<String> myList) {
        return myList.
                stream().
                distinct().
                filter(t -> t.length() < 5).
                map(String::toLowerCase).
                sorted().collect(Collectors.toList());

    }

    //ornek 13: Bir List’teki elemanlari tekrarsiz olarak, buyuk harflerle, alfabetik sirada
    // console’a yazdiran method’u olusturunuz.
    public static void tekrarsizBuyukOrderedList(List<String> myList) {
        myList.
                stream().
                distinct().
                map(String::toUpperCase).
                sorted().
                forEach(Utils::printInTheSameLineWithSpace);
    }

    //ornek 14: Bir List’teki elemanlari tekrarsiz olarak, kucuk harflerle, uzunluklarina gore
    // kucukten buyuge siralayarak console’a yazdiran method’u olusturunuz.
    public static void kucuktenBuyuge(List<String> myList) {
        myList.
                stream().
                distinct().
                map(String::toLowerCase).//map(t->t.toLowerCase())'te yazabilirdik
                sorted(Comparator.comparing(String::length)).//sorted(Comparator.comparing(t -> t.length())). yazabilirdik
                forEach(Utils::printInTheSameLineWithSpace);
/*
//Comparator.comparing(): Comparator sınıfında bulunan comparing metodu,
// belirtilen bir fonksiyona göre karşılaştırma yapmak için bir karşılaştırıcı (comparator) oluşturur.

//sorted(Comparator.comparing(t->t.length())) ifadesi, stream içindeki elemanları uzunluklarına
// göre artan sırayla sıralar. Eğer ters sıralama istenirse, reversed() metodu eklenerek
// sorted(Comparator.comparing(String::length).reversed()) şeklinde kullanılabilir.
 */

    }
}
