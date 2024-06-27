import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.print("Enter a number: ");
        System.out.println(fibonacci(num));
    }

    public static int fibonacci(int num){
        if(num <= 1){
            return num;
        } else{
            return fibonacci(num-1) + fibonacci(num-2);
        }
    }
}
