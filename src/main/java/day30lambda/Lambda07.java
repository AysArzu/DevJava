package day30lambda;

import java.util.*;

public class Lambda07 {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(Arrays.asList(2, 2, 4, 5, 11, 10));
//7)Verilen List’teki “minimum değeri” bulmak için bir method oluşturun
        minDegerBul(nums);
        minDegerBul2(nums);
        minDegerBul3(nums);
        minDegerBul4(nums);
        minDegerBul5(nums);

    }

    //1.Yol
    public static void minDegerBul(List<Integer> nums) {
        int min = nums.stream().distinct().reduce(Math::min).get();
        System.out.println(min);
    }

    //2.yol
    public static void minDegerBul2(List<Integer> nums) {
        Integer min = nums.stream().distinct().reduce((t, u) -> t > u ? u : t).get();
        //baslangic degeri yoksa optional cikar. ondan dolayi get() kullaniyoruz
        System.out.println(min);
    }

    //3.yol
    public static void minDegerBul3(List<Integer> nums) {
        Integer min = nums.stream().distinct().reduce(Integer.MAX_VALUE, (t, u) -> t < u ? t : u);
        System.out.println(min);
    }

    //4.yol
    public static void minDegerBul4(List<Integer> nums) {
        Optional<Integer> min = nums.stream().distinct().sorted().reduce((t, u) -> t);

        if (min.isPresent()) { //min'de bir deger var mi?
            System.out.println(min.get()); //2
        } else {
            System.out.println("Liste bos veya minimum deger bulunamadi");
        }
    }

    //5.yol
    //sorted(Comparator.reverseOrder()) ifadesi,
    // Java Stream API’si içinde bir koleksiyonu ters sıralamak için kullanılır.
    //Comparator class, reverseOrder() methoddur.
    public static void minDegerBul5(List<Integer> nums) {
        Integer min = nums.stream().distinct().sorted(Comparator.reverseOrder()).reduce((t, u) -> u).get();
        System.out.println(min);
    }
}