package ru.nishpal.ithub.observer;

import java.util.ArrayList;
import java.util.List;

public class JavaDev implements Observed{
    private List<String> list = new ArrayList<>();
    private List<Observer> persons = new ArrayList<>();

    public void addToList(String list) {
        this.list.add(list);
        notifyObservers();
    }

    public void deleteToList(String list) {
        this.list.remove(list);
        notifyObservers();
    }
    @Override
    public void addObserver(Observer observer) {
        this.persons.add(observer);
    }

    @Override
    public void deleteObserver(Observer observer) {
        this.persons.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : persons) {
            observer.handlerEvent(this.list);
        }
    }
}
