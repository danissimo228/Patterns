package ru.nishpal.ithub.adapter;

public class Adapter extends JavaApp implements Database{
    @Override
    public void insert() {
        System.out.println("Insert");
    }

    @Override
    public void delete() {
        System.out.println("Database delete");
    }

    @Override
    public void select() {
        System.out.println("Select");
    }
}
