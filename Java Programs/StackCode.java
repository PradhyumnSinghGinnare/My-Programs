import java.util.Scanner;

public class StackCode {
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node top;
    public static int size;

    public void addElement(){
        int data;
        System.out.println("Enter the value to be inserted: ");
        Scanner sc = new Scanner(System.in);
        data = sc.nextInt();
        Node newNode = new Node(data);
        size++;
        if(top == null){
            top = newNode;
            return;
        }
        newNode.next = top;
        top = newNode;
        System.out.println("Entered element is inserted.");
    }

    public void removeElement(){
        if(size == 0){
            System.out.println("Stack is empty!!!");
            return;
        } else if(size == 1){
            top = null;
            size = 0;
            return;
        }
        top = top.next;
        size--;
        System.out.println("Element is deleted.");
    }

    public void print(){
        if(size == 0){
            System.out.println("Stack is empty!!");
            return;
        }
        Node temp = top;
        System.out.println("Elements of the Stack: ");
        while(temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
        System.out.println("Number of elements in Stack: " + size);
    }

    public static void main(String[] args) {
        int choice;
        StackCode s = new StackCode();
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("1. Insert an element");
            System.out.println("2. Delete an element");
            System.out.println("3. Display the elements");

            System.out.println("Enter your choice:");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Inserting an element");
                    s.addElement();
                    break;
                case 2:
                    System.out.println("Deleting an element");
                    s.removeElement();
                    break;
                case 3:
                    s.print();
                    break;
                default:
                    System.out.println("Invalid Choice!!!");
                    break;
            }
        }
    }
}
