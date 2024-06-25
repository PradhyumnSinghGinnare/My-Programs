public class Constructors {
    public static void main(String[] args) {
        Student std = new Student();

        Student std1 = new Student("Pradhyumn");
        System.out.println(std1.name);

        Student std2 = new Student(42);
        System.out.println(std2.roll);

        System.out.println(Student.count);
    }
}
//Constructors
class Student{
    String name;
    int roll;

    static int count;

    Student(){
        count++;
        System.out.println("Constructor has called...");
    }

    Student(String name){
        this.name = name;
    }

    Student(int roll){
        this.roll = roll;
    }
}
