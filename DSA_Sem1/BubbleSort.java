public class BubbleSort {
    public static void bubbleSort(int[] arr) {
        int n = arr.length;

        for (int i=n-1; i>=1; i--) {
            for (int j=0; j<i; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
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
        bubbleSort(arr);

        System.out.println("Sorted array:");
        printArray(arr);
    }
}
