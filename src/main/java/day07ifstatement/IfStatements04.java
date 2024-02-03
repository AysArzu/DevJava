package day07ifstatement;

import java.util.Scanner;

public class IfStatements04 {
    public static void main(String[] args) {
        //Example: Check the given day name, and print Weekend or Weekday accordingly...
        //Monday - Friday => Weekday
        //Saturday, Sunday => Weekend
        Scanner inputDay = new Scanner(System.in);
        System.out.println("Enter a day name and I say weekday or weekend!");
        String day = inputDay.next();
        //equals() compares two String and return true or false
        //equals() method is a case-sensitive method for String data
        //If you want to ignore being uppercase or lowercase of String...
        //... you can use equalsIgnoreCase()
        boolean weekendCondition = day.equals("Saturday") || day.equals("Sunday");
        boolean weekdayCondition = day.equals("Monday") || day.equals("Tuesday") ||
                day.equals("Wednesday") || day.equals("Thursday") ||
                day.equals("Friday");
        if (weekendCondition) {
            System.out.println("Weekend!");
        } else if (weekdayCondition) {
            System.out.println("Weekday!");
        } else {
            System.out.println("Invalid Day Name!");
        }
        //use equalsIgnoreCase
        //2nd Way: Recommended
        boolean weekendCondition1 = day.equalsIgnoreCase("Saturday") || day.equalsIgnoreCase("Sunday");
        boolean weekdayCondition1 = day.equalsIgnoreCase("Monday") || day.equalsIgnoreCase("Tuesday") ||
                day.equalsIgnoreCase("Wednesday") || day.equalsIgnoreCase("Thursday") ||
                day.equalsIgnoreCase("Friday");
        if (!weekendCondition1 && !weekdayCondition1) { //!weekendCondition1 && !weekdayCondition1
            System.out.println("Invalid Day Name!");
        } else if (weekendCondition1) {
            System.out.println("Weekend!");
        } else {
            System.out.println("Weekday!");
        }
    }
}
