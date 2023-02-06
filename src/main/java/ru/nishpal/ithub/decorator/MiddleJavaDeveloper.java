package ru.nishpal.ithub.decorator;

public class MiddleJavaDeveloper extends JavaDecorator{
    public MiddleJavaDeveloper(JavaCoder javaCoder) {
        super(javaCoder);
    }

    public void makeCodeReview() {
        System.out.println("Middle java developer make code review");
    }

    @Override
    public void writeCode() {
        super.writeCode();
        makeCodeReview();
    }
}
