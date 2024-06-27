public class MinMax_iterative {
    public static void main(String[] args) {
        int arr[] = {12, 43, 13, 65, 48, 98, 23};
        minMax(arr);
    }

    public static void minMax(int[] arr){
        int max, min;
        max = min = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            } else if(arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("Minimum : " + min);
        System.out.println("Maximum : " + max);
    }
}
