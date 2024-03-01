package practice.day7;

public class MemurMuhasebe implements GenelMuhasebe {
    //    çalışan memur ise;
//        1-Çalışanın aylık çalışma saatine göre 120 saat üstü her saat için brüt maaşı 15 dolar arttır
//        2-Çalışanın çalışma süresi 10 yıl ve üzeri ise maaşından %35;
//          daha az ise maaşından %25 vergi kesintisi yapılıyor

    @Override
    public double ekMesaiHesapla(int calismaSaati) {
        if (calismaSaati > 120) {
            double ekMesai = (calismaSaati - 120) * 15;
            System.out.println("Aylık ek mesai ücreti: " + ekMesai);
            return ekMesai;
        } else {
            return 0;
        }


    }

    @Override
    public double vergiHesapla(double brutMaas, int calismaYili) {
        double vergi;
        if (calismaYili > 10) {
            vergi = brutMaas * 0.35;
            System.out.println("Vergi : " + vergi);
        } else {
            vergi = brutMaas * 0.25;
            System.out.println("Vergi : " + vergi);

        }
        return vergi;

    }


    @Override
    public double netMaasHesapla(double brutMaas, int calismaYili, int calismaSaati) {
        return brutMaas + ekMesaiHesapla(calismaSaati) - vergiHesapla(brutMaas, calismaYili);
    }


}
