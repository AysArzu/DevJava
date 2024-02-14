package day13;

public class StringManipulation01 {
    public static void main(String[] args) {


        //The difference between "==" and equals()
        //Heap Memory... Stack Memory


        //Memory Management in JAVA: is performed by JVM(Java Virtual Machine) automatically
        //We have two main memory: "Heap" and "Stack"

        //Heap Memory: 1) Dynamically created objects are stored in Heap Memory
        //            I mean when we use "new" keyword, we are using Heap Memory. (like => new Scanner())

        //Stack Memory is used to call methods and local variables (int x = 10;)
        //Stack memory is faster and has limited space. We have addresses (references) here. Like a navigation.
        //Primitive data types (int, char, float, double, boolean, short, byte, long) are stored in Stack Memory.

        //Non-Primitive data types, objects are stored in Heap Memory
        //In Stack Memory, we have references of the data stored in Heap.
        //Programming languages like JAVA; using Stack for references and using Heap for the Data.
        //That provides fast access to data through the address from Stack.


        String s = "Tom";

        int a = 12;


        String str1 = "Hello";

        String str2 = "Hello";
        //when values are the same, they have same place in heap and address in stack.

        System.out.println(str1 == str2);
        System.out.println("equals=> " + str1.equals(str2));

        String str3 = "Bye";
        String s1 = "Bye";

        System.out.println("--------------------------");

        String str4 = new String("Hello"); //created instance/object with new keyword from String class...
        String str5 = new String("Hello");
        //whenever I have "new" keyword, they have different places in memory....

        System.out.println(str4 == str5); //false
        System.out.println("equals => " + str4.equals(str5)); //true

        //equals method checks just values, if they are the same; returns true
        //"==" checks values and addresses, even values are the same; if address is different
        //... it will return false

        int x = 12;
        int y = 12;

        System.out.println(x == y);//true
        //Bcs primitives are in all Stack, they don't have address


    }


}


