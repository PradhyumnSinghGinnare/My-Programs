/* Que 3. Write a program to count total number of object created for that class without using for loop or any other iterative statement and restrict object creation if any threshold value reached. */

public class Q3CountObjectCreation {
    public static class ObjectCreation{
        public static int count = 0;
        public static int threshold = 5;

        public ObjectCreation(){
            count++;
            if(count > threshold){
                System.out.println("Threshold reached. Object creation restricted.");
                throw new IllegalStateException("Threshold reached. Object creation restricted.");
            }
            System.out.println("Total number of object created: " + count);
        }
    }

    public static void main(String[] args) {
        ObjectCreation ob1 = new ObjectCreation();
        ObjectCreation ob2 = new ObjectCreation();
        ObjectCreation ob3 = new ObjectCreation();
        ObjectCreation ob4 = new ObjectCreation();
        ObjectCreation ob5 = new ObjectCreation();
    }
}
