import java.util.*;

public class HashSetCode {
    public static void main(String[] args) {
        HashSet<Integer> hs = new HashSet<>();

        hs.add(1);
        hs.add(2);
        hs.add(3);
        hs.add(4);
        hs.add(2);
        hs.add(1);

        System.out.println(hs);

        hs.remove(3);
        if(hs.contains(2)){
            System.out.println("Set Contains 2");
        }
        if(hs.contains(3)){
            System.out.println("Set Contains 3");
        }

        System.out.println(hs.size());
        hs.clear();
        System.out.println(hs.isEmpty());

        //Iterator
        HashSet<String> cities = new HashSet<>();
        cities.add("Delhi");
        cities.add("Mumbai");
        cities.add("Indore");
        cities.add("Chennai");

        // Iterator it = cities.iterator();
        // while(it.hasNext()){
        //     System.out.println(it.next());
        // }

        for (String city : cities) {
            System.out.println(city);
        }
    }
}
