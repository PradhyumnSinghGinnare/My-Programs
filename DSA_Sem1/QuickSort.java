import java.util.*; 

public class QuickSort { 

	static int partition(int arr[], int low, int high) { 
		int pivot = arr[high]; 
		int i = (low - 1); 
		for (int j = low; j <= high - 1; j++){ 
			if (arr[j] <= pivot){ 
				i++;
				int temp = arr[i]; 
				arr[i] = arr[j]; 
				arr[j] = temp; 
			} 
		} 
		int temp = arr[i + 1]; 
		arr[i + 1] = arr[high]; 
		arr[high] = temp; 

		return i + 1; 
	} 

	static void quickSort(int arr[], int l, int h){ 
		int[] stack = new int[h - l + 1]; 
		int top = -1; 

		stack[++top] = l; 
		stack[++top] = h; 

		while (top >= 0){
			h = stack[top--]; 
			l = stack[top--]; 

			int p = partition(arr, l, h); 

			if (p - 1 > l){ 
				stack[++top] = l; 
				stack[++top] = p - 1; 
			}
			if (p + 1 < h){ 
				stack[++top] = p + 1; 
				stack[++top] = h; 
			} 
		} 
	}

	public static void main(String args[]) 
	{ 
		int arr[] = { 4, 3, 5, 2, 1, 3, 2, 3 }; 
		int n = 8;

        System.out.printf("Given array is \n");
        for (int i = 0; i < n; i++) { 
			System.out.print(arr[i] + " "); 
		} 

		quickSort(arr, 0, n - 1); 

        System.out.printf("\nSorted array is \n");
		for (int i = 0; i < n; i++) { 
			System.out.print(arr[i] + " "); 
		} 
	} 
} 
