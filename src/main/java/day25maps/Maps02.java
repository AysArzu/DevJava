package day25maps;

import java.util.HashMap;
import java.util.Map;

public class Maps02 {
    public static void main(String[] args) {

        HashMap<String, Integer> stdNames = new HashMap<>();
        stdNames.put("Ali", 18);
        stdNames.put("Can", 19);
        stdNames.put("Tom", 33);
        stdNames.put("Veli", 63);
        stdNames.put("Ahmet", 41);

        //key'i tekrarli kullandimizda hata vermiyordu ama bu sekilde yapmak best practice degildir
        stdNames.put("Tom", 35);
        System.out.println(stdNames);//{Can=19, Ahmet=41, Tom=35, Veli=63, Ali=18}

        //1) replace() methodu value’lari key’leri kullanarak update etmeye yarar
        //Aynı işlemi put ile yapmak da teknik olarak işe yarar, ancak replace kullanmak,
        // kodunuzu okuyan diğer geliştiricilere ve size daha net bilgi verir.
        stdNames.replace("Tom", 39);
        System.out.println("stdNames = " + stdNames);//stdNames = {Can=19, Ahmet=41, Tom=39, Veli=63, Ali=18}

        //2) replace() methodu eski deger kontrolu yaparak ta calisir
        stdNames.replace("Tom", 21, 45);
        System.out.println(stdNames);//degisiklik olmaz eski deger kontrolu ile degisiklik yap dedik

        stdNames.replace("Tom", 39, 45);
        System.out.println("stdNames = " + stdNames);//stdNames = {Can=19, Ahmet=41, Tom=45, Veli=63, Ali=18}

        System.out.println("---------------------------------------");

        //3)putIfAbsent() metodu, belirtilen key ve value çiftini, key Map’te yoksa Map’e ekler.
        // Key Map’te zaten varsa, metodun hiçbir etkisi olmaz.
        stdNames.putIfAbsent("Tom", 21);
        System.out.println("stdNames = " + stdNames);//21 eklemez cunku key olan "Tom" mapte var!!!!

        stdNames.putIfAbsent("Ayse", 23);
        System.out.println("stdNames = " + stdNames);//stdNames = {Can=19, Ahmet=41, Tom=45, Veli=63, Ayse=23, Ali=18}
        //23 u ekler cunku Ayse mapte yoktu!!!!
        System.out.println("---------------------------------------");

        //4- get() ve getOrDefault() method’lari eger aranan eleman map’te var ise, ikisi de ayni isi yapar
        //key verirsiniz, size value verir

        System.out.println(stdNames.get("Tom"));//45
        System.out.println(stdNames.getOrDefault("Jerry", -1));//-1
        // istedigimiz degeri yazabiliriz 23 yada 86

        System.out.println("---------------------------------------");
        //5)containsKey() metodu, Map’te bir key olup olmadığını kontrol eder.
        //containsValue() metodu ise, Map’te bir value olup olmadığını kontrol eder.
        //Boolean return ederler
        Boolean b = stdNames.containsValue(19);
        System.out.println("b = " + b);

        System.out.println("stdNames.containsKey TOM = " + stdNames.containsKey("TOM"));//false
        System.out.println("stdNames.containsKey Tom = " + stdNames.containsKey("TOM"));//true

        System.out.println("---------buyuk/kucuk harf duyarliligini ortadan kaldirdik--------------");
        Map<String, Integer> stdAges = new HashMap<>();
        stdAges.put("Tom".toLowerCase(), 25);
        stdAges.put("Jerry".toLowerCase(), 22);

        System.out.println("stdAges = " + stdAges);
        boolean cki = stdAges.containsKey("TOM".toLowerCase());

        //6)remove("Tom"); methodu key kullanarak entry silmeye yarar
        stdNames.remove("Tom");
        System.out.println(stdNames); //{Can=19, Ahmet=41, Veli=63, Ayse=23, Ali=18}

        //remove("Can",19); methodu hem key hemde value'yu kontrol eder eslesirse siler yoksa silmez
        stdNames.remove("Can", 18);
        System.out.println(stdNames); //{Can=19, Ahmet=41, Veli=63, Ayse=23, Ali=18}
        // Can silinmez, value'su 19 olsaydi silinirdi
        /*
  Settings--> Editor-->Color Shceme-->Java-->Comments-->Block comment buradan Block comment yorum kısmının rengi ve italic ve bold ayarlarini yapabilirsiniz
         */

    }
}