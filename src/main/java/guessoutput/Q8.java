package guessoutput;

public class Q8 {
    public static void main(String[] args) {
        System.out.println(test());
    }

     static int test() {
      //  static int var =100; => static anahtar kelimesi burada kullanılmamalıdır.
       int var =100;
        return ++var;
     }
     /*

    Java'da iç içe static anahtar kelimesi kullanılamaz.
    Bu nedenle test() metodunun içindeki var değişkenine static anahtar kelimesini eklemek hatalı olacaktır.
    Ayrıca, bir metot içinde değişkenlere static anahtar kelimesi eklemek yaygın bir uygulama değildir;
    çünkü bu, değişkenin sınıfın örneğine bağlı olmadığını, yani sınıfa özgü olmayan bir değişken olduğunu belirtir.
      */
}
