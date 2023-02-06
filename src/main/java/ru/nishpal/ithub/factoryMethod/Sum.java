package ru.nishpal.ithub.factoryMethod;

public class Sum implements Calculate{
    @Override
    public void calculation(int x, int y) {
        System.out.println("x + y = " + x+y);
    }
}
