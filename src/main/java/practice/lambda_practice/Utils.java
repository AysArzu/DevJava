package practice.lambda_practice;

import java.util.List;

public class Utils {
    public static boolean isPositive(int number) {

        return number > 0;
    }

    public static boolean isEven(int number) {

        return number % 2 == 0;
    }

    public static void print(Object o) {
        System.out.print(o + " ");
    }

    public static int findSquare(int i) {
        return i * i;
    }
    public static void sum(List<Integer> list){
      int sum=0;
        for (Integer w : list) {
            sum+=w;
        }
        System.out.println(sum);
    }
}
