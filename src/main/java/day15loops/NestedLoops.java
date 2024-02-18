package day15loops;

public class NestedLoops {
    public static void main(String[] args) {
        //Nested Loop
/*
for(){
      for(){

      }
  }
  */

  /*
  Type the code printing following output...

  Week 1:
      Day: 1
      Day: 2
      Day: 3

  Week 2:
      Day: 1
      Day: 2
      Day: 3

   */
        for (int i = 1; i < 3; i++) {
            System.out.println("Week : " + i);
            for (int j = 1; j < 4; j++) {
                System.out.println("  Day : " + j);
            }
        }
//Note: In main loop when we have starting point and condition is true;
//in loop body; nested loop is iterating for all the values...
//When nested loop is done iterating in all values; then Java will go to main loop increment/decrement part,
// and check second value in condition....


                  /*
                Example : Print the following pattern on the console

                        X X X X
                        X X X X
                        X X X X

                 */


        System.out.println("-----------------------");

        for (int i = 0; i < 3; i++) {
            System.out.println();
            for (int j = 0; j <5 ; j++) {
                System.out.print("*");
            }
        }
        System.out.println();   //This is just to proceed to next line when a row is created with print() in nested loop...
        //when nested loop is over for 1. row=> that sends us to next line for 2. row
        //... and second loop in main loop
    }
}
