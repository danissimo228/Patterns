package ru.nishpal.ithub.prototype;

import java.util.UUID;

public class Project implements Copyble {
    private UUID id;
    private String projectName;

    public Project(UUID id, String projectName) {
        this.id = id;
        this.projectName = projectName;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    @Override
    public Object copy() {
        return new Project(id, projectName);
    }

    @Override
    public String toString() {
        return "Project{" +
                "id=" + id +
                ", projectName='" + projectName + '\'' +
                '}';
    }
}
