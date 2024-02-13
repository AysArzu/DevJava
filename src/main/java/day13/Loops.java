package day13;

public class Loops {
    public static void main(String[] args) {

        //Print "Hi" five times on the console
        System.out.println("Hi"); //1
        System.out.println("Hi"); //2
        System.out.println("Hi"); //3
        System.out.println("Hi"); //4
        System.out.println("Hi"); //5
        //There is repetition and not good...
        //Java created loop structures to handle repetitive tasks...

        //2. Way:
        //Loops: Repetitive tasks are handled with loops in JAVA
        // in a specified condition, repetition is performed by loops based on the need in the task

        /*
        1) for loop
        2) while loop
        3) do while loop
        4) for each loop
                 */

        //for loop: we define a starting point(value), ending point to exit loop, direction from start to end
        // so we can modify loop structure based on our need in a flexible way

        System.out.println("------------------");

        //for(startingValue; condition to stop ; direction=> increment/decrement){loop body}

        for (int i = 101; i < 106; i++) {

            System.out.println("Hi");
        }

        System.out.println("----------------");

        //Example2: Print the numbers from 20 to 8 on the console (8 is included)
        for (int i = 20; i > 17; i--) {
            System.out.println(i);
        }

        System.out.println("---------------");

        //Example 3: Print all the even number from 3 to 10 on the console
        // 4 - 6 - 8 - 10
        for (int x = 3; x < 11; x++) {

            if (x % 2 == 0) {

                System.out.println(x);
            }
        }

        //2. Way: Requires Math knowledge
        for (int x = 4; x < 11; x += 2) {

            System.out.println("2. Way: " + x);
        }


        //Example4: Print odd numbers from 21 to 9 on the console

        for (int i = 21; i > 8; i--) {

            if (i % 2 != 0) {
                System.out.println(i);
            }
        }

        //Example 5: In the given String, print all the characters before "m" on the console
        //Miami => Mia
        // break keyword...
        String word = "Miami";

        int length = word.length();

        for (int i = 0; i < length; i++) {
            char character=word.charAt(i);
            if (word.charAt(i) == 'm') {

                break;
            }         System.out.print(character);

        }
        System.out.println();
        System.out.println("----------------------------------------");
        int indexOfM=word.indexOf("m");
        for (int i = 0; i <indexOfM ; i++) {
           if(i==indexOfM){
               break;
           }
            System.out.print(word.charAt(i));
        }
    }
}
