package guessoutput;

public class Q9 {
    public static void main(String[] args) {
        Base x = new Base();
        Base y = new Derived();
        Derived z = new Derived();
        print(x);//Base Class
        print(y);//Derived Class
        print(z);//Derived Class
    }

    static void print(Base base_obj) {
        base_obj.print();
    }
}


class Base {
    public void print() {

        System.out.println("Base Class");
    }
}

class Derived extends Base {
    public void print() {
        System.out.println("Derived Class");
    }

}
