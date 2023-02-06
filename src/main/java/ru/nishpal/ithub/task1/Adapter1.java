package ru.nishpal.ithub.task1;

public class Adapter1 extends OldPhone implements SmartPhone{
    @Override
    public void paly() {
        System.out.println("Play");
    }

    @Override
    public void writeMessage() {
        System.out.println("write");
    }
}
