package ru.nishpal.ithub.command;

public class Update implements Command {
    DataBase dataBase;

    public Update(DataBase dataBase) {
        this.dataBase = dataBase;
    }

    @Override
    public void execute() {
        System.out.println("Update Data");
    }
}
