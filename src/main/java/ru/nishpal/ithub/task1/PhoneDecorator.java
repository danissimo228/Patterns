package ru.nishpal.ithub.task1;

public class PhoneDecorator {
    Adapter1 adapter1;

    public PhoneDecorator(Adapter1 adapter1) {
        this.adapter1 = adapter1;
    }

    public void some() {
        adapter1.call();
    }
}
