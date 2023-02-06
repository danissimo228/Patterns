package ru.nishpal.ithub.command;

public class Dev {
    Command insert;
    Command select;
    Command update;

    public Dev(Command insert, Command select, Command update) {
        this.insert = insert;
        this.select = select;
        this.update = update;
    }

    public void insertData() {
        insert.execute();
    }

    public void selectData() {
        select.execute();
    }

    public void updateData() {
        update.execute();
    }
}
