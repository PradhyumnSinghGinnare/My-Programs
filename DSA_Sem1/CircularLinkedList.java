import java.util.Scanner;

public class CircularLinkedList {
   
    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void insertion(){
        int data;
        System.out.print("Enter the value of an item: ");
        Scanner scanner = new Scanner(System.in);
        data = scanner.nextInt();
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        newNode.next = head;
        tail = newNode;
    }

    public void print(){
        Node temp = head;
        if (head != null){
            // Keep printing nodes till we reach the first node again
            do{
                System.out.print(temp.data + " ");
                temp = temp.next;
            } while (temp != head);
            System.out.println();
            System.out.println("Number of elements in the list: " + size);
        }
    }

    public void deletion(){
        if(size == 0){
            System.out.println("LinkedList is empty");
            return;
        } else if(size == 1){
            head = tail = null;
            size = 0;
            return;
        }

        //prev = size-1
        Node prev = head;
        for(int i=1; i<size-1; i++){
            prev = prev.next;
        }
        prev.next = head;
        tail = prev;
        size--;
        System.out.println("Last element deleted from the list");
        return;
    }

    public static void main(String[] args){
        int choice;
        CircularLinkedList ll = new CircularLinkedList();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("1. Insert a Node");
            System.out.println("2. Display Linked List");
            System.out.println("3. Delete the Element");

            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Inserting Nodes");
                    ll.insertion();
                    break;
                case 2:
                    System.out.println("Display Elements of Linked List");
                    ll.print();
                    break;
                case 3:
                    System.out.println("Delete the element");
                    ll.deletion();
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
    }
}
