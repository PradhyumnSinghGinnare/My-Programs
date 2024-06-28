import java.util.*;

public class BinarySearch {
    public static void main(String[] args) {
        int num[] = {2, 4, 6, 8, 10, 12, 14};
        System.out.print("Enter a number to search: ");
        Scanner sc = new Scanner(System.in);
        int key = sc.nextInt();
        int index = binarySearch(num, key);
        if(index == -1){
            System.out.println("Not Found!!");
        } else{
            System.out.println(key + " found in array!!!");
            System.out.println("Index for key is: " + index);
        }
    }

    public static int binarySearch(int num[], int key){
        int start = 0;
        int end = num.length-1;

        while(start <= end) {
            int mid = (start + end)/2;
            //Comparisons
            if(num[mid] == key){
                return mid;
            }
            if(num[mid] < key){ //right - 2nd half
                start = mid+1;
            } else{  //left - 1st half
                end = mid-1;
            }
        }
        return -1;
    }
}
