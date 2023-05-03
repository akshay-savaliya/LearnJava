package OOP;

class Students {
    String name;
    static String school;    // school name for all students are same.
}
public class StaticKeyWord {

    public static void main(String[] args) {

        Students.school = "KPGU";

        Students s1 = new Students();
        s1.name = "Akshay";
        System.out.println("Name : " + s1.name);
        System.out.println("School Name : " + s1.school);

    }
}
