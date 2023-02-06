package ru.nishpal.ithub.decorator;

public class SeniorJavaDeveloper extends JavaDecorator {
    public SeniorJavaDeveloper(JavaCoder javaCoder) {
        super(javaCoder);
    }

    public void senior() {
        System.out.println("i`m senior ha-ha");
    }

    @Override
    public void writeCode() {
        super.writeCode();
        senior();
    }
}

