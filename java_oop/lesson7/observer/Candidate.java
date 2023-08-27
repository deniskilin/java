package lesson7.observer;

public abstract class Candidate {

    protected String name;
    protected double minSalary;
    public Qualification qualification;

    public Candidate(String name) {
        this.name = name;
    }

    public Candidate() {
    }

    public enum Qualification {
        MANAGER,
        IT_SPECIALIST,
        WORKER,
        DESIGNER
    }
}