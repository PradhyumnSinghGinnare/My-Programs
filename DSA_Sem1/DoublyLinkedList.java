import java.util.Scanner;

public class DoublyLinkedList {
    
    public static class Node{
        int data;
        Node right;
        Node left;

        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
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
        tail.right = newNode;
        newNode.left = tail;
        tail = newNode;
        newNode = tail;
    }

    public void addFirst(){
        int data;
        System.out.print("Enter the value to be inserted: ");
        Scanner scanner = new Scanner(System.in);
        data = scanner.nextInt();
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        newNode.right = head;
        head.left = newNode;
        newNode.left = null;
        head = newNode;
        System.out.println("Element Inserted at the beginning");
    }

    public void addLast(){
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
        tail.right = newNode;
        newNode.left = tail;
        tail = newNode;
        newNode = tail;
        System.out.println("Element Inserted at the last");
    }

    public void print(){
        if(head == null){
            System.out.println("LinkedList is empty");
            return;
        }
        Node temp = head;
        System.out.println("Elements of list are:");
        while(temp != null){
            System.out.print(temp.data + "<->");
            temp = temp.right;
        }
        System.out.println("NULL");
        System.out.println("Number of elements in the list: " + size);
    }

    public void printReverse(){
        if(head == null){
            System.out.println("LinkedList is empty");
            return;
        }
        Node temp = tail;
        System.out.println("Elements of list are:");
        while(temp != null){
            System.out.print(temp.data + "<->");
            temp = temp.left;
        }
        System.out.println("NULL");
        System.out.println("Number of elements in the list: " + size);
    }

    public void removeFirst(){
        if(size == 0){
            System.out.println("LinkedList is empty");
            return;
        } else if(size == 1){
            head = tail = null;
            size--;
            return;
        }

        head = head.right;
        head.left = null;
        size--;
        System.out.println("First element deleted from the list");
        return;
    }

    public void removeLast(){
        if(size == 0){
            System.out.println("LinkedList is empty");
            return;
        } else if(size == 1){
            head = tail = null;
            size = 0;
            return;
        }

        //temp = size-1
        Node temp = head;
        for(int i=1; i<size-1; i++){
            temp = temp.right;
        }
        temp.right = null;
        tail = temp;
        size--;
        System.out.println("Last element deleted from the list");
        return;
    }

    public void search(){
        int key;
        Node temp = head;
        System.out.println("Enter the element to search: ");
        Scanner scanner = new Scanner(System.in);
        key = scanner.nextInt();
        while(temp != null){
            if(temp.data == key){
                System.out.println(key + " found in the list");
                return;
            }
            temp = temp.right;
        }
        System.out.println(key + " does not exist in the list");
    }

    public void searchInsertBefore(){
        int key, data;
        Node temp = head;
        Node prev = null;
        System.out.println("Enter the element to search: ");
        Scanner scanner = new Scanner(System.in);
        key = scanner.nextInt();
        System.out.println("Enter the value to be inserted: ");
        data = scanner.nextInt();
        Node newNode = new Node(data);
        size++;
        while(temp != null){
            if(temp.data == key) {
                prev.right = newNode;
                newNode.right = temp;
                newNode.left = prev;
                temp.left = newNode;
                System.out.println(newNode.data + " is inserted in the list");
                return;
            }
            prev = temp;
            temp = temp.right;
        }
        System.out.println(key + "does not exist in the list");
    }

    public void searchInsertAfter(){
        int key, data;
        Node temp = head;
        System.out.println("Enter the element to search: ");
        Scanner scanner = new Scanner(System.in);
        key = scanner.nextInt();
        System.out.println("Enter the value to be inserted: ");
        data = scanner.nextInt();
        Node newNode = new Node(data);
        size++;
        while(temp != null){
            if(temp.data == key){
                newNode.right = temp.right;
                temp.right.left = newNode;
                temp.right = newNode;
                newNode.left = temp;

                System.out.println(newNode.data + " is inserted in the list");
                return;
            }
            temp = temp.right;
        }
        System.out.println(key + "does not exist in the list");
    }

    public void searchDelete(){
        int key;
        Node temp = head;
        Node prev = null;
        System.out.println("Enter the element to delete: ");
        Scanner scanner = new Scanner(System.in);
        key = scanner.nextInt();
        while (temp != null) {
            if(temp.data == key){
                prev.right = prev.right.right;
                prev.right.left = prev;
                size--;
                System.out.println(key + " is deleted form the list");
                return;
            }
            prev = temp;
            temp = temp.right;
        }
        System.out.println(key + " does not exist in the list");
    }

    public void searchDeleteBefore(){
        int key;
        Node temp = head;
        Node prev = null;
        Node preprev = null;
        System.out.println("Enter the element to search: ");
        Scanner scanner = new Scanner(System.in);
        key = scanner.nextInt();
        while(temp != null){
            if(key == head.data){
                System.out.println("Deletion not possible");
                return;
            } else if(temp.data == key){
                preprev.right = temp;
                temp.left = preprev;
                size--;
                System.out.println(prev.data + " is deleted form the list");
                return;
            }
            preprev = prev;
            prev = temp;
            temp = temp.right;
        }
        System.out.println(key + " does not exist in the list");
    }

    public void searchDeleteAfter(){
        int key;
        Node temp = head;
        Node prev = null;
        Node p = null;
        System.out.println("Enter the element to search: ");
        Scanner scanner = new Scanner(System.in);
        key = scanner.nextInt();
        while (temp != null) {
            if(temp.data == key){
                p = temp.right;
                temp.right = p.right;
                p.right.left = temp;
                size--;
                System.out.println(p.data + " is deleted form the list");
                return;
            } else if(temp.right == null){
                System.out.println("Deletion not possible");
                return;
            }
            prev = temp;
            temp = temp.right;
        }
        System.out.println(key + " does not exist in the list");
    }

    public static void main(String[] args) {
        int choice;
        DoublyLinkedList ll = new DoublyLinkedList();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("1. Insert Node");
            System.out.println("2. Insert Node at Beginning");
            System.out.println("3. Insert Node at Last");
            System.out.println("4. Display Linked List");
            System.out.println("5. Display backwards Linked List");
            System.out.println("6. Delete First Element");
            System.out.println("7. Delete Last Element");
            System.out.println("8. Search element in the list");
            System.out.println("9. Search element and delete from the list");
            System.out.println("10. Search element and insert before");
            System.out.println("11. Search element and insert after");
            System.out.println("12. Search element and delete before");
            System.out.println("13. Search element and delete after");

            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Inserting Nodes");
                    ll.insertion();
                    break;
                case 2:
                    System.out.println("Inserting Node at First place");
                    ll.addFirst();
                    break;
                case 3:
                    System.out.println("Inserting Node at Last place");
                    ll.addLast();
                    break;
                case 4:
                    System.out.println("Display Elements of Linked List");
                    ll.print();
                    break;
                case 5:
                    System.out.println("Display backwards Elements of Linked List");
                    ll.printReverse();
                    break;
                case 6:
                    System.out.println("Delete first element");
                    ll.removeFirst();
                    break;
                case 7:
                    System.out.println("Delete last element");
                    ll.removeLast();
                    break;
                case 8:
                    System.out.println("Search element in the list");
                    ll.search();
                    break;
                case 9:
                    System.out.println("Search element and delete from the list");
                    ll.searchDelete();
                    break;
                case 10:
                    System.out.println("Search element and insert before");
                    ll.searchInsertBefore();
                    break;
                case 11:
                    System.out.println("Search element and insert after");
                    ll.searchInsertAfter();
                    break;
                case 12:
                    System.out.println("Search element and delete before");
                    ll.searchDeleteBefore();
                    break;
                case 13:
                    System.out.println("Search element and delete after");
                    ll.searchDeleteAfter();
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
    }   
}