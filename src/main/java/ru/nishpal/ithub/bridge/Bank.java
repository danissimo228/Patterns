package ru.nishpal.ithub.bridge;

public class Bank extends Program{

    public Bank(Dev dev) {
        super(dev);
    }

    @Override
    public void developProgram() {
        System.out.println("Bank System");
        dev.writeCode();
    }
}
