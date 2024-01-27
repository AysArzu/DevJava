package day04operatorscastingscanner;

public class TypeCasting {
    public static void main(String[] args) {
        /*Converting numeric primitive data types to each other is "Type Casting"
         byte - short - int - long - float - double

        Note: Converting smaller data types to larger data types are performed by Java automatically.
        This is AutoWidening. We just widen the place in memory for our data....

         byte > short > int > long > float > double


        Note2: Converting larger data types into smaller ones is too risky.
         Data loss can occur...Bcs of that Java don't do this automatically...
        This is under responsibility of developers...
         This operation is "Explicit Narrowing"...*/

        //Example: create a data in byte, and assign into int.... (auto widening)
        byte age = 19;//created in smaller data type
        int alt = age;//assigned into larger data type

        int mySalary = 190000;
        short salary = (short) mySalary;
        System.out.println("salary = " + salary);

        //by typing target data type in the parenthesis, I am getting permission from Java to do assignment from....
        // .... larger to smaller data type


        //JAVA LIBRARY? => Basically We have JAVA STANDARD LIBRARY in our project.
        //java.lang : contains classes like "Object", "String", "System", "Integer"... etc.
        //java.util : ArrayList, LinkedList, HashSet, Scanner, Random, Set, List
        //java.io : Used for input and output performing... File can be taken as an input...
        //java.sql : Used to perform actions in database: connection, manipulation...

        //we need "import" keyword in order to use some elements from a library package...
        //we need to make some necessary classes available in our current class by importing


        //There are some 3rd party libraries...
        //Apache Commons
        //Spring Framework
        //Selenium
        //JavaFX, UI
        //Hibernate
    }
}
