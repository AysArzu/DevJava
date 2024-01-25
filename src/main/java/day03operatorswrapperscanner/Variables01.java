package day03operatorswrapperscanner;

public class Variables01 {
    public static void main(String[] args) {

        // float and double are for decimal numbers.....
        //Java is inclined to take the data into double variables to keep accuracy high in decimal part

        // 6) double data type: occupies 8 byte (64 bit) in memory
        //Example: Create a variable to store weight of a cell in human body and print on the console


        double weightOfCell = 0.000000000000028;
        System.out.println("Weight of a Cell => " + weightOfCell); //2.8E-14 => two point eight times ten to the power of negative fourteen

        System.out.println("WEIGHT OF A CELL = " + weightOfCell);

        //--------------------------------------------------------------

//7) char data type: occupies 2 byte... used to store one single character => Symbols, digits, letters etc.
// unlike String; '' => single quotation is used to declare data...

//Example: create a variable in char data type and store initial of your name...
        char initialOfMyName='A';
        System.out.println("initialOfMyName = " + initialOfMyName);


        //when you are in console; ctrl+shift+f10  => runs method again....

        //8) boolean data type: accept true or false as a data...

        //Example: we have an old man. please store the data if he is retired or not (assign true)

        boolean isRetired = true;
        System.out.println(isRetired);


        //practice
        boolean b1 = true;
        boolean b2 = true;
        boolean b3 = false;
        boolean b4 = 3>5;

        System.out.println(b1 && b2); //true
        System.out.println(b2 || b3); //true
        System.out.println(b2 && b4); //false
        System.out.println(b3 || b4); //false

        //-------------------------
        // What is the difference between   System.out.println();    and    System.out.print();
        System.out.println("Hello");
        System.out.println("World");
        System.out.println("-----------------------");
        System.out.print("Hello");
        System.out.print(" ");
        System.out.print("World");
    }
}
