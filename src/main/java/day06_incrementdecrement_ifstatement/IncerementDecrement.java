package day06_incrementdecrement_ifstatement;

public class IncerementDecrement {

    public static void main(String[] args) {

        //Increment
        int a = 7;
        //add 2 and assign into existing container...
        a = a + 2;
        System.out.println(a); //9

        a += 2; // a = a + 2; those are the same
        System.out.println(a); //11

        System.out.println("------------------------");


        //Decrement......
        int c = 10;
        System.out.println("Original= " + c);
        c = c - 4; //decrease by 4, and update container
        System.out.println("Decreased= " + c);//6

        //shorter syntax for decrement
        c -= 4;
        System.out.println("Shorter Syntax= " + c);


        System.out.println("------------------------");

        //Increment with multiplication

        int x = 8; //multiply by 3
        x = x * 3;
        System.out.println(x);//24

        x *= 3;
        System.out.println("Shorter syntax= " + x); //72


        //Decrement with division

        int e = 25;
        e = e / 5;
        System.out.println(e); //5

        e /= 5;
        System.out.println(e);


        // "increment by 1"
        System.out.println("...........INCREMENT by 1..........");
        int f = 13;
        f = f +1;
        f += 1; //used f once here
        f++; //shortest one...
        System.out.println(f);



        //"decrement by 1"
        System.out.println("...........DECREMENT by 1..........");
        int h = 15;
        System.out.println(h);
        h = h - 1;
        System.out.println(h);
        h -= 1;
        System.out.println(h);
        h--;
        System.out.println(h);


        //---post increment (i++), pre increment(++i)
        System.out.println("Post Increment & Pre Increment");
        int i = 10;
        System.out.println("original i = " + i);

        int k = i++;
        System.out.println("k= " + k);
        System.out.println("i= " + i);


        //pre increment
        int m = 21;
        System.out.println("original m= " + m);
        int n = ++m; //increase m first, then assign into n
        System.out.println( m + " and " + n);



        //---post decrement (i--), pre decrement(--i)

        //post
        System.out.println("post");
        int p = 17;
        System.out.println("original p = " + p);
        int r = p--;  //=> r = 17, p = 16
        System.out.println("r = " + r + " p = " + p);

        //pre
        System.out.println("pre");
        int s = 20;
        System.out.println("original p = " + s);
        int t = --s; // t = 19, s = 19
        System.out.println("t = " + t + " s = " + s);


    }

}
