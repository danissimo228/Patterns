package ru.nishpal.ithub.observer;

import java.util.List;

public class Person implements Observer {
    private String name;

    @Override
    public void handlerEvent(List<String> array) {
        System.out.println("maybe " + name + " add in the list");
    }

}
