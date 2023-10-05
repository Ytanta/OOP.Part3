package geekbrains.lesson1.sample3;

/**
 * Работник (базовый класс)
 */
public abstract class Employee implements Comparable<Employee> {

    /**
     * Имя
     */
    protected String name;

    /**
     * Фамилия
     */
    protected String surName;

    protected int age;

    /**
     * Ставка заработной платы
     */
    protected double salary;

    public Employee(String surName, String name, double salary , int age) {
        this.name = name;
        this.surName = surName;
        this.salary = salary;
        this.age = age;
    }

    /**
     * Расчет среднемесячной заработной платы
     * @return
     */
    public abstract double calculateSalary();

    @Override
    public int compareTo(Employee o) {
        int surNameRes = surName.compareTo(o.surName);
        if (surNameRes == 0){
            return name.compareTo(o.name);
        }
        return surNameRes;
    }
}
