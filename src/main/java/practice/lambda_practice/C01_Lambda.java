package practice.lambda_practice;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class C01_Lambda {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(-5, -2, -1, 2, -3, -4, 5, 69, 8, 54, 27, 58, 6, -4, 4, 4, 3);
        List<Integer> emptylist = new ArrayList<>();


//        System.out.println("Pozitif ve çift elemanlar");
//        printPositiveEvenNumbers(list);
//
//        System.out.println("Pozitif ve çift elemanlar method ref ile");
//        printPositiveEvenNumbersRef(list);
//
//        System.out.println("elemanları kareleri");
//        printUniqueSquares(list);
//
//        System.out.println("Azalan sıralanmış liste");
//        orderByDescList(list);
//
//        System.out.println("elemanların küpleri");
//        printCubesPositives(list);

        System.out.println("elemanların toplamı");
        printSum(emptylist);
        printSum(list);


    }

    //SORU1: List elemanlarının çift ve pozitif olanlarını,
    //Lambda Expression kullanarak tek satirda aralarında bosluk olacak sekilde yazdırın
    public static void printPositiveEvenNumbers(List<Integer> list) {

        list.stream().filter(t -> t > 0 && t % 2 == 0).//çift ve positive olanları seçtik, fiiltreledik
                forEach(t -> System.out.print(t + " "));//akıştaki herbir elemanı yazdırdık
        System.out.println();

    }

    //SORU2: List elemanlarının çift ve pozitif olanlarını,
    //Method Referances kullanarak tek satirda aralarında bosluk olacak sekilde yazdırın

    public static void printPositiveEvenNumbersRef(List<Integer> list) {

        list.stream().filter(Utils::isPositive).
                filter(Utils::isEven).
                forEach(Utils::print);
        System.out.println();
    }

    //SORU3 : List elemanlarının karelerini, tekrarsiz yazdırın
    public static void printUniqueSquares(List<Integer> list) {

//        list.stream().map(t->t*t).
//                       distinct().
//                       forEach(Utils::print);
//        System.out.println();
//method ref ile
        list.stream().map(Utils::findSquare).
                distinct().
                forEach(Utils::print);
        System.out.println();

    }

    //SORU4: List elemanlarını buyukten kucuge sıralayarak yazdırın
    public static void orderByDescList(List<Integer> list) {

        list.stream().sorted(Comparator.reverseOrder())//parametresiz olarak kullanıldığında natural ordera(ASC,artan) göre sıralar
                .forEach(Utils::print);
        System.out.println();
    }

    // SORU5 : List elemanlarının pozitif olanlarının, kuplerini bulup, birler basamagı 5 olanları yazdırınız
    public static void printCubesPositives(List<Integer> list) {
        list.stream().filter(Utils::isPositive).
                map(t -> t * t * t).
                filter(t -> t % 10 == 5).
                forEach(Utils::print);
    }

    // SORU6: List elemanlarının toplamını lambda expression ve method reference ile bulun ve yazdırın
    public static void printSum(List<Integer> list) {
        System.out.println(list.stream().reduce((t, u) -> t + u));

        //alternatif
        try {
            int total = list.stream().reduce((t, u) -> t + u).get();//DİKKAT! Null olabilir.
            System.out.println(total);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


        //alternatif 2
        int total2 = list.stream().reduce(0, (t, u) -> t + u);//identity kulannıldığında null olma ihtimali kalmaz
        System.out.println(total2);
    }

    public static void printSumRef(List<Integer> list) {
        System.out.println(list.stream().reduce(Integer::sum));

        System.out.println(list.stream().reduce(Math::addExact));

    }
}