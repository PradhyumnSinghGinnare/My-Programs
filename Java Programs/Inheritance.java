public class Inheritance {
    public static void main(String[] args) {
        Developer d1 = new Developer(21, "Kratika");
        
        d1.eat();
        d1.walk();
        d1.Code();
        d1.Design();
    }
}

class Person{  //Class
    String name;
    int age;

    void walk(){  //Function or Method
        System.out.println(name + " is walking.");
    }

    void walk(int steps){   //Polymorphism
        System.out.println(name + " walked " + steps + " steps.");
    }

    void eat(){
        System.out.println(name + " is eating.");
    }

    void doWork(){
        System.out.println("Person is working.");
    }
}

class Developer extends Person{
    Developer(int age, String name){
        this.name = name;
        this.age = age;
    }

    void Code(){
        System.out.println("Developer is writing a Code.");
    }

    void Design(){
        System.out.println(name + " is Designing");
    }
}
