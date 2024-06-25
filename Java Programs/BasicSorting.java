import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class BasicSorting {
    public static void main(String[] args) {
        int arr[] = {5, 4, 1, 3, 2};
        Integer ar[] = {7, 4, 3, 2, 5};

        //Inbuild Sort (Accending Order)
        Arrays.sort(arr);
        Arrays.sort(arr, 0, 3);

        //Inbuild Sort (Decencing Order)
        Arrays.sort(ar, Collections.reverseOrder());
        for(int i=0; i<ar.length; i++){
            System.out.print(ar[i] + " ");
        }
        System.out.println();

        bubbleSort(arr);
        selectionSort(arr);
        insertionSort(arr);
        printArr(arr);
    }

    public static void printArr(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void bubbleSort(int[] arr){
        for(int i=0; i<arr.length-1; i++){
            for(int j=0; j<arr.length-1-i; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    
    public static void selectionSort(int[] arr){
        for(int i=0; i<arr.length-1; i++){
            int minPos = i;
            for(int j=i+1; j<arr.length; j++){
                if(arr[minPos] > arr[j]){
                    minPos = j;
                }
            }
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
    }

    public static void insertionSort(int arr[]){
        for(int i=0; i<arr.length; i++){
            int curr = i;
            int prev = i-1;
            while(prev >= 0 && arr[prev] > arr[curr]){
                arr[prev+1] = arr[prev];
                prev--;
            }
            arr[prev+1] = arr[curr];
        }
    }
}