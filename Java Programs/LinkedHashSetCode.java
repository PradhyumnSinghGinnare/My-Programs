import java.util.*;

public class LinkedHashSetCode{
    public static void main(String[] args) {
        LinkedHashSet<String> lhs = new LinkedHashSet<>();

        lhs.add("Delhi");
        lhs.add("Mumbai");
        lhs.add("Indore");
        lhs.add("Chennai");


        System.out.println(lhs);

        lhs.remove("Chennai");
        if(lhs.contains("Indore")){
            System.out.println("Set Contains Indore");
        }
        if(lhs.contains("Chennai")){
            System.out.println("Set Contains Chennai");
        }

        System.out.println(lhs.size());
        lhs.clear();
        System.out.println(lhs.isEmpty());
    }
}