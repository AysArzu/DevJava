package day28exceptions_enum_iterators;

import java.util.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class iterators02 {
    public static void main(String[] args) {


        List<String> mylist = new ArrayList<String>();
        mylist.add("Tom");
        mylist.add("Jim");
        mylist.add("Clara");
        mylist.add("Fatma");
        mylist.add("Mustafa");
        mylist.add("Mustafa");

        //myList uzerinde bir Iterator olusturalim
        Iterator<String> myItr = mylist.iterator();
        System.out.println(mylist);
        //**specific bir elemani iterator ile nasil silebiliriz? (Tom’u silelim)

        while (myItr.hasNext()) {// en basa konumlanan pointerdan sonra eleman var mi diye bakar
            String el = myItr.next();
            if (el.equals("Mustafa")) {
                myItr.remove();
                break;
            }//break oldugu icin sadece birini sildi break olmasa tum mustafalari silerdi

        }
        System.out.println(mylist);

        //ListIterator
        List<String> yourList = new ArrayList<>(Arrays.asList("Ali", "Can", "Ayse"));
        System.out.println(yourList);//[Ali, Can, Ayse]

        ListIterator<String> yourListItr = yourList.listIterator();


        //1) set(E e): Koleksiyonun geçerli elemanını değiştirir.
        while (yourListItr.hasNext()) {

            String el = yourListItr.next();
            yourListItr.set(el + "*");

        }
        System.out.println(yourList);
        System.out.println("yourList = " + yourList);//yourListItr = [Ali!, Can!, Ayse!]


        ///2)elemanlari sondan basa dogru yazdirin
        List<String> yourList2 = new ArrayList<>(Arrays.asList("Ali", "Aliye", "Ayse"));
        System.out.println(yourList2);
        ListIterator<String> listItr2 = yourList2.listIterator();
        //Bu loop pointer'in en saga almak icin yazildi
        while (listItr2.hasNext()) {
            listItr2.next();
        }
        //elemanlari sondan basa dogru yazdirin
        while (listItr2.hasPrevious()) {
            String el = listItr2.previous();
            System.out.println(el + "<==");
        }


    }

}


