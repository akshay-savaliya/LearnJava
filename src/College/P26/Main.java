package College.P26;

// Vehicle class
class Vehicle {
    protected int noOfWheels;

    public Vehicle(int noOfWheels) {
        this.noOfWheels = noOfWheels;
    }

    public void display() {
        System.out.println("Number of Wheels: " + noOfWheels);
    }
}

// TwoWheeler class (subclass of Vehicle)
class TwoWheeler extends Vehicle {
    public TwoWheeler(int noOfWheels) {
        super(noOfWheels);
    }
}

// Motorbike class (subclass of TwoWheeler)
class Motorbike extends TwoWheeler {
    private String bikeType;

    public Motorbike(int noOfWheels, String bikeType) {
        super(noOfWheels);
        this.bikeType = bikeType;
    }

    public void display() {
        super.display();
        System.out.println("Bike Type: " + bikeType);
    }
}

// Scooter class (subclass of TwoWheeler)
class Scooter extends TwoWheeler {
    private String scooterType;

    public Scooter(int noOfWheels, String scooterType) {
        super(noOfWheels);
        this.scooterType = scooterType;
    }

    public void display() {
        super.display();
        System.out.println("Scooter Type: " + scooterType);
    }
}

// FourWheeler class (subclass of Vehicle)
class FourWheeler extends Vehicle {
    public FourWheeler(int noOfWheels) {
        super(noOfWheels);
    }
}

// Car class (subclass of FourWheeler)
class Car extends FourWheeler {
    private String carType;

    public Car(int noOfWheels, String carType) {
        super(noOfWheels);
        this.carType = carType;
    }

    public void display() {
        super.display();
        System.out.println("Car Type: " + carType);
    }
}

// Truck class (subclass of FourWheeler)
class Truck extends FourWheeler {
    private String truckType;

    public Truck(int noOfWheels, String truckType) {
        super(noOfWheels);
        this.truckType = truckType;
    }

    public void display() {
        super.display();
        System.out.println("Truck Type: " + truckType);
    }
}

// Main class
public class Main {
    public static void main(String[] args) {
        // Create instances of each class
        Motorbike mb = new Motorbike(2, "Sports Bike");
        Scooter s = new Scooter(2, "Electric Scooter");
        Car c = new Car(4, "Sedan");
        Truck t = new Truck(6, "Pickup Truck");

        // Call the display method for each instance
        mb.display();
        s.display();
        c.display();
        t.display();
    }
}

