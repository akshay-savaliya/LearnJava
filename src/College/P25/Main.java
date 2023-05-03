package College.P25;

//Emp class
class Emp {
    protected int empNo;
    protected String name;
    protected double salary;

    public Emp(int empNo, String name, double salary) {
        this.empNo = empNo;
        this.name = name;
        this.salary = salary;
    }

    public void display() {
        System.out.println("Emp No: " + empNo);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}

//Teaching class
class Teaching extends Emp {
    private String nameOfSubject;

    public Teaching(int empNo, String name, double salary, String nameOfSubject) {
        super(empNo, name, salary);
        this.nameOfSubject = nameOfSubject;
    }

    public void display() {
        super.display();
        System.out.println("Name of Subject: " + nameOfSubject);
    }
}

//NonTeaching class
class NonTeaching extends Emp {
    private String typeOfWork;

    public NonTeaching(int empNo, String name, double salary, String typeOfWork) {
        super(empNo, name, salary);
        this.typeOfWork = typeOfWork;
    }

    public void display() {
        super.display();
        System.out.println("Type of Work: " + typeOfWork);
    }
}

//Main class
class Main {
    public static void main(String[] args) {
        Teaching t1 = new Teaching(101, "akshay", 80000, "Computer Science");
        Teaching t2 = new Teaching(102, "jay", 60000, "Mathematics");
        NonTeaching n1 = new NonTeaching(201, "meet", 25000, "Cleaning");
        NonTeaching n2 = new NonTeaching(202, "deep", 35000, "Data Entry");

        //Printing information of employees using empNo
        Emp[] employees = {t1, t2, n1, n2};
        int empNo = 101; //employee number to search for
        for (Emp e : employees) {
            if (e.empNo == empNo) {
                e.display();
                break;
            }
        }
    }
}

