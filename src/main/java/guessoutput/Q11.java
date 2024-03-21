package guessoutput;

public class Q11 { 
    int x = 10;

    public static void main(String[] args) {
        //Q11 obj; asli bu kodda hata almamak ve gostermek icin alttakini ekledim
        Q11 obj = new Q11();
        System.out.println(obj.x);
    }
    //java: variable obj might not have been initialized bu hatayi aliriz!!! objenin tanimlanmasi lazim!!!
    /*
    Obje olusturup classtaki nesnelere ulaştığımız için objeyi tanımlamamız gerekir.
    =>   Q11 obj = new Q11(); şeklinde tanımladığımız takdirde bu obje ile nesneye ulaşabiliriz.
    Diğer türlü CTE hatası alırız!!!
     */
}
