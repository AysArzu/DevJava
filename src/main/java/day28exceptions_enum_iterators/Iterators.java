package day28exceptions_enum_iterators;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iterators {
    public static void main(String[] args) {
/*
        1-  Iterator'ler loop'larin yaptigi ayni isi yapar
        2)  Iterator'lerde sonsuz loop olusma ihtimali yoktur(for each gibi)
        3)  Iterator'ler ile loop'lar arasinda performans farki yoktur
        4)  Iterator'ler bir collection'dan eleman silme ve bir collection'daki elemani degistirme
        konusunda daha basarilidir
        5) Iki tip iterator vardir:
            a) Iterator:
            Bu sadece eleman silmede kullanilir, eleman eklemek veya elemani degistirmek mumkun degildir
            b) ListIterator:
            Bu eleman silebilir, ekleyebilir ve degistirebilir

            Not:
            Iterator, sadece soldan saga (ilk elemandan son elemana) calisir
            ListIterator iki yonlu calisabilir
         */

        List<String> mylist = new ArrayList<String>();
        mylist.add("Tom");
        mylist.add("Jim");
        mylist.add("Clara");
        mylist.add("Fatma");
        mylist.add("Mustafa");

        System.out.println(mylist);//[Tom, Jim, Clara, Fatma, Mustafa]
        //myList uzerinde bir Iterator olusturalim
        Iterator<String> myItr = mylist.iterator();

        //hasNext() : Koleksiyonun bir sonraki elemaninin olup olmadigini kontrol eder(boolean)
        //next() : Pointer'i bir sonraki elemanin onune konumlandirir ve pointer'in atladigi elemani verir
        //remove() : Pointer'in atladigi elemani siler

        while (myItr.hasNext()) {// en basa konumlanan pointerdan sonra eleman var mi diye bakar
            myItr.next();//pointeri 2. elemanin onune alir ve atladigi elemani verir

                myItr.remove();//next()'in verdigi elemani siler.


        }//**specific bir elemani iterator ile nasil silebiliriz? (Tom’u silelim)
        System.out.println(mylist);
    }
}
