public class Abstraction {
    public static void main(String[] args) {
        Horse h = new Horse();
        h.eats();
        h.walk();
        Chicken ch = new Chicken();
        ch.eats();
        ch.walk();

        //Object for Transformer to use interface
        Transformer tf = new Transformer();
        tf.start();
        tf.walk();
    }
}

abstract class Animal{
    void eats(){
        System.out.println("Eats");
    }

    abstract void walk();
}

class Horse extends Animal{
    void walk(){
        System.out.println("Walk on 4 legs");
    }
}

class Chicken extends Animal{
    void walk(){
        System.out.println("Walk on 2 legs");
    }
}

//Interface
interface Car {
    void start();
}

interface Person{
    void walk();
}

class Transformer implements Car, Person{
    public void start(){
        System.out.println("Car is Starting");
    }
    public void walk(){
        System.out.println("Person is Walking");
    }
}