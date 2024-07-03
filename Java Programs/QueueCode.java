import java.util.Scanner;

public class QueueCode {

    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node front;
    public static Node rear;
    public static int size = 0;

    public void addElement(){
        int data;
        System.out.println("Enter the value to be inserted: ");
        Scanner sc = new Scanner(System.in);
        data = sc.nextInt();
        Node newNode = new Node(data);
        size++;
        if(front == null){
            front = rear = newNode;
            return;
        }
        rear.next = newNode;
        rear = newNode;
        System.out.println("Entered element is inserted.");
    }

    public void removeElement(){
        if(size == 0){
            System.out.println("Queue is empty!!");
            return;
        } else if(size == 1){
            front = rear = null;
            size = 0;
            return;
        }
        front = front.next;
        size--;
        System.out.println("Element is deleted.");
    }

    public void print(){
        if(size == 0){
            System.out.println("Queue is empty!!");
            return;
        }
        Node temp = front;
        System.out.println("Elements of the Queue: ");
        while(temp != null){
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("NULL");
        System.out.println("Number of elements in Queue: " + size);
    }

    public static void main(String[] args) {
        int choice;
        QueueCode q = new QueueCode();
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
                    q.addElement();
                    break;
                case 2:
                    System.out.println("Deleting an element");
                    q.removeElement();
                    break;
                case 3:
                    q.print();
                    break;
                default:
                    System.out.println("Invalid Choice!!!");
                    break;
            }
        }
    }
}
