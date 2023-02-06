package ru.nishpal.ithub.facade;

public class Human {

    public void day(Mood mood, Work work) {
        if (work.getGoTOWork()) {
            mood.isBad();
        } else if(work.getLeaveTheJob()) {
            mood.isGood();
        } else {
            mood.isGood();
        }
    }
}
