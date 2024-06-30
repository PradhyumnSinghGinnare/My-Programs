import java.util.*;

public class LinkedHashMapCode {
    public static void main(String[] args) {
        //Create
        LinkedHashMap<String, Integer> lhm = new LinkedHashMap<>();

        //Insert
        lhm.put("India", 100);
        lhm.put("China", 150);
        lhm.put("USA", 50);
        lhm.put("Russia", 70);
        lhm.put("Australia", 40);

        System.out.println(lhm);

        //Get
        int population = lhm.get("India");
        System.out.println(population);
        System.out.println(lhm.get("Russia"));

        //containsKey
        System.out.println(lhm.containsKey("India"));
        System.out.println(lhm.containsKey("Canada"));

        //remove
        lhm.remove("China");
        System.out.println(lhm);

        //size
        System.out.println(lhm.size());

        //isEmpty
        System.out.println(lhm.isEmpty());

        //clear
        lhm.clear();
        System.out.println(lhm.isEmpty());
}
}
