package College;

public class Student {
    private String name;
    private int rollNo;
    private double totalMarks;

    public Student() {
        this("Unknown", 0, 0.0); // calls another constructor with default values
    }

    public Student(String name, int rollNo, double totalMarks) {
        this.name = name;
        this.rollNo = rollNo;
        this.totalMarks = totalMarks;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Total Marks: " + totalMarks);
    }

    public static void main(String[] args) {
        Student student1 = new Student(); // calls the zero-argument constructor
        System.out.println("Default Constructor Values:");
        student1.display();

        Student student2 = new Student("Akshay", 1013, 95.5); // calls the parameterized constructor
        System.out.println("Parameterized Constructor Values:");
        student2.display();
    }
}

