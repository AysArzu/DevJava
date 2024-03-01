package practice.day7;

public class C01_Encapsulation {
    //Encapsulation :data hiding
        /*
    bir class oluşturalım.
    private access modifiera sahip variablelar oluşturun: isim, soyisim, yas seklinde
    parametreli ve parametresiz constructor oluşturun
    toString metodunu oluşturun
     */
    private String isim;
    private String soyIsim;
    private int yas;

    public C01_Encapsulation() {
    }

    public C01_Encapsulation(String isim, String soyIsim, int yas) {
        this.isim = isim;
        this.soyIsim = soyIsim;
        if (yas >= 0) {
            this.yas = yas;
        } else {
            throw new RuntimeException("invalid age : " + yas);
        }
    }

    public String getIsim() {
        if (isim != null) {
            return isim.charAt(0) + "*".repeat(isim.length() - 1);
        } else {
            return null;
        }
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getSoyIsim() {
        if (soyIsim != null) {
            return soyIsim.charAt(0) + "*".repeat(soyIsim.length() - 1);
        } else {
            return null;
        }
    }

    public void setSoyIsim(String soyIsim) {
        this.soyIsim = soyIsim;
    }

    public int getYas() {

        return yas;
    }

    public void setYas(int yas) {
        if (yas > 0) {
            this.yas = yas;
        } else {
            System.out.println("Yaş değeri negatif olamaz!!!");
        }

    }

    //toString: objemizin fieldlerini  Stringe donusturduk
    @Override
    public String toString() {
        return
                "isim='" + isim + '\'' +
                        ", soyIsim='" + soyIsim + '\'' +
                        ", yas=" + yas;
    }
}
//ALT + Insert kolay yoldan generate yapmak icin!!!
    /*
    POJO:Plain Old Java Object
    1-private access modifier: fields
    2-paramli ve paramsiz const.
    3-getter-setter
    4-toString
     */