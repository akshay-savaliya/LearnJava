package College;

public class Person {
    private String name;
    private int age;
    private double salary;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public static void main(String[] args) {
        Person person = new Person();
        person.setName("akshay");
        person.setAge(20);
        person.setSalary(50000.0);

        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
        System.out.println("Salary: " + person.getSalary());
    }
}

