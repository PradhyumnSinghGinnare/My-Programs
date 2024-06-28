public class ShellSort {
    public static void shellSort(int[] arr) {
        int n = arr.length;
        int span = n/2;
        while (span >= 1) {
            for(int k=0; k<span; k++){
                for (int i=k+span; i<n; i=i+span) {
                    int x = arr[i];
                    int j = i-span;
                    while (j>=0 && arr[j] > x) {
                        arr[j+span] = arr[j];
                        j = j-span;
                    }
                    arr[j+span] = x;
                }
            }
            span = span/2;
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
        shellSort(arr);

        System.out.println("Sorted array:");
        printArray(arr);
    }
}
