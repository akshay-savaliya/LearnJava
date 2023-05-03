package College;

import java.util.Random;

public class Employee {
    private String name;
    private int age;
    private double salary;
    private int empno;
    private static int count = 0;

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.empno = ++count;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
        System.out.println("Employee Number: " + empno);
        System.out.println();
    }

    public static void main(String[] args) {
        Random random = new Random();
        Employee[] employees = new Employee[10];

        for (int i = 0; i < 10; i++) {
            String name = "Employee " + (i + 1);
            int age = random.nextInt(40) + 20;
            double salary = random.nextDouble() * 50000 + 50000;
            employees[i] = new Employee(name, age, salary);
        }

        for (Employee employee : employees) {
            employee.display();
        }
    }
}

