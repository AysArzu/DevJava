package day11loop;

import java.util.Scanner;

public class WhileLoop02 {
    public static void main(String[] args) {
        //Example: Create a multiplication table on the console fo the given number by the user
        //table will be like this:
/*
  3 ==> 3x1=3
        3x2=6
        3x3=9
        3x4=12
        ....
        3x10=30
 */
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number to draw multiplication table");
        int num = scan.nextInt();
        int no = 1;
        while (no < 11) {

            System.out.println(num + "x" + no + "=" + no * num);

            no++;
        }
        System.out.println("***********************");

        //Ornek: 23'ten 12'ye kadar olan çift sayıları console' yazdırınız
         int k =23;
        while(k>11){
            if(k%2==0){
                System.out.println(k);

            }  k--;
        }
    }
}
