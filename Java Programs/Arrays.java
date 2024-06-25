import java.util.*;

public class Arrays {
    public static void main(String[] args) {
        int marks[] = new int[10];

        Scanner sc = new Scanner(System.in);
        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();
        sc.close();

        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);

        int percentage = (marks[0] + marks[1] + marks[2]) / 3;
        System.out.println("percentage : " + percentage + "%");

        int marks[] = {56, 86, 34};
        update(marks);
        //print marks
        for(int i=0; i<marks.length; i++){
            System.out.print(marks[i] + " ");
        }
        
        int num[] = {2, 4, 6, 8, 10, 12, 14, 16};
        int key = 5;
        int index = linearSearch(num, key);
        if(index == -1){
            System.out.println("Not found!!");
        } else{
            System.out.println("Key is at index: " + index);
        }

        int num[] = {1,2,6,3,5};
        int largest = getLargest(num);
        System.out.println("Largest number in array: " + largest);

    }

    public static int getLargest(int num[]){
        int largest = Integer.MIN_VALUE; // -infinity
        int smallest = Integer.MAX_VALUE;

        for(int i=0; i<num.length; i++){
            if(largest < num[i]){
                largest = num[i];
            }
            if(smallest > num[i]){
                smallest = num[i];
            }
        }
        System.out.println("Smallest value is: " + smallest);
        return largest;
    }

    public static int linearSearch(int num[], int key){
        for(int i=0; i<num.length; i++){
            if(num[i] == key){
                return i;
            }
        }
        return -1;
    }

    public static void update(int marks[]){
        for(int i=0; i<marks.length; i++){
            marks[i] = marks[i] + 1;
        }
    }
}
