package day16loops;

public class NestedLoops01 {
    public static void main(String[] args) {
//Example: Calculate total value of digits in decimal part in the given data...
        double num = 28.587;
        //valueOf() => split() => valueOf => loops with sum container
        // 5 + 8 + 7 => 20
        System.out.println("num = " + num);
        String strNum = String.valueOf(num);
        System.out.println("strNum = " + strNum); // "28.587"
        String decimalPart = strNum.split("[.]")[1]; //[.]  or  \\.
        System.out.println("decimalPart = " + decimalPart); //decimalPart = 587

        //convert String into integer again to do addition operation
        int decimalPartInt = Integer.valueOf(decimalPart); // 587 => unboxing
        int sum = 0;   // 587 ==> 0 + 5 + 8 + 7 => 20
        for(int i= decimalPartInt; i>0; i/=10){
            sum = sum +  i % 10;
        }
        System.out.println("sum = " + sum);

    }
}
