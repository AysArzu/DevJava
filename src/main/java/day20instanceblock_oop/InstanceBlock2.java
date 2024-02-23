package day20instanceblock_oop;

public class InstanceBlock2 {
    public int year;

    //instance block
    {
        System.out.println("Herkese selam");
    }

    public InstanceBlock2() {
        //System.out.println("Herkese selam"); sileriz
    }

    public InstanceBlock2(int year) {
        //System.out.println("Herkese selam"); sileriz kod tekrari olmasin diye yukaridaki instance block'a attik
        this.year = year;
    }
}
