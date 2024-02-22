package day10stringmanipulation;

public class StringManipulation06 {
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
        //use Double wrapper class to access valueOf method.. don't use primitive double

        Double totalPrice = Double.valueOf(tv) + Double.valueOf(laptop);

        System.out.println("totalPrice = " + totalPrice); //totalPrice = 1332.98
        System.out.println("totalPrice = $" + totalPrice); //totalPrice = $1332.98


        //Example 2: Print initials of firstname and lastname of names entered by user...
        // "    Mike   Tyson   "  => MT

        //trim()
        // split()
        String name = "    Mike   Tyson   ";
        String realName = name.trim().replaceAll("\\s", " ");
        String arr[] = realName.split("\\s+");
        String nameInitial = arr[0];
        String lastNameInitial = arr[1];
        System.out.println("lastNameInitial = " + lastNameInitial);
     // String initials = String.valueOf(nameInitial.charAt(0)) + String.valueOf(lastNameInitial.charAt(0));
        String initials =""+ nameInitial.charAt(0)+lastNameInitial.charAt(0);
        System.out.println(initials);
    }

}
