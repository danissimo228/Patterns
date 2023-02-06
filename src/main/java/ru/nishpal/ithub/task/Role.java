package ru.nishpal.ithub.task;

public class Role {
    private static Role instanse = null;

    private Role() {}

    public static Role getInstanse() {
        if (instanse == null) {
            instanse = new Role();
        }
        return instanse;
    }
}
