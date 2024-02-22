package day13arrays;

import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {
        //Ornek 1: String array olusturun, icine 5 tane eleman ekleyin, tum elemanlarin
        //           icerdigi karakter sayilari toplamini ekrana yazdirin.

        String[] cities = new String[5];

        cities[0] = "Bayburt";
        cities[1] = "Sivas";
        cities[2] = "Denizli";
        cities[3] = "Adana";
        cities[4] = "Ankara";
        System.out.println(Arrays.toString(cities));
        //1.yol: for loop
        //[Bayburt, Sivas, Denizli, Adana, Ankara]
        int totalChar = 0;

        for (int i = 0; i < cities.length; i++) {

            //length field'dir. Alan okumasi yapar. koseli parantezin icini okur

            totalChar = totalChar + cities[i].length(); //length() method'dur, aktif sayma yapar

        }
        System.out.println(totalChar); //30
        //--------------------------
        //2.yol:
        //for each loop - enhanced - gelistirilmis loop:

        //for-each loop, Array, yani coklu veri iceren yapilarda kullanilir.
        //for loop'taki baslangic, bitis, artirma, azaltma olaylarini dusunmeyiz
        //variable ismi olarak da genel kabul w’nun kullanilmasidir.

        /*  for (DataType variable : array yada collections){
            calisacak kodlar
        }*/

        int sum = 0;
        //[Bayburt, Sivas, Denizli, Adana, Ankara]
        for (String w : cities){
            sum = sum + w.length();

        }
        System.out.println(sum); //30

        //iter foreach in kisa yolu :)

    }
}
