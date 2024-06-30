import java.util.*;

public class TreeSetCode {
    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet<>();

        ts.add("Delhi");
        ts.add("Mumbai");
        ts.add("Indore");
        ts.add("Chennai");


        System.out.println(ts);

        ts.remove("Chennai");
        if(ts.contains("Indore")){
            System.out.println("Set Contains Indore");
        }
        if(ts.contains("Chennai")){
            System.out.println("Set Contains Chennai");
        }

        System.out.println(ts.size());
        ts.clear();
        System.out.println(ts.isEmpty());
    }
}