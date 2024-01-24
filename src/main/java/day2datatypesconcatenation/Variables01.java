package day2datatypesconcatenation;

import java.util.Arrays;

public class Variables01 {

    public static void main(String[] args) {
//3) int data type: occupies 32 bit (4 byte) in memory
//-2,147,483,647 <-> 2,147,483,648  : interval

        //Example: Create two int data and print total value of them on the console...
        int a = 8, b = 7, total;
        total= a + b;
        System.out.println("Total Value = " + total);

        //4) long data type: occupies 8 byte (64 bit) in memory
        //-9,223,372,036,854,775,808 <-> 9,223,372,036,854,775,808
        //Note: If a number that you want to store is out of int interval, you need to put L at end of the data...
        //Otherwise, you get "Integer number too large" error occurs...

        //Example: Create a variable and store number of cells in a human body
        long numOfCells = 123456789012L; //typing long as data is not enough to make data long. so put L at the end.
        //long number = 100; //even data type is long, it is saved as int in database. bcs number is in integer interval...
        System.out.println(numOfCells);
        System.out.println( "Number Of Cells => " + numOfCells); //Number Of Cells => 123456789012

        System.out.println("Num Of Cells = " + numOfCells);


        System.out.println("numOfCells = " + numOfCells); // variableName.soutv + enter


        //5) float data type: occupies 32 bit (4 byte) in memory.
        //contains decimal numbers...
        //when you store float data, you must put "f" or "F" at the end.
        //bcs Java wants to keep accuracy high in decimal data and by default using double data type...

        //Example: Create two float data and print total value on the console...
        float priceOfBook = 13.99F;
        float priceOfCoffee = 15.99f;

        System.out.println("Total Value=>  " + (priceOfBook + priceOfCoffee)); //Total Value=>  29.98


    }
}



