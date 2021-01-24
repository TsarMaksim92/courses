package eu.senla.task2.main;

import eu.senla.task2.rainbow.Rainbow;

public class Main {
    public static void main(String[] args) {
        Rainbow rainbow = new Rainbow();
        System.out.println(rainbow.rainbow(1));
        System.out.println(rainbow.rainbow(2));
        System.out.println(rainbow.rainbow(3));
        System.out.println(rainbow.rainbow(4));
        System.out.println(rainbow.rainbow(5));
        System.out.println(rainbow.rainbow(6));
        System.out.println(rainbow.rainbow(7));
        System.out.println(rainbow.rainbowTwoColor(1, 2));
        System.out.println(rainbow.rainbowTwoColor(2, 3));
        System.out.println(rainbow.rainbowTwoColor(3, 4));
        System.out.println(rainbow.rainbowTwoColor(4, 5));
        System.out.println(rainbow.rainbowTwoColor(5, 6));
        System.out.println(rainbow.rainbowTwoColor(6, 7));

    }
}
