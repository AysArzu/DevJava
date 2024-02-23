package day19stringbuilder_buffer_accessmodifier_static;

public class Student02Runner {
    public static void main(String[] args) {


        //Static class uyelerine ulasmak icin sadece class ismi yeterlidir
        System.out.println(Student02.stdName); //Ayse Arzu

        //age non-static oldugu icin, ona ulasmak icin object olusturmaliyiz
        Student02 ayse = new Student02();
        System.out.println(ayse.age); //18

        Student02.staticMethod(); //Ben static bir metodum
        ayse.nonStaticMethod(); //Ben non-static bir metodum

    }

}
