package day32lambda;

import day31lambda.Utils;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class CourseRunner {
    //Course class'in parametreli constructor'ini kullanarak 4 tane Object olusturalim
    public static void main(String[] args) {
        Course courseTurkishDay = new Course("Summer", "Turkish Day", 97, 128);
        Course courseTurkishNight = new Course("Winter", "Turkish Night", 98, 154);
        Course courseEnglishDay = new Course("Spring", "English Day", 95, 132);
        Course courseEnglishNight = new Course("Winter", "English Night", 93, 144);

        List<Course> coursesList = new ArrayList<>();
        coursesList.add(courseTurkishDay);
        coursesList.add(courseTurkishNight);
        coursesList.add(courseEnglishDay);
        coursesList.add(courseEnglishNight);
        //  System.out.println(coursesList);

        //--------------------------
        /*  1)Tum “averageScore” larin 91’den buyuk olup olmadigini kontrol eden kodu yaziniz*/
        //allMatch metodu, akıştaki (stream) tüm öğelerin belirli bir koşulu karşılayıp karşılamadığını
        // kontrol eder. Eğer akıştaki tüm öğeler bu koşulu sağlarsa true döndürür,
        // aksi takdirde false döndürür.(VE gibi)

        boolean result1 = coursesList
                .stream()
                .allMatch(t -> t.getAverageScore() > 91);
        System.out.println(result1);
        //--------------------------
        //2)Tum kurslardaki ögrenci sayilarinin 100’den buyuk olup olmadigini kontrol eden kodu yaziniz
        boolean result2 = coursesList
                .stream()
                .allMatch(t -> t.getNumberOfStudent() > 100);
        System.out.println(result2);
        //--------------------------
        //3)Kurs isimlerinden en az birinin “Turkish” kelimesini icerip icermedigini kontrol eden kodu yaziniz.
        //anyMatch,Akıştaki herhangi bir elemanın belirli bir koşulu karşılayıp karşılamadığını kontrol eder.
        //Eğer akıştaki elemanlardan en az biri koşulu karşılıyorsa true döndürür, yoksa false döndürür.(VEYA gibi)
        boolean result3 = coursesList
                .stream()
                .anyMatch(t -> t.getCourseName().contains("Turkish"));
        System.out.println(result3);

        //4) Sezon isimlerinden en az birinin “Summer” kelimesini icerip icermedigini kontrol eden kodu yaziniz.
        boolean result4 = coursesList.stream().anyMatch(t -> t.getSeason().contains("Summer"));
        System.out.println("result 4 = " + result4);

        //--------------------------
        //5) Kurs donemleri icinde "Fall" doneminin hic bulunmadigini kontrol eden kodu yaziniz.

        //noneMatch, Akıştaki hiçbir elemanın belirli bir koşulu karşılamadığını kontrol eder.
        //Eğer akıştaki hiçbir eleman koşulu karşılamıyorsa true döndürür, aksi takdirde false döndürür.
        boolean result5 = coursesList.stream().noneMatch(t -> t.getSeason().contains("Fall"));
        System.out.println(result5);

        //--------------------------
        //6) Kurs isimleri icinde "German" isminin hic bulunmadigini kontrol eden kodu yaziniz.
        boolean result6 = coursesList.stream().noneMatch(t -> t.getCourseName().contains("German"));
        System.out.println(result6);

        //--------------------------
        //7)Average score'u en yuksek olan kursun ismini console yazdiran kodu yaziniz. ODEV.
        //a) sorted, Stream içerisindeki elemanları doğal sıralamasına göre sıralar.(kucukten buyuge)
        //Özel bir sıralama için bir Comparator’da alabilir.
        //b) Comparator.comparing, belirli bir özelliğe göre elemanları sıralamak için bir Comparator oluşturur.
        //c) reversed, Bir Comparator'ın sıralama sırasını tersine çevirir.
        //d) findFirst, Stream'deki ilk elemanı döndüren bir Optional döner.

        String courseWithHighestAverage = coursesList.stream().sorted(Comparator.comparing(Course::getAverageScore).reversed()).findFirst().get().getCourseName();
        System.out.println(courseWithHighestAverage);

        String courseWithHighestAverage2 = coursesList.stream().max(Comparator.comparing(Course::getAverageScore)).get().getCourseName();
        String courseWithHighestAverage3 = coursesList.stream().min(Comparator.comparing(Course::getAverageScore)).get().getCourseName();
        System.out.println(courseWithHighestAverage2);
        System.out.println(courseWithHighestAverage3);

        //--------------------------
        //8) Tum course object'lerini average score'a gore kucukten buyuge diziniz
        // ve ilk ikisi haric liste halinde console'a yazdiriniz.
        List<Course> myList = coursesList.stream().
                sorted(Comparator.comparing(Course::getAverageScore))
                .skip(2).
                collect(Collectors.toList());

       // System.out.println(myList);
        //[Course{season='Summer', courseName='Turkish Day', averageScore=97, numberOfStudents=128},
        // Course{season='Winter', courseName='Turkish Night', averageScore=98, numberOfStudents=154}]

        //--------------------------
        //9) Tum course object’lerini average score’a gore kucukten buyuge diziniz ve
        // ilk ucunu liste halinde console’a yazdiriniz.
        List<Course> yourList = coursesList.
                stream().
                sorted(Comparator.comparing(Course::getAverageScore)).
                limit(3).
                collect(Collectors.toList());
        System.out.println(yourList);

        //--------------------------
        //10)Kursta bulunan ogrenci sayilarina gore buyukten kucuge sirali bir sekilde
       // Listin icinde veren kodu yaziniz
        List<Course> newList = coursesList.
                stream().
                sorted(Comparator.comparing(Course::getNumberOfStudent).reversed()).
                collect(Collectors.toList());
        System.out.println(newList);
        //Gelistirme
        List<Integer> studentNumbersSorted = coursesList.
                stream().
                sorted(Comparator.comparing(Course::getNumberOfStudent).reversed()).
                map(Course::getNumberOfStudent).
                collect(Collectors.toList());

        System.out.println(studentNumbersSorted);//[154, 144, 132, 128]

        //--------------------------
        // 11) Kursta bulunan Ingilizce bolumlerinin sayisini veren kodu yaziniz
        int count=0;
        long english = coursesList.stream().filter(t-> t.getCourseName().contains("English")).count();
        System.out.println(english);//2 count() methodu bize long data type verir.

        //--------------------------
        //12) Ogrenci sayisi 140’tan az olan kurslari bir liste halinde veren kodu yaziniz
      List<Course> list =  coursesList.stream().filter(t->t.getNumberOfStudent()<140).collect(Collectors.toList());
        System.out.println(list);

    }
}
