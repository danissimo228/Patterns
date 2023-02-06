package ru.nishpal.ithub.facade;

public class Work {
    private boolean goToWork;
    private boolean leaveTheJob;

    public void isGoToWork() {
        goToWork = true;
        leaveTheJob = false;
    }

    public void isLeaveTheJob() {
        goToWork = false;
        leaveTheJob = true;
    }

    public boolean getGoTOWork() {
        return goToWork;
    }

    public boolean getLeaveTheJob() {
        return leaveTheJob;
    }
}
