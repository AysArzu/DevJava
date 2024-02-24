package day21oop;

import day20instanceblock_oop.Mammal;

public class Cat extends Mammal {
    public void meow() {
        System.out.println("Cats meow...");
    }

    @Override
    public void feedWithMilk() {
        System.out.println("Cats feed their kittens with milk...");
    }
}
