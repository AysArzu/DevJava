package day11loop;

public class WhileLoop01 {
    public static void main(String[] args) {

    /*    //.... for Loop
        for (startingValue;condition to exit loop;decrement/increment) {
            body to execute
        }*/
        //.........while
        /*
        starting value

        while (condition to start loop){
        codes to execute
        increment/decrement
         */

        //Example : Print the number from 3 to 6
        for (int i = 3; i <7 ; i++) {
            System.out.println(i);
        }
        System.out.println("-----------------------------");
        int num = 3;
        while (num < 7) {
            System.out.println(num);
            num += 1;
        }
        //Example 1: Print even numbers from 61 to 51....
        int m = 61;
        while(m>50){
            if(m%2 == 0){
                System.out.println(m);
            }
            m--;
        }
    }
}
