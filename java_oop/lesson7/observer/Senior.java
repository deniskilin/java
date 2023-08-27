package lesson7.observer;


import java.util.Random;

public class Senior extends Candidate implements Observer {

    private static Random random = new Random();

    private String name;

    private double minSalary;

    public Senior(String name) {
        this.name = name;
        minSalary = random.nextDouble(100000, 150000);
        int rnd = random.nextInt(3);
        if (rnd == 0) {
            this.qualification = Qualification.DESIGNER;
        } else if (rnd == 1) {
            this.qualification = Qualification.IT_SPECIALIST;
        } else {
            this.qualification = Qualification.MANAGER;
        }
    }

    @Override
    public void receiveOffer(Vacancy vacancy) {
        if (this.qualification.toString().equals((vacancy.getVacancyType()).toString()) &&
                minSalary <= vacancy.getSalary()) {
            System.out.printf("Вакансия %d: Синьор %s (%.2f) >>> Мне нужна эта работа по специальности %s! (%s - %.2f)\n",
                    vacancy.idVacancy, name, minSalary, this.qualification.toString(), vacancy.getNameCompany(),
                    vacancy.getSalary());
            minSalary = vacancy.getSalary();
        } else {
            System.out.printf(
                    "Вакансия %d: Синьор %s (хочет минимум %.2f) >>> Мне эта работа не подходит! (%s предлагает %.2f, нужен %s, наш синьор - %s)\n",
                    vacancy.idVacancy, name, minSalary, vacancy.getNameCompany(), vacancy.getSalary(),
                    this.qualification,
                    vacancy.getVacancyType());
        }
    }

}