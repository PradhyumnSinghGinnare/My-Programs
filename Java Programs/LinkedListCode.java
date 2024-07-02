public class LinkedListCode {
    
    public static class Node{
        int data;
        Node next;

        public Node(int data){   //Constructor
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    //Add First element in LinkedList
    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    //Add Last element in LinkedList
    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    //Print a LinkedList
    public void Print(){
        if(head == null){
            System.out.println("LinkedList is empty");
            return;
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    //Add in the Middle
    public void add(int idx, int data){
        if(idx == 0){
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;
        while(i < idx-1){
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    //Remove element from front of the LinkedList
    public int removeFirst(){
        if(size == 0){
            System.out.println("LinkedList is empty");
            return Integer.MIN_VALUE;
        } else if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    //Remove element from Last of the LinkedList
    public int removeLast(){
        if(size == 0){
            System.out.println("LinkedList is empty");
            return Integer.MIN_VALUE;
        } else if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        //prev = size-1
        Node prev = head;
        for(int i=1; i<size-1; i++){
            prev = prev.next;
        }
        int val = prev.next.data;  //tail.data
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }
    
    public static void main(String[] args) {
        LinkedListCode ll = new LinkedListCode();
        ll.addFirst(20);
        ll.addFirst(10);
        ll.addLast(40);
        ll.addLast(50);
        ll.Print();
        System.out.println("Size of the LinkedList: " + ll.size);
        ll.add(2, 30);
        ll.Print();
        System.out.println("Size of the LinkedList: " + ll.size);
        ll.removeFirst();
        ll.Print();
        System.out.println("Size of the LinkedList: " + ll.size);
        ll.removeLast();
        ll.Print();
        System.out.println("Size of the LinkedList: " + ll.size);
    }
}