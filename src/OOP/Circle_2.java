package OOP;

public class Circle_2 {

    private double radius;
    private static int numberOfCircles_2;

    Circle_2() {
        numberOfCircles_2++;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = (radius >= 0) ? radius : 0;
    }

    public static int getNumberOfCircles_2() {
        return numberOfCircles_2;
    }
}
