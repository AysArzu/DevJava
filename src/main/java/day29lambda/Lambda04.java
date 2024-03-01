package day29lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lambda04 {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(Arrays.asList(2,3, 3,  5, 11, 10));
     tekrarsizCiftKarelerinToplami(nums);
    }//1)Bir list'teki "tekrarsiz","cift " elemanlarin "karelerinin"
        // "toplamını" hesaplayan method oluşturun
    public static void tekrarsizCiftKarelerinToplami(List<Integer> nums){
        //reduce()azaltmak: Koleksiyon elemanlarını tek bir değere indirger.
       int toplam= nums.
               stream().
               distinct().
               filter(t->t%2==0).
               map(t->t*t).
               reduce(0,(t,u)->t+u);//reduce(0, Integer::sum); javanin onerdigi
        System.out.println(toplam);
    }
}
