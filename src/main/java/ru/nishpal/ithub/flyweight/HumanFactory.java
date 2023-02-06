package ru.nishpal.ithub.flyweight;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class HumanFactory {
    private Map<String, Human> map = new HashMap<>();
    public Human getHumanByGender(String gender) {
        if (Objects.equals(gender, "women")) {
            return new Women();
        } else {
            return new Man();
        }
    }
}
