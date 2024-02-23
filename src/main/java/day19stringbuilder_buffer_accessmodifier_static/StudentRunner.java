package day19stringbuilder_buffer_accessmodifier_static;

public class StudentRunner {
    public static void main(String[] args) {
        //Student class'tan bir instance olusturalim
        Student ayse = new Student();

        System.out.println(ayse.stdName); //Ayse Arzu - public
        System.out.println(ayse.email); //ayse@gmail.com, default- ayni package, ulastik
        System.out.println(ayse.address); //Istanbul- protected-ayni package
        //farkli package olsa, child'lar gorur
        //System.out.println(ayse.tcKimlik); HATA- private

        System.out.println(ayse); //@36baf30c toString koymazsam verir
        //Student{stdName='Ayse Arzu', address='Istanbul', email='ayse@gmail.com'}

    }
}
