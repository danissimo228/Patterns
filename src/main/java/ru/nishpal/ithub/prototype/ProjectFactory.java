package ru.nishpal.ithub.prototype;

public class ProjectFactory {
    private Project project;

    public void setProject(Project project) {
        this.project = project;
    }

    public ProjectFactory(Project project) {
        this.project = project;
    }

    public Project cloneProject() {
        return (Project) project.copy();
    }
}

//        Project master = new Project(UUID.randomUUID(), "Danya");
//        System.out.println(master);
//
//        ProjectFactory projectFactory = new ProjectFactory(master);
//        Project masterClone = projectFactory.cloneProject();
//        System.out.println(masterClone);
