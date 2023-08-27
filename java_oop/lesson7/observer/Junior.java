package lesson7.observer;

import java.util.Random;

public class Junior extends Candidate implements Observer {
    private static Random random = new Random();

    public Junior() {
    }

    public Junior(String name) {
        super(name);
        this.minSalary = random.nextDouble(50000, 70000);
        int rnd = random.nextInt(2);
        if (rnd == 0) {
            this.qualification = Qualification.DESIGNER;
        } else {
            this.qualification = Qualification.IT_SPECIALIST;
        }
    }

    @Override
    public void receiveOffer(Vacancy vacancy) {
        if (this.qualification.toString().equals((vacancy.getVacancyType()).toString()) &&
                minSalary <= vacancy.getSalary()) {
            System.out.printf(
                    "Вакансия %d: Джуниор %s (%.2f) >>> Мне нужна эта работа по специальности %s! (%s - %.2f)\n",
                    vacancy.idVacancy, name, minSalary, this.qualification.toString(), vacancy.getNameCompany(),
                    vacancy.getSalary());
            minSalary = vacancy.getSalary();
        } else {
            System.out.printf(
                    "Вакансия %d: Джуниор %s (хочет минимум %.2f) >>> Мне эта работа не подходит! (%s предлагает %.2f, нужен %s, наш джуниор - %s)\n",
                    vacancy.idVacancy, name, minSalary, vacancy.getNameCompany(), vacancy.getSalary(),
                    this.qualification,
                    vacancy.getVacancyType());
        }
    }
}