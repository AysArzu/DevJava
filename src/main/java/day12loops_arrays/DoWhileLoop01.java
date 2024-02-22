package day12loops_arrays;

import java.util.Scanner;

public class DoWhileLoop01 {
    public static void main(String[] args) {
        //do while loop ile while loop arasindaki fark nedir?
        /*Asagidaki kodda gosterilecegi gibi WHILE dongusune giremez cunku sart saglanmiyor.
        * While-loop da loop'un kırılması mümkündür çünkü önce kural kontrol edilir sonra işlem yapılır
        * do-while loopun en basta kirilmasi mumkun degildir.
        * Once bir kere calistirilir(tabi sonsuz donguye sokulmazsa) sonra kural kontrol edilir*/

        int k=1;
        while(k<1){
            System.out.println("Ben bir loop'um");// loopa girmez
            k++;
        }
        do {
            System.out.println("Ben bir do-while loop'um ");
            k++;
        }while (k<1);

        //.........while
        /*
        starting value

        while (condition to start loop){
           // codes to execute
           // increment/decrement
        }
         */
        //.........do while
         /*
        starting value
        do{
                //codes to execute
                //increment/decrement
                } while(condition to run the loop)

             */
        //Example 1 : print the number from 5 to 3 on the console
        int num = 5;
        do {

            System.out.println(num);
            num--;
        } while (num > 2);

        //in do while, even the condition is false in first check; it will do one task before condition in do body...
        //This is the difference between while loop and do while loop.
        // do-while => does something first then thinks about it....


        //Example 2: Accept input from user:
        //if password and username are correct: print "Welcome to your account"
        //If username and password are incorrect; print 4 times "Enter your username and password"
        //If username and password are incorrect in fourth time again, print "Account is blocked"
        //username= "admin"    password= "pwd123"


        Scanner scan = new Scanner(System.in);
        int counter = 0;
        do {
            if (counter == 4) {
                System.out.println("Account is blocked");
                break;
            }
            System.out.println("Enter your username");
            String username = scan.next();

            System.out.println("Enter your password");
            String pass = scan.next();

            if (username.equals("admin") && pass.equals("pwd123")) {
                System.out.println("Welcome to your account");
                break;
            }
                counter++;


        } while (true);
    }


}
