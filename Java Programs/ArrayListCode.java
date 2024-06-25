import java.util.*;

public class ArrayListCode {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);       
        list.add(20);       
        list.add(30);       
        list.add(40);       
        list.add(50);
        System.out.println("ArrayList: " + list);

        //Reverse of ArrayList
        for(int i=list.size()-1; i>=0; i--){
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        maximum(list);  //function call for maximum
        Swap(list, 1, 3);  //function call for swap
        System.out.println(list);

        //Sorting
        Collections.sort(list);
        System.out.println(list);
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);

        MultiDimensional();
    }

    //Maximum in ArrayList
    public static void maximum(ArrayList<Integer> list){
        int max = Integer.MIN_VALUE;
        for(int i=0; i<list.size(); i++){
            if(max < list.get(i)){  //max = Math.max(max, list.get(i));
                max = list.get(i);
            }
        }
        System.out.println(max);
    }

    //Swap
    public static void Swap(ArrayList<Integer> list, int idx1, int idx2){
        int temp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);
    }

    //Multi-Dimensional ArrayList
    public static void MultiDimensional(){
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();

        for(int i=1; i<=5; i++){
            list1.add(i*1);
            list2.add(i*2);
            list3.add(i*3);
        }
        mainList.add(list1);
        mainList.add(list2);
        mainList.add(list3);
        System.out.println(mainList);
    }
}
