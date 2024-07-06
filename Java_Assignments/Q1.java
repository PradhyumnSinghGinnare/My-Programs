/* Que 1. Write a program to accept n number from command line and display the sum of cube of each number. */

public class Q1{
    public static void main(String s[]) {
        int sumOfCubes = 0;
        int[] a = new int[s.length];
        for(int i=0; i<s.length; i++){
            a[i] = Integer.parseInt(s[i]);
        }

        for(int i=0; i<s.length; i++){
            // sumOfCubes += Math.pow(a[i], 3);
            sumOfCubes += a[i]*a[i]*a[i];
        }
        System.out.println(sumOfCubes);
    }
}