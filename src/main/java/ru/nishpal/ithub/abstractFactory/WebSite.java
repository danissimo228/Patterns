package ru.nishpal.ithub.abstractFactory;

public class WebSite implements Project{
    @Override
    public Language getLanguage() {
        return new JavaScript();
    }

    @Override
    public Project getProject() {
        return new WebSite();
    }

    @Override
    public void getInfoProject() {
        System.out.println("WebSite!");
    }
}
