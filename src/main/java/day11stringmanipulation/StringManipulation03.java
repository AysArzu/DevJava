package day11stringmanipulation;

public class StringManipulation03 {
    public static void main(String[] args) {

        //Example: Calculate total price of the products given below in string data type
        //you can use valueOf() method to convert String into double....
        //expected result:  456.99 + 875.99 = 1332.98
        String tv = "$456.99";
        String laptop = "$875.99";
        System.out.println(tv);
        System.out.println(laptop);

        tv = tv.replace("$", ""); //remove dollar sign and put nothing instead, and update existing container
        System.out.println(tv);


        laptop = laptop.replace("$", "");
        System.out.println(laptop);
        //use Double wrapper class to access valueOf method.. dont use primitive double

        Double totalPrice = Double.valueOf(tv) + Double.valueOf(laptop);

        System.out.println("totalPrice = " + totalPrice); //totalPrice = 1332.98
        System.out.println("totalPrice = $" + totalPrice); //totalPrice = $1332.98


        //Example 2: Print initials of firstname and lastname of names entered by user...
        // "    Mike   Tyson   "  => MT

        //trim()
        // split()


    }

}
