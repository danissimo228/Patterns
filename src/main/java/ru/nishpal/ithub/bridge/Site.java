package ru.nishpal.ithub.bridge;

public class Site extends Program {
    public Site(Dev dev) {
        super(dev);
    }

    @Override
    public void developProgram() {
        System.out.println("Website");
        dev.writeCode();
    }
}
