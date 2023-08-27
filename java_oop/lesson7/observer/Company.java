package lesson7.observer;

import java.util.Random;

import lesson7.observer.Vacancy.VacancyType;

public class Company {

    private static Random random = new Random();
    private String nameCompany;
    private double maxSalary;

    private Publisher jobAgency;

    public Company(String nameCompany, double maxSalary, Publisher jobAgency) {
        this.nameCompany = nameCompany;
        this.maxSalary = maxSalary;
        this.jobAgency = jobAgency;
    }

    public void needEmployee() {
        double salary = random.nextDouble(2500, maxSalary);
        VacancyType[] vacancyTypes = VacancyType.values();
        VacancyType vacancyType = vacancyTypes[random.nextInt(vacancyTypes.length)];
        Vacancy vacancy = new Vacancy(this.nameCompany, salary, vacancyType);
        jobAgency.sendOffer(vacancy);
    }
}