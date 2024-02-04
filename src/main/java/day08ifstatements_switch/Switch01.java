package day08ifstatements_switch;

public class Switch01 {
    public static void main(String[] args) {
//switch statement : based on different conditions we can do tasks with a simpler syntax...

//Example: Create a code to print day numbers based on the day names....

        //1. way: if - else if - else statements
        String dayName = "WEDNESday";

        if (dayName.equalsIgnoreCase("Sunday")) {
            System.out.println(1);
        } else if (dayName.equalsIgnoreCase("Monday")) {
            System.out.println(2);
        } else if (dayName.equalsIgnoreCase("Tuesday")) {
            System.out.println(3);
        } else if (dayName.equalsIgnoreCase("Wednesday")) {
            System.out.println(4);
        } else if (dayName.equalsIgnoreCase("Thursday")) {
            System.out.println(5);
        } else if (dayName.equalsIgnoreCase("Friday")) {
            System.out.println(6);
        } else if (dayName.equalsIgnoreCase("Saturday")) {
            System.out.println(7);
        } else {
            System.out.println("Invalid day name....");
        }

        //2. Way: Switch Statement
        //structure of switch......
 /*   switch (variableName) {

                case data1:  => codes to execute
                    break;

                case data2: => codes to execute
                    break;

                case data3: => codes to execute
                    break;

                case data4: => codes to execute
                    break;

                case data5: => codes to execute
                    break;

                case data6: => codes to execute
                    break;

                default: => codes to execute

    } */

//"break" keyword is optional to stop execution when find true statement....
        String daySwitch = "sunday";

        //we converted the data to all lowercase then check cases in switch...
        //used break keyword to stop printing after finding true
        switch (daySwitch.toLowerCase()){
            case "sunday":
                System.out.println(1);
                break;
            case "monday":
                System.out.println(2);
                break;
            case "tuesday":
                System.out.println(3);
                break;
            case "wednesday":
                System.out.println(4);
                break;
            case "thursday":
                System.out.println(5);
                break;
            case "friday":
                System.out.println(6);
                break;
            case "saturday":
                System.out.println(7);
                break;
            default:
                System.out.println("Enter a valid name ");
        }
        //default is used to execute code when cases don't match with the data...
    }
}
