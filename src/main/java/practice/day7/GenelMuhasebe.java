package practice.day7;

public interface GenelMuhasebe {
    double ekMesaiHesapla(int calismaSaati);

    double vergiHesapla(double brutMaas, int calismaYili);
    double netMaasHesapla(double brutMaas, int calismaYili, int calismaSaati);
}
