package day12loops_arrays;

public class NestedLoops02 {
    public static void main(String[] args) {


        /*
        Draw the following pattern on the console:

        *
        * *
        * * *
        * * * *

         */


        for (int i = 1; i <= 4; i++) {

            for (int k = 1; k <= i; k++) {

                System.out.print("* ");


            }
            System.out.println();

        }
        //to sum up: value of (i) which is row number...
        //...defining number of repetition in nested loop where columns created...



    }
}

