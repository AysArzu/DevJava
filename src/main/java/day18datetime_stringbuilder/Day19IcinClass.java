package day18datetime_stringbuilder;

import day19stringbuilder_buffer_accessmodifier_static.Student;

public class Day19IcinClass {
    public static void main(String[] args) {
        Student student= new Student();
        System.out.println(student.stdName);//Ayse Arzu

        System.out.println(student.toString());//Student{stdName='Ayse Arzu', address='Istanbul', email='ayse@gmail.com'}
        /*
        toString() methodu veri sizintisina sebep oluyor o yuzden kullanirken
        dikkat etmek gerekir!!! ondan dolayi encapsulation veri guvenligi icin en  iyi yoldur!
         */
    }
}
