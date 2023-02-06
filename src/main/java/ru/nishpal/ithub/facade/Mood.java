package ru.nishpal.ithub.facade;

public class Mood {
    private boolean mood;

    public void isGood() {
        mood = true;
    }

    public void isBad() {
        mood = false;
    }

    public void printMood() {
        System.out.println(mood);
    }
}
