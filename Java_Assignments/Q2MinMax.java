/* Que 2. Write a java program to find minimum and maximum of given n number without using any explicit array. */

public class Q2MinMax {
    public static void main(String[] args) {
        int[] a = {67, 45, 23, 75, 56};
        int max, min;
        max = min = a[0];
        for(int i=0; i<a.length; i++){
            if(a[i] > max){
                max = a[i];
            } else if(a[i] < min){
                min = a[i];
            }
        }
        System.out.println("Minimum number: " + min);
        System.out.println("Maximum number: " + max);
    }
}
