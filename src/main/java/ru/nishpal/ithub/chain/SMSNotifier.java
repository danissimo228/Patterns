package ru.nishpal.ithub.chain;

public class SMSNotifier extends Notifier{
    public SMSNotifier(int priority) {
        super(priority);
    }

    @Override
    public void write(String message) {
        System.out.println("SMS: " + message);
    }
}
