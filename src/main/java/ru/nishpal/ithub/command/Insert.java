package ru.nishpal.ithub.command;

public class Insert implements Command {
    DataBase dataBase;

    public Insert(DataBase dataBase) {
        this.dataBase = dataBase;
    }

    @Override
    public void execute() {
        System.out.println("Insert Data");
    }
}
