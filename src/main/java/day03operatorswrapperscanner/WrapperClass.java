package day03operatorswrapperscanner;

public class WrapperClass {
    public static void main(String[] args) {


        //Primitive data types: char, boolean, byte, short, int, long, float, double
        //I cant use "methods" with primitives...
        //But in order to manipulate data, we need methods...
        //Wrapper Classes: Character, Boolean, Byte, Short, Integer, Long, Float, Double
        /*
        By adding new features(methods) to Java primitive data types, a new structure is created which is called Wrapper Class
         */
        //For example: some arithmetic operations, performance augmentations, and flexibility on data need wrapper classes...
        //"Autoboxing" is the automatic conversion of primitive data types into their equivalent Wrapper Classes
        //The opposite is, converison from Wrapper to primitive," Unboxing".
        //Create an int data and convert to wrapper Integer (Autoboxing)
        int num = 3;
        //create a container in wrapper Integer then assign "num" in it....
        Integer newNum = num;
        //Assign the data from Wrapper Byte to primitive byte (unboxing)
        Byte a = 10;
        byte b = a; //10 is assigned into b as well.
    }
}
