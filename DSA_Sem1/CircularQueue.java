import java.util.Scanner;

public class CircularQueue {

    public static class Queue{
        static int arr[];
        static int size;
        static int front;
        static int rear;

        public Queue(int n){
            arr = new int[n];
            size = n;
            front = -1;
            rear = -1;
        }

        public void add(){
            int data;
            System.out.println("Enter the value to be inserted: ");
            Scanner sc = new Scanner(System.in);
            data = sc.nextInt();

            if(front == rear + 1){
                System.out.println("Queue is full.");
                return;
            } else if(front == -1 && rear == -1){
                front = rear = 0;
                arr[rear] = data;
            } else if(rear == size-1){
                rear = 0;
                arr[rear] = data;
            } else {
                rear = rear + 1;
                arr[rear] = data;
            }
            System.out.println(data + " is inserted in Queue");
        }

        public void remove(){
            if(front == -1 && rear == -1){
                System.out.println("Queue is Empty!!!");
                return;
            } else if(front == rear){
                front = rear = -1;
            } else if(front == size-1){
                front = 0;
            } else {
                System.out.println(arr[front] + " is deleted!!!");
                front = front + 1;
            }
        }

        public void print(){
            if(front == -1 && rear == -1){
                System.err.println("Queue is Empty!!!");
                return;
            } else {
                System.out.println("Front -> " + front);
                System.out.println("Rear -> " + rear);
                System.out.print("Elements of the Queue: ");
                for(int i = front; i <= rear; i = (i+1)%size) {
                    System.out.print(arr[i] + " ");
                }
                System.out.println();
            }
        }
    }
    public static void main(String[] args) {
        int choice;
        Queue q = new Queue(5);
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
                    q.add();
                    break;
                case 2:
                    System.out.println("Deleting an element");
                    q.remove();
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
