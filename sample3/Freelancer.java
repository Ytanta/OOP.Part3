package geekbrains.lesson1.sample3;

/**
 * TODO: Разработать тип Freelancer самостоятельно в рамках выполнения
 *  домашней работы
 * Фрилансер (работник с почасовой оплатой)
 */
public class Freelancer  extends Employee{
    protected int hour;

    public Freelancer(String surName, String name, double salary, int age, int hour) {
        super(surName, name, salary,  age);
        this.hour = hour;
    }

    @Override
    public double calculateSalary() {
        return salary * hour;
    }
    @Override
    public String toString() {
        return String.format("%s %s; Возраст: %d; Фрилансер; Среднемесячная заработная плата : %.2f (руб.); Отработано часов: %d; Ставка : %.2f",
                surName, name, age,  calculateSalary(), hour,salary);
    }
}

