package day01variables;

public class Variables01 {
    public static void main(String[] args) {
        //      COMPARISON OPERATORS (They Return True or False)
        //         Mostly Used in Conditional Statements
    /*
        EQUAL TO        : "=="   ==>     myAge == 28   (returns true or false)
        Not EQUAL TO    : "!="   ==>     myAge != 28   (returns true or false)
        Note: "!" in Java means NOT in English.

        Greater Than    : ">"    ==>   8 > 7  (returns true)
        Less Than       : "<"    ==>   5 < 3  (returns false)

        Greater Than or Equal to :  ">="   ==>  12 >= 11 (returns true)
        Less Than or Equal to    :  "<="   ==>  13 <= 12 (returns false)

        Returning data (true or false) will be in Boolean data type...

        Note: "==" represents equality in JAVA. "=" is assignment operator.
        Assignment Operator; assigns the data on the right into the variable/container on the left.


         */
        //LOGICAL OPERATORS
/*
        AND :   "&&"  represents AND operator. Shift + 6   ==> AND operator is perfectionist. Need all of them true to get true in result.

        OR :   "||" represents OR operator. Shift + key between z and left shift ==> So generous. One true is enough to get true.


        Tamara = 30       Nahed = 25       Ayse = 18

        Tamara <= 35 && Nahed > 25  ===>>>  FALSE

        (Ayse != 19  && Nahed < 26 ) || Tamara == 28

*/
//MATH OPERATIONS
    /*
    Addition : +
    Multiplication : *
    Subtraction: -
    Division: /
    //OPERATION PRIORITY
1) If there is parenthesis; inside the parenthesis is executed first.
2) Multiplication/Divison has first priority between operators. *  /
3) Addition/Subtraction has second priority between operators. +  -
8/2*(2+2) : 16
30 - 3 + 2*3 :
     */
        String greeting = "Hello Batch 239";
        System.out.println(greeting);

        //Create a data in int data type and assign 13. then print on the console

        int number = 13;
        System.out.println(number);
        System.out.println("number = " + number);//soutv

        //1) byte data type:
        //for whole numbers (integers)... occupies 1 byte in memory
        //Example: Create a data type in byte, and assign student age in it

        byte ageOfStudent = 13;
        System.out.println(ageOfStudent);

        //-------------------------------------------
        System.out.println("----------------------");
        //-------------------------------------------

        //2-) short data type
        //for whole numbers, occupies 2 byte ()

        short popOfTown = 1390;
        System.out.println("Population of the Town:   " + popOfTown);


    }

}
