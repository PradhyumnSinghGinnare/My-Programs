import java.util.Scanner;

public class BinarySearch{

    public static int binarySearch(int[] arr, int first, int last, int num){
        
        if(last < first){
            return -1;
        }
        int mid = (first + last)/2;
        if(num == arr[mid]){
            return mid;
        } else if(num < arr[mid]){
            return binarySearch(arr, first, mid-1, num);
        } else {
            return binarySearch(arr, mid+1, last, num);
        }
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 4, 6, 3, 8, 7, 9};
        System.out.print("Enter a number to search: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int position = binarySearch(arr, 0, arr.length, num);

        if(position == -1){
            System.out.println("Element not found!!!");
        } else{
            System.out.println("Element found at position: " + position);
        }
    }
}