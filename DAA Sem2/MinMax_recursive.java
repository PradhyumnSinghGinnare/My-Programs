public class MinMax_recursive {
    public static void main(String[] args) {
        int arr[] = {12, 43, 13, 65, 48, 98, 23};
        int[] output = minMax(arr, 0, arr.length-1);
        System.out.println("Minimum : " + output[1] + "\nMaximum : " + output[0]);
    }

    public static int[] minMax(int[] arr, int i, int j){
        int max, min;
        if(i == j){
            max = min = arr[i];
        } else if(i+1 == j){
            if(arr[i] < arr[j]){
                max = arr[j];
                min = arr[i];
            } else{
                max = arr[i];
                min = arr[j];
            }
        } else{
            int mid = (i+j)/2;
            int[] leftMinMax = minMax(arr, i, mid);
            int[] rightMinMax = minMax(arr, mid+1, j);

            if(leftMinMax[0] > rightMinMax[0]){
                max = leftMinMax[0];
            } else{
                max = rightMinMax[0];
            }
            if(leftMinMax[1] < rightMinMax[1]){
                min = leftMinMax[1];
            } else{
                min = rightMinMax[1];
            }
        }
        return new int[]{max, min};
    }
}
