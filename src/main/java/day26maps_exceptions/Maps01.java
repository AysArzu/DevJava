package day26maps_exceptions;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class Maps01 {
    public static void main(String[] args) {
        //Thread Safe, Multi Thread, Synchronized kavramlarini inceleyelim
        /*
        Thread Safe (İş Parçacığı Güvenliği):
        Thread safe, bir yazılımın veya veri yapısının birden fazla iş parçacığı tarafından aynı anda erişilirken
        beklenen davranışı sergileyebilmesi ve veri bütünlüğünü koruyabilmesi anlamına gelir.
        Banka hesabı yönetimi gibi örneklerde,birden fazla iş parçacığı (örneğin, birden fazla kullanıcının aynı anda
        hesap işlemleri yapması) hesap bakiyesi gibi paylaşılan kaynaklara erişebilir.

        Multi Thread (Çok İş Parçacıklı):
        Multi thread, bir programın veya uygulamanın birden fazla iş parçacığı tarafından aynı anda çalıştırılabilmesi
        anlamına gelir. Bu, yazılımın genel performansını ve yanıt süresini iyileştirebilir çünkü birden fazla işlem
        paralel olarak gerçekleştirilebilir. Web tarayıcıları, bu kavramın güzel bir örneğidir;
        çünkü kullanıcı arayüzünü donmadan, aynı anda birden fazla sekmede içerik yükleyebilir ve
        kullanıcı etkileşimlerine yanıt verebilirler.

        Synchronized:
        Synchronized, bir metodun veya bloğun aynı anda sadece bir iş parçacığı tarafından erişilebilir olmasını
        sağlayan bir anahtar kelimedir. Bu, özellikle paylaşılan kaynaklara erişimde veri tutarlılığını ve
        bütünlüğünü korumak için kullanılır.
*/

        /*HashMap ile HashTable arasindaki fark nedir?
        1)  a) HashMap non-synchronized'dir ve bu yuzden thread-safe degildir, yani birden fazla iş parçacığı
        aynı anda HashMap nesnesine erişebilir. Bu, yüksek performanslı durumlar için avantajlı olabilir
        ancak çoklu iş parçacığı ortamlarında veri tutarlılığını garantilemek için dış senkronizasyon
        mekanizmaları kullanılmalıdır.(Programci Synchronized Bloklar, Lock ve Semapforlar gibi ozel yapilar kullanir.)

            b) HashTable synchronized ve thread-safe'dir
        (yani aynı anda sadece bir iş parçacığı aynı Hashtable'i kullanabilir.
         kuyruk olusur ve hizmet suresi uzar)

        2) a)HashMap bir tane null key'e (unique olmali, 2 null olamazdi, ustune yazar) ve
                istediginiz kadar null value'a musaade eder
           b)Hashtable, key ve valuelar için null değerlerine izin vermez.
           Herhangi bir null değer eklemeye çalışırsanız, NullPointerException alırsınız.

        3) HashMap hizlidir, HashTable HashMap'e gore yavastir

        Not: HashMap'ler ve HashTable'lar entry'leri rastgele siralar*/
        /*--------------------
            Hangi veri yapısını kullanmalısınız?

            Senkronizasyona gerek yoksa, HashMap kullanın. Bu, daha yüksek performans sağlayacaktır.
            Senkronizasyon gerekliyse, Hashtable kullanın. Bu, veri tutarsızlığı riskini azaltacaktır.
 */

        Hashtable<String, Integer> ogrenciNotlari = new Hashtable<>();
        ogrenciNotlari.put("Ayse", 100);
        ogrenciNotlari.put("Fatih", 70);
        ogrenciNotlari.put("Ebrar", 90);
        ogrenciNotlari.put("Ebubekir", 85);
        //ogrenciNotlari.put(null,50);//HATA NULLPOINTEREXCEPTION
        //ogrenciNotlari.put("Sude",null);


        HashMap<String, Integer> stdAges = new HashMap<>();
        stdAges.put("Ayse", 23);
        stdAges.put("Ahmet", 41);
        stdAges.put(null, 23);
        stdAges.put(null, 35);//KEY bolumunde tek null olur uzerine yazar
        stdAges.put("Kaan", null);//Value da cok sayida kabul eder
        System.out.println(stdAges);//Esneklik icin kabul eder null i

        /*
        1) Treemap'ler entry'leri natural order'a gore siraya koyar, bu yuzden yavastirlar
        2) Treemap'ler  thread-safe ve synchronized degildir.
        3) Treemap'lerin key'lerinde null kullanilamaz(Comparator istisnasi var ama onerilmez),
        ama value kisimlarinda istediginiz kadar kullanabilirsiniz
        4) Treemapler key'e bakarak siralama yapar
 */
        TreeMap<String, Integer> countryPopulation = new TreeMap<>();
        countryPopulation.put("Germany", 83000000);
        countryPopulation.put("USA", 400000000);
        countryPopulation.put("Turkiye", 83000000);
        countryPopulation.put("Netherland", 1800000);

        //  countryPopulation.put(null, 18000);Hata verir
        countryPopulation.put("Italy", null);// value ya istedigin kadar null koyarsin
        countryPopulation.put("France", null);
        System.out.println(countryPopulation);
        //{France=null, Germany=83000000, Italy=null, Netherland=1800000, Turkiye=83000000, USA=400000000}

        /*
        LinkedHashMap, HashMap'e benzer, ancak ekleme sırasına göre sıralanmış bir şekilde verileri tutar.
        Yani, LinkedHashMap verileri eklediğiniz sırayla tutar ve bu sırayı korur.
        Bu nedenle, verileri eklediğiniz sırayla geri almanız gerektiğinde kullanışlı olabilir.

        **ornegin,bir takvim uygulamasında, etkinlikleri tarih sırasına göre tutmak için kullanılabilir.
        yada bir restoranın sipariş alım sistemi düşünün. Müşterilerin siparişlerini verme sırası,
        restoranın sipariş hazırlama sırasını belirler.

        Aynı mantık, müşteri hizmetleri çağrı merkezleri, sırayla hizmet veren işletmeler veya
        benzeri senaryolarda da kullanılabilir.
        Müşteri veya işlem sıralarını takip etmek için LinkedHashMap tercih edilebilir.*/

        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();
        lhm.put("Ayse", 25);
        lhm.put("Kemal", 34);
        lhm.put("Tuna", 30);
        for (Map.Entry<String, Integer> entry : lhm.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());

        }
        //ConcurrentHashMap Java'nın java.util.concurrent paketinde yer alan thread-safe bir Map cesididir.
        // ConcurrentHashMap, eş zamanlı okuma ve yazma işlemlerini destekler ve Hashtable gibi senkronize
        // edilmiş koleksiyonlara göre daha yüksek performans sunar.
        ConcurrentHashMap<String, Integer> s = new ConcurrentHashMap();
        s.put("Elma", 10);
        s.put("Muz", 20);
        s.put("null", 10);
        s.put("null", 30);

        System.out.println(s);

    }
}
