package lesson7.observer;

public class Program {

    /**
     * TODO: 1.Доработать приложение, поработать с шаблоном проектирования Observer
     * добавить новый тип соискателя.
     * **.2 Добавить новую сущность "Вакансия", компания должна рассылать вакансии.
     * **.3 Предусмотреть тип вакансии (enum)
     * 
     * @param args
     */
    public static void main(String[] args) {

        JobAgency jobAgency = new JobAgency();

        
        Company geekBrains = new Company("GeekBrains", 80000, jobAgency);
        Company google = new Company("Google", 150000, jobAgency);
        Company yandex = new Company("Yandex", 200000, jobAgency);

        Senior ivanov = new Senior("Иванов");
        Senior petrov = new Senior("Петров");
        Student sidorov = new Student("Сидоров");
        Middle kartinkov = new Middle("Картинков");
        Junior kartonkov = new Junior("Картонков");

        jobAgency.registerObserver(ivanov);
        jobAgency.registerObserver(petrov);
        jobAgency.registerObserver(sidorov);
        jobAgency.registerObserver(kartinkov);
        jobAgency.registerObserver(kartonkov);

        for (int i = 0; i < 3; i++) {
            geekBrains.needEmployee();
            google.needEmployee();
            yandex.needEmployee();
        }

    }

}