package ru.nishpal.ithub.abstractFactory;

public class GameDev implements Project {
    @Override
    public Language getLanguage() {
        return new Cpp();
    }

    @Override
    public GameDev getProject() {
        return new GameDev();
    }

    @Override
    public void getInfoProject() {
        System.out.println("GameDev");
    }
}
