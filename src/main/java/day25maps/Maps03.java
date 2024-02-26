package day25maps;

import java.util.Arrays;
import java.util.HashMap;

public class Maps03 {
    public static void main(String[] args) {
        //Meshur bir interview sorusu
        //ornek 1: Size verilen bir String'deki her kelimenin, o String'de kac defa kullanildigini
        //           gosteren kodu yaziniz.(Case insensitive (Büyük/küçük harfe duyarsız)olsun)

        /*
         ***************  get() methodu ***********
         *     LIST                         MAP
         * m=("A","B","C")                  n={"A"=5,"B"=7,"C"=2}
         * m.get(1)=>B                      n.get("A")=> 5
         * m.get(0)=>A                      n.get("C")=>2
         *index yazarim value alirim         key veririm value alirim
         */

        //Ali nasilsin Ali. ==> Ali 1 kere gozuktu. Java digerini Ali. olarak algilar

        //ali=2, nasilsin=1 ==> Bu map yapisi

        String s = "Ali nasilsin Ali.";
        s = s.toLowerCase().replaceAll("\\p{Punct}", "");
        System.out.println(s);
        String[] kelimeler = s.split(" ");
        System.out.println(Arrays.toString(kelimeler));//[ali, nasilsin, ali]

        HashMap<String, Integer> myMap = new HashMap<>();
        System.out.println(myMap);//{} cikar
        for (String w : kelimeler) {
            Integer gorunum = myMap.get(w);//ilk dongu de, map'te ali olmadigindan value'su null gelecek

            if (gorunum == null) {
                myMap.put(w, 1);
            } else {
                myMap.put(w, gorunum + 1);
            }
        }
        System.out.println("myMap = " + myMap);

        //ornek 2: Size verilen bir String’deki her harfin o String’de kac defa kullanildigini gosteren kodu yaziniz.
//      “Hello” ==> H=1, e=1, l=2, o=1
        String word = "Hello";
        String[] arr = word.split("");
        HashMap<String,Integer> myNewHashmap= new HashMap<>();
        for (String w :arr) {
            Integer i=myNewHashmap.get(w);
            if(i==null){
                myNewHashmap.put(w,1);
            }else{
                myNewHashmap.put(w,i+1);
            }
        }
        System.out.println(myNewHashmap);
    }
}
