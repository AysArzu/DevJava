package practice.day7;

public class PersonelMaas {
    /*
Bir sirketin muhasebe departmanı çalışanların maaşını hesaplıyor
Muhasebe departmanı maaş için şu kriterlere bakıyor:

çalışan işçi ise;
    1-Çalışanın aylık çalışma saatine göre 160 saat üstü her saat için brüt maaşı 10 dolar arttır
    2-Çalışanın çalışma süresi 10 yıl ve üzeri ise maaşından %30;
    daha az ise maaşından %20 vergi kesintisi yapılıyor

çalışan memur ise;
    1-Çalışanın aylık çalışma saatine göre 120 saat üstü her saat için brüt maaşı 15 dolar arttır
    2-Çalışanın çalışma süresi 10 yıl ve üzeri ise maaşından %35;
      daha az ise maaşından %25 vergi kesintisi yapılıyor

Her çalışanın maaşı hesaplanırken bu 2 kritere dikkat edilmek zorundadır
Bu kriterlere göre interface kullanarak çalışanların net maaşını hesaplayan kodu yazınız
 */
    public static void main(String[] args) {
        MemurMuhasebe muhasebe1=new MemurMuhasebe();
        //memur: 2000, 11, 150
        muhasebe1.ekMesaiHesapla(150);
        muhasebe1.vergiHesapla(2000,11);
        System.out.println();
        System.out.println("memur net maaşı: "+muhasebe1.netMaasHesapla(2000, 11, 150));
        // isci 1700,8, 180
        System.out.println();
        IsciMuhasebe muhasebe2=new IsciMuhasebe();
        muhasebe2.ekMesaiHesapla(180);
        muhasebe2.vergiHesapla(1700,8);
        System.out.println();
        System.out.println("Isci net maasi: "+muhasebe2.netMaasHesapla(1700,8,180));
        System.out.println();

        //----------------------------------------------------------------
        GenelMuhasebe muhasebe3= new MemurMuhasebe();
        muhasebe3.vergiHesapla(2500,12);
        muhasebe3.netMaasHesapla(2500,12,170);








    }

}
