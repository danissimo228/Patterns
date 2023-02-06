package ru.nishpal.ithub.command;

public class Select implements Command {
    DataBase dataBase;

    public Select(DataBase dataBase) {
        this.dataBase = dataBase;
    }

    @Override
    public void execute() {
        System.out.println("Select Data");
    }
}
