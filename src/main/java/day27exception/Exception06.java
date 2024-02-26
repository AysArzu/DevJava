package day27exception;

public class Exception06 {
    public static void main(String[] args) {
        String s = "Java";
        karakterSayisi(s);
        String t = "";
        karakterSayisi(t);//0 verir

        String u=null;
        karakterSayisi(u);
    }public static void  karakterSayisi( String s){

        try {
            int a =s.length();
            System.out.println(a);
        } catch (Exception e) {
            System.err.println("Null degeri ile length() methodunu kullanmayiniz.");
        }
    }

}
