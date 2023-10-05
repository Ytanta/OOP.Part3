package geekbrains.lesson1.sample3;

import java.util.Arrays;
import java.util.Random;

public class Task2 {

    static Random random = new Random();

    static Employee generateEmployee() {
        int type = random.nextInt(2);
        String[] names = new String[]{"Анатолий", "Глеб", "Клим", "Мартин", "Лазарь", "Владлен", "Клим", "Панкратий", "Рубен", "Герман"};
        String[] surnames = new String[]{"Григорьев", "Фокин", "Шестаков", "Хохлов", "Шубин", "Бирюков", "Копылов", "Горбунов", "Лыткин", "Соколов"};

        if (type == 0) {
            int age = random.nextInt(18, 66);
            int salary = random.nextInt(50000, 110000);
            Worker worker = new Worker(surnames[random.nextInt(surnames.length)], names[random.nextInt(names.length)], salary, age);
            return worker;

        } else {
            int age = random.nextInt(18, 66);
            int salary = random.nextInt(1000, 2000);
            int hours = random.nextInt(40, 60);
            Freelancer freelancer = new Freelancer(surnames[random.nextInt(surnames.length)], names[random.nextInt(names.length)], salary, age, hours);
            return freelancer;

        }
    }



        /**
         * TODO: Переработать метод generateEmployees. Метод должен возвращать массив сотрудников
         *  разных типов (Worker, Freelancer), метод должен быть ОДИН!
         * @param count
         * @return
         */
    static Employee[] generateEmployees(int count){
        Employee[] employees = new Employee[count];
        for (int i = 0; i < employees.length; i++)
            employees[i] = generateEmployee();
        return employees;
    }

    public static void main(String[] args) {



        Employee[] employees = generateEmployees(15);

        Arrays.sort(employees, new AgeComparator(SortType.Ascending));

        for (Employee employee: employees) {
            System.out.println(employee);
        }

        System.out.println();

        Arrays.sort(employees, new AgeComparator(SortType.Descending));

        for (Employee employee: employees) {
            System.out.println(employee);
        }

    }

}
