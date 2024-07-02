import java.util.*;

class Node {
    int info;
    Node link;

    public Node(int value) {
        info = value;
        link = null;
    }
}

class SinglyLinkedList {
    private Node start;

    public SinglyLinkedList() {
        start = null;
    }

    public Node createNode(int value) {
        return new Node(value);
    }

    public void insertion() {
        int value;
        System.out.print("Enter the value of an item: ");
        Scanner scanner = new Scanner(System.in);
        value = scanner.nextInt();
        Node ptr = createNode(value);

        if (start == null) {
            start = ptr;
        } else {
            Node l = start;
            while (l.link != null) {
                l = l.link;
            }
            l.link = ptr;
        }
    }

    public void insFirst() {
        int value;
        System.out.print("Enter the value to be inserted: ");
        Scanner scanner = new Scanner(System.in);
        value = scanner.nextInt();
        Node ptr = createNode(value);

        if (start == null) {
            start = ptr;
        } else {
            Node p = start;
            start = ptr;
            start.link = p;
        }
        System.out.println("Element Inserted at the beginning");
    }

    public void insLast() {
        int value;
        System.out.print("Enter the value to be inserted: ");
        Scanner scanner = new Scanner(System.in);
        value = scanner.nextInt();
        Node ptr = createNode(value);

        if (start == null) {
            start = ptr;
        } else {
            Node s = start;
            while (s.link != null) {
                s = s.link;
            }
            s.link = ptr;
        }
        System.out.println("Element Inserted at the last");
    }

    public void display() {
        Node ptr = start;
        if (ptr == null) {
            System.out.println("The List is Empty");
            return;
        }
        System.out.println("Elements of list are:");
        while (ptr != null) {
            System.out.print(ptr.info + "->");
            ptr = ptr.link;
        }
        System.out.println("NULL");
    }

    public void searchInsertAfter() {
        int val, pos = 0;
        boolean flag = false;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value to be searched: ");
        val = scanner.nextInt();
        Node ptr = start;
        while (ptr != null) {
            pos++;
            if (ptr.info == val) {
                flag = true;
                System.out.println("Element " + val + " is found at position " + pos);
                break;
            } else {
                ptr = ptr.link;
            }
        }

        if (!flag) {
            System.out.println("Element " + val + " not found in the list");
        } else {
            int value;
            System.out.print("Enter the value to be inserted: ");
            value = scanner.nextInt();
            Node newt = createNode(value);
            newt.info = value;
            newt.link = ptr.link;
            ptr.link = newt;
        }
    }

    public void searchInsertBefore() {
        int val, pos = 0;
        boolean flag = false;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value to be searched: ");
        val = scanner.nextInt();
        Node ptr = start;
        Node newt, prev = null;
        while (ptr != null) {
            pos++;
            if (ptr.info == val) {
                flag = true;
                System.out.println("Element " + val + " is found at position " + pos);
                break;
            } else {
                prev = ptr;
                ptr = ptr.link;
            }
        }

        if (!flag) {
            System.out.println("Element " + val + " not found in the list");
        } else if (ptr == start) {
            int value;
            System.out.print("Enter the value to be inserted: ");
            value = scanner.nextInt();
            newt = createNode(value);
            newt.info = value;
            newt.link = start;
            start = newt;
        } else {
            int value;
            System.out.print("Enter the value to be inserted: ");
            value = scanner.nextInt();
            newt = createNode(value);
            newt.info = value;
            newt.link = ptr;
            prev.link = newt;
        }
    }

    public void searchDelete() {
        int val, pos = 0;
        boolean flag = false;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value to be searched: ");
        val = scanner.nextInt();
        Node ptr = start;
        Node prev = null;
        while (ptr != null) {
            pos++;
            if (ptr.info == val) {
                flag = true;
                System.out.println("Element " + val + " is found at position " + pos);
                break;
            } else {
                prev = ptr;
                ptr = ptr.link;
            }
        }

        if (!flag) {
            System.out.println("Element " + val + " not found in the list");
        } else if (ptr == start) {
            start = ptr.link;
            System.out.println("Element " + val + " Deleted in the list");
        } else {
            prev.link = ptr.link;
            System.out.println("Element " + val + " Deleted in the list");
        }
    }

    public void searchDeleteAfter() {
        int val, pos = 0;
        boolean flag = false;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value to be searched: ");
        val = scanner.nextInt();
        Node ptr = start;
        Node prev = null;
        Node p = null;
        while (ptr != null) {
            pos++;
            if (ptr.info == val) {
                flag = true;
                System.out.println("Element " + val + " is found at position " + pos);
                break;
            } else {
                prev = ptr;
                ptr = ptr.link;
            }
        }

        if (!flag) {
            System.out.println("Element " + val + " not found in the list");
        } else if (ptr.link == null) {
            System.out.println("Deletion not possible");
        } else {
            p = ptr.link;
            ptr.link = p.link;
            System.out.println("Element " + p.info + " Deleted in the list");
        }
    }

    public void searchDeleteBefore() {
        int val, pos = 0;
        boolean flag = false;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value to be searched: ");
        val = scanner.nextInt();
        Node ptr = start;
        Node prev = null;
        Node pprev = null;
        while (ptr != null) {
            pos++;
            if (ptr.info == val) {
                flag = true;
                System.out.println("Element " + val + " is found at position " + pos);
                break;
            } else {
                pprev = prev;
                prev = ptr;
                ptr = ptr.link;
            }
        }

        if (!flag) {
            System.out.println("Element " + val + " not found in the list");
        } else if (ptr == start) {
            System.out.println("Deletion not possible");
        } else if (start.link == ptr) {
            start = ptr;
            System.out.println("Element " + prev.info + " Deleted in the list");
        } else {
            pprev.link = ptr;
            System.out.println("Element " + prev.info + " Deleted in the list");
        }
    }

    public void searchUpdate() {
        int val, pos = 0, value;
        boolean flag = false;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value to be searched: ");
        val = scanner.nextInt();
        Node ptr = start;
        while (ptr != null) {
            pos++;
            if (ptr.info == val) {
                flag = true;
                System.out.println("Element " + val + " is found at position " + pos);
                break;
            } else {
                ptr = ptr.link;
            }
        }

        if (!flag) {
            System.out.println("Element " + val + " not found in the list");
        } else {
            System.out.print("Enter the value for update: ");
            value = scanner.nextInt();
            ptr.info = value;
        }
    }

    public void sort() {
        Node ptr = start;
        int value;
        if (start == null) {
            System.out.println("The List is empty");
            return;
        }
        while (ptr != null) {
            Node s = ptr.link;
            while (s != null) {
                if (ptr.info > s.info) {
                    value = ptr.info;
                    ptr.info = s.info;
                    s.info = value;
                }
                s = s.link;
            }
            ptr = ptr.link;
        }
    }

    public void reverse() {
        Node ptr1 = start;
        Node ptr2 = ptr1.link;
        Node ptr3;
        if (start == null) {
            System.out.println("List is empty");
            return;
        }
        if (start.link == null) {
            return;
        }
        ptr1.link = null;
        ptr2.link = ptr1;
        ptr3 = ptr2.link;
        while (ptr3 != null) {
            ptr1 = ptr2;
            ptr2 = ptr3;
            ptr3 = ptr3.link;
            ptr2.link = ptr1;
        }
        start = ptr2;
    }
}

public class LinkedList1 {
    public static void main(String[] args) {
        int choice;
        SinglyLinkedList sl = new SinglyLinkedList();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Insert Node");
            System.out.println("2. Insert Node at Beginning");
            System.out.println("3. Insert Node at Last");
            System.out.println("4. Display Linked List");
            System.out.println("5. Search Element and Position then Insert After");
            System.out.println("6. Search Element and Position then Insert Before");
            System.out.println("7. Delete node");
            System.out.println("8. Search Element and Position then Delete After");
            System.out.println("9. Search Element and Position then Delete Before");
            System.out.println("10. Update value");
            System.out.println("11. Sorting values");
            System.out.println("12. Reverse nodes");
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Inserting Nodes");
                    sl.insertion();
                    break;
                case 2:
                    System.out.println("Inserting Node at First place");
                    sl.insFirst();
                    break;
                case 3:
                    System.out.println("Inserting Node at Last place");
                    sl.insLast();
                    break;
                case 4:
                    System.out.println("Display Elements of Linked List");
                    sl.display();
                    break;
                case 5:
                    System.out.println("Inserting Node after search node");
                    sl.searchInsertAfter();
                    break;
                case 6:
                    System.out.println("Inserting Node before search node");
                    sl.searchInsertBefore();
                    break;
                case 7:
                    System.out.println("Delete node");
                    sl.searchDelete();
                    break;
                case 8:
                    System.out.println("Delete node after search node");
                    sl.searchDeleteAfter();
                    break;
                case 9:
                    System.out.println("Delete node before search node");
                    sl.searchDeleteBefore();
                    break;
                case 10:
                    System.out.println("Update value");
                    sl.searchUpdate();
                    break;
                case 11:
                    System.out.println("Sorting values");
                    sl.sort();
                    break;
                case 12:
                    System.out.println("Reverse nodes");
                    sl.reverse();
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
    }
}
