package ru.nishpal.ithub.composite;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private List<Human> people = new ArrayList<>();

    public void addHumanToTeam(Human human) {
        people.add(human);
    }

    public void removeHumanFromTeam(Human human) {
        people.remove(human);
    }
    public void printAllTeam() {
        System.out.println("Our team: ");
        for(Human human : people) {
            human.say();
        }
    }
}
