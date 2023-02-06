package ru.nishpal.ithub.factoryMethod;

public class Divide implements Calculate{
    @Override
    public void calculation(int x, int y) {
        if (x != 0) System.out.println("x / y = " + x / y);
        else {
            System.out.println("Error");
        }
    }
}
