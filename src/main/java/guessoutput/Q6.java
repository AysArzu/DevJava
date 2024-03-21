package guessoutput;

public class Q6 {
    Q6() {
       // this = null;
        System.out.println("Q6 constructor");
    }

    public static void main(String[] args) {
        Q6 obj = new Q6();
    }/*
   - Java'da bir nesnenin kendisini null olarak ayarlamak mümkün değildir.
     Bu durumda this=null; ifadesi hata verecektir.
   - CTE verir. Eger calistirmaya kalkarsak ta "java: cannot assign to 'this'" ciktisiyla karsilasiriz
   - this anahtar kelimesi, nesnenin kendisini temsil eder ve
    sabit bir referans olduğu için bu tarz bir değişiklik yapılamaz.
     */
}
