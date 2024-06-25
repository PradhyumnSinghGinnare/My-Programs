import java.util.*;

public class Factorial {
    public static void main(String[] args) {
        System.out.println("Enter a number:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        // int fact = 1;
        
        int fact = factorial(num);
        System.out.println("Factorial of " + num + " is " + fact);
        System.out.println(factorial(5));
        // for(int i=1; i<=num; i++){
        //     fact = fact * i;
        // }
        // System.out.println("Factorial of " + num + " is " + fact);
    }

    public static int factorial(int num){
        int fact =1;
        for(int i =1; i<=num; i++){
            fact = fact * i;
        }
        return fact;
    }
}
