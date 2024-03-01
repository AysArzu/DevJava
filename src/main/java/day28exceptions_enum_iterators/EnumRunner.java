package day28exceptions_enum_iterators;

import java.util.Arrays;
import java.util.Scanner;

public class EnumRunner {
    public static void main(String[] args) {

        //  Cities c= new Cities(); ENUM'dan objects olusturamazsiniz

        //1- Enum daki bir sabite nasil ulasabiliriz?
        Cities il = Cities.OSMANİYE;
        System.out.println(il);
        String city = Cities.OSMANİYE.getCityName();
        int plateCode = Cities.OSMANİYE.getPlateCode();
        String postalCode = Cities.OSMANİYE.getPostalCode();

        System.out.println(city + " ==> " + plateCode + "==> " + postalCode);
        //3- Ankara’nin posta koduna ulasalim
        System.out.println(Cities.ANKARA.getPlateCode());

        //4- Karabuk’un plaka koduna ulasalim
        int plate = Cities.KARABÜK.getPlateCode();
        System.out.println(plate);


        //5- Kullanicidan bir ilin plaka kodunu alarak bunun hangi il oldugunu console a yazdirin

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen plaka kodunu giriniz");
        int plaka = input.nextInt();

        //values() methodu enum icindeki tum datalari bir array icinde bize verir
        Cities[] sehirler = Cities.values();
        //System.out.println(Arrays.toString(sehirler));

        if (plaka < 1 || plaka > 81) {
            System.out.println("Lutfen 1 ile 81 arasi bir plaka kodu giriniz");
        } else {
            for (Cities w : sehirler) {
                if (plaka == w.getPlateCode()) {
                    System.out.println("Girmis oldugunuz plaka " + w.getCityName() + " iline aittir");
                    break;
                }
            }
        }


    }
}