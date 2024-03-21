package guessoutput;

public class Q12 {
    public static void main(String[] args) {
        DerivedClass d = new DerivedClass();
        d.foo();
    }
}

class BaseClass {
    protected void foo() {
        System.out.println("Base class foo()");
    }
}

class DerivedClass extends BaseClass {
     /* void foo(){
        System.out.println("Derived class foo()");
    }*/
// yorula aldim cunku derived classta default method var ve
// bu method ya public ya da protected olmalidir!!!
// Child parent'a kisitlama koyamaz!
}
