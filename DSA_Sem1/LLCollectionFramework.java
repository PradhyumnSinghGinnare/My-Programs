import java.util.LinkedList;

public class LLCollectionFramework {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        //Add
        ll.addLast(20);
        ll.addLast(30);
        ll.addFirst(10);
        System.out.println(ll);
        //remove
        ll.removeLast();
        ll.removeFirst();
        System.out.println(ll);
    }
}
