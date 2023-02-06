package ru.nishpal.ithub.decorator;

// Для порождения и расширения классов
public class JavaDecorator implements JavaCoder{
    JavaCoder javaCoder;

    public JavaDecorator(JavaCoder javaCoder) {
        this.javaCoder = javaCoder;
    }

    @Override
    public void writeCode() {
        javaCoder.writeCode();
    }
}
