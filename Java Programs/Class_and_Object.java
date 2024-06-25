import java.util.Scanner;

public class Class_and_Object {
    public static void main(String[] args) {
        System.out.println("Hello World");

        Person p1 = new Person();  //First Object
        p1.age = 21;
        p1.name = "Pradhyumn";

        Person p2 = new Person();   //Second Object
        p2.age = 21;
        p2.name = "Puru"; 

        System.out.println(p1.age + " " + p1.name);
        System.out.println(p2.age + " " + p2.name);

        p1.walk();
        p2.eat();
        p1.walk(2);

        Laptop l1 = new Laptop();
        l1.setPrice(50000);
        System.out.println(l1.getPrice());
    }
}
 
class Person{  //Class
    String name;
    int age;

    void walk(){  //Function or Method
        System.out.println(name + " is walking.");
    }

    void eat(){
        System.out.println(name + " is eating.");
    }

    void walk(int steps){
        System.out.println(name + " walked " + steps + " steps");
    }
}

//Encapsulation
class Laptop{
    int ram;
    private int price;  

    //Getters and Setters
    public void setPrice(int price){
        this.price = price;
    }

    public int getPrice(){
        return price;
    }
}