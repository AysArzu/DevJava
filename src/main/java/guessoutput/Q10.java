package guessoutput;

public class Q10 {
    public static void main(String[] args) {
        Test obj = new Test(15);
        System.out.println("var = "+obj.var);//var = 15
    }
}class Test{
    public int var=10;
    Test(int x){
        var =x;
    }
}
