package OOP;

interface Animals {
    int eyes = 2;    // static ---> all the Animals ---> eyes values same.
    void walks();

//    Animals(){}    // ERROR ---> Not allowed constructor in interface
//    void eats(){}    // ERROR ---> Not allowed not abstract function
}

interface Herbivore {

}

//    Multiple Inheritance
class Horses implements Animals, Herbivore {
    public void walks() {
        System.out.println("Horse walks on 4 legs.");
    }
}
public class Interfaces {
}
