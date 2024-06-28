public class InsertionSort {
    public static void insertionSort(int[] arr) {
        int n = arr.length;

        for (int i=1; i<n; i++) {
            int x = arr[i];
            int j = i-1;
            while (j>=0 && arr[j] > x) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = x;
        }
    }

    public static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {34, 85, 13, 92, 21};
        
        System.out.println("Original array:");
        printArray(arr);

        // Perform bubble sort
        insertionSort(arr);

        System.out.println("Sorted array:");
        printArray(arr);
    }
}
