package lesson7.observer;


public class Vacancy {
    int idVacancy;
    String nameCompany;
    double salary;
    VacancyType vacancyType;
    private static int counter;

    {
        idVacancy = ++counter;
    }

    public Vacancy(String nameCompany, double salary, VacancyType vacancyType) {
        this.nameCompany = nameCompany;
        this.salary = salary;
        this.vacancyType = vacancyType;
    }

    public enum VacancyType {
        MANAGER,
        IT_SPECIALIST,
        WORKER,
        DESIGNER
    }

    public int getIdVacancy() {
        return idVacancy;
    }

    public String getNameCompany() {
        return nameCompany;
    }

    public double getSalary() {
        return salary;
    }

    public VacancyType getVacancyType() {
        return vacancyType;
    }
}