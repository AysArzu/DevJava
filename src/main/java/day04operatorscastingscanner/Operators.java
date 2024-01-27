package day04operatorscastingscanner;

public class Operators {
    public static void main(String[] args) {


//create two variables to store total amount of money and number of people in a team (use int)
//and calculate the amount per employee(teammate) and display on the console
//amount: 80 dollars
//num of employees: 32

        int totalAmount = 80;
        float numOfEmp = 32;

//per employee, how much to pay
        float result = totalAmount / numOfEmp;
        System.out.println(result);
        System.out.println(totalAmount / numOfEmp);
//both data are in "int". So result will be int even you expect decimal part. Java removed decimal part without rounding...
        //Comparison Operators:
        boolean a = 10 > 6;
        boolean b = 2 + 3 != 5;
        boolean c = 2 + 3 * 5 >= 19;

        System.out.println(a && b);
        System.out.println(a || b || c);


    }
}