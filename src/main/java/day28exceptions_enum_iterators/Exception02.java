package day28exceptions_enum_iterators;

public class Exception02 {
    public static void main(String[] args) {
        int a = 12;
        int b = 1;
        int[] c = {3, 5, 7, 9};
        getir(c, a, b);
    }

    public static void getir(int[] c, int a, int b) {

        try {
            int idx = a / b;
            int element = c[idx];
            System.out.println(element);
        } finally {
            System.out.println("Database ile baglantiyi kesiniz");

        }
        System.out.println("Finally sonrasi app calisiyor");
        // Coklu finally block kullanilamaz
        //java da try + bir catch, try + birden fazla catch, try + catch + finally,
        // try + finally kullanilabilir.

        /*
        hata varsa ve sadece try finally varsa finally icinin yazilmasi ile executing durur!!! sonrasindaki kodlar calismaz
         */
    }
}
