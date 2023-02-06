package ru.nishpal.ithub.chain;

public class SimpleReportNotifier extends Notifier{
    public SimpleReportNotifier(int priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println("report: " + message);
    }


}
