import java.util.*;

public class HashMapCode{
    public static void main(String[] args) {
        //Create
        HashMap<String, Integer> hm = new HashMap<>();

        //Insert
        hm.put("India", 100);
        hm.put("China", 150);
        hm.put("USA", 50);
        hm.put("Russia", 70);
        hm.put("Australia", 40);

        System.out.println(hm);

        //Get
        int population = hm.get("India");
        System.out.println(population);
        System.out.println(hm.get("Russia"));

        //containsKey
        System.out.println(hm.containsKey("India"));
        System.out.println(hm.containsKey("Canada"));

        //remove
        hm.remove("China");
        System.out.println(hm);

        //size
        System.out.println(hm.size());

        //isEmpty
        System.out.println(hm.isEmpty());

        //clear
        //hm.clear();
        //System.out.println(hm.isEmpty());

        //Iteration
        Set<String> keys = hm.keySet();
        System.out.println(keys);
        
        //entrySet()
        System.out.println(hm.entrySet());

        for (String k : keys) {
            System.out.println("key=" + k + ", values=" + hm.get(k));
        }


    }
}