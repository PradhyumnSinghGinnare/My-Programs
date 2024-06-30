import java.util.*;

public class TreeMapCode{
    public static void main(String[] args) {
        //Create
        TreeMap<String, Integer> tm = new TreeMap<>();

        //Insert
        tm.put("India", 100);
        tm.put("China", 150);
        tm.put("USA", 50);
        tm.put("Russia", 70);
        tm.put("Australia", 40);

        System.out.println(tm);

        //Get
        int population = tm.get("India");
        System.out.println(population);
        System.out.println(tm.get("Russia"));

        //containsKey
        System.out.println(tm.containsKey("India"));
        System.out.println(tm.containsKey("Canada"));

        //remove
        tm.remove("China");
        System.out.println(tm);

        //size
        System.out.println(tm.size());

        //isEmpty
        System.out.println(tm.isEmpty());

        //clear
        tm.clear();
        System.out.println(tm.isEmpty());
    }
}