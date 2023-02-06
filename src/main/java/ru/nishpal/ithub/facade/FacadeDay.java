package ru.nishpal.ithub.facade;

import ru.nishpal.ithub.facade.Human;

public class FacadeDay {
    private Mood mood = new Mood();
    private Work work = new Work();
    private Human human = new Human();

    public void run() {
        human.day(mood, work);
    }
}
