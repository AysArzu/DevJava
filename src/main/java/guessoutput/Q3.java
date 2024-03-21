package guessoutput;

public class Q3 {
    Q3(int a, int b) {
        System.out.println("parameterized Constructor 1");
    }

    Q3(int a, float b) {
        System.out.println("parameterized Constructor 2");
    }

    public static void main(String[] args) {
        byte a = 10;
        byte b = 20;
            Q3 obj =new Q3(a,b);//parameterized Constructor 1
        // byte'a en yakin deger ne ise onda islem yapilir!! bu yüzden birinci constructor çalıştı!
        // Siralama şu şekildedir:
        // byte>short>int>long>float>double.
    }
}
