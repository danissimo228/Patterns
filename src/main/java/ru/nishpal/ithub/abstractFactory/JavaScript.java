package ru.nishpal.ithub.abstractFactory;

public class JavaScript implements Language{
    @Override
    public void getLanguage() {
        System.out.println("JavaScript!");
    }
}
