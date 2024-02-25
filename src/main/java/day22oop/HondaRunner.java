package day22oop;

public class HondaRunner {
    public static void main(String[] args) {

        //Honda h = new Honda(); Abstract class'tan object uretilmez

        Civic c = new Civic();
        c.engine(); //Civic Gas 1.6 eco

        Accord a = new Accord();
        a.engine(); //Accord Gas 2.0 Turbo

        a.music(); //Pro

    }
}
