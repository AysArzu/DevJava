package day20instanceblock_oop;

public class InstanceBlock3Runner {
    public static void main(String[] args) {
        InstanceBlock3 car1 = new InstanceBlock3();
        //Araba rengi : Siyah
        //Araba yakit turu : Benzin

        InstanceBlock3 car2 = new InstanceBlock3("Beyaz", "Dizel");
        System.out.println("2.Araba rengi : " + car2.color);//2.Araba rengi : Beyaz
        System.out.println("2.Araba yakit turu : " + car2.fuelType);//2.Araba yakit turu : Dizel

    }
}
