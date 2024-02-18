package day16loops;

public class WhileLoop03 {
    public static void main(String[] args) {
        //Interview Question
        //Example: Create java application to check if the given number is palindrome or not
        // 121 ===> 121   123321  ==> 123321   303 ==> 303
        int x= 313;
        String xStr = String.valueOf(x);
        int i = xStr.length()-1;
        String reversed ="";
        while (i>=0){
            reversed=reversed+xStr.charAt(i);
            i--;
        }
        System.out.println(reversed);
    if (xStr.equals(reversed)){
        System.out.println("Palindrom");
    }else {
        System.out.println("Not Palindrom");
    }
    }

}
