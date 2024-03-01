package practice.day7;

public class C02_Encapsulation {
    public static void main(String[] args) {


        //        Ali,Can,25 özelliklerine sahip bir obje oluşturunuz ve yazdırınız
        //        yaşı 30 olarak güncelleyiniz
        //        değişkenleri set edilmemiş ikinci bir obje oluşturunuz ve yazdırınız
        //        Ayşe,Yılmaz, 40 değerlerini set ediniz ve yazdırınız
        //        yaşını -5 olarak güncelleyiniz ve yazdırınız
        //        yaş negatif değer olmamalı, gerekli düzeltmeyi yapınız.
        //        isim ve soyismin sadece ilk harfi okunsun diğerleri * olsun,
        //        getter metodunda gerekli düzeltmeyi yapınız.

        C01_Encapsulation objAli = new C01_Encapsulation("Ali", "Can", 25);
        System.out.println(objAli);
        objAli.setYas(30);
        System.out.println(objAli);

        C01_Encapsulation objAyse = new C01_Encapsulation();
        objAyse.setIsim("Ayse");
        objAyse.setSoyIsim("Arzu");
        objAyse.setYas(40);
        objAyse.setYas(-5);
        System.out.println(objAyse);
        //        isim ve soyismin sadece ilk harfi okunsun diğerleri * olsun,
        //        getter metodunda gerekli düzeltmeyi yapınız.
        System.out.println(objAli.getIsim());
        System.out.println(objAli.getSoyIsim());
        System.out.println(objAyse.getIsim()+ " "+objAyse.getSoyIsim());

    }
}