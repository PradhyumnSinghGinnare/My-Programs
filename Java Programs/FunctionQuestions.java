import java.util.*;

public class FunctionQuestions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first numbers:");
        int a = sc.nextInt();
        System.out.println("Enter second numbers:");
        int b = sc.nextInt();
        System.out.println("Enter third numbers:");
        int c = sc.nextInt();
        //Function for average of three numbers
        int avg = Average(a, b, c);
        System.out.println("Average of three numbers is: " + avg);

        System.out.println("Enter a number:");
        int n = sc.nextInt();
        sc.close();

        //Function for Even number
        System.out.println(isEven(n));

        //Function for Palindrome number
        Palindrome(n);

        //Function for Sum of Digits of a number
        int sum = DigitSum(n);
        System.out.println("Sum of digits of a number is: " + sum);
    }
    public static int Average(int a, int b, int c){
        int avg = (a + b + c)/3;
        return avg;
    }

    public static boolean isEven(int n){
        if(n%2==0){
            return true;
        } else{
            return false;
        }
    }

    public static void Palindrome(int n){
        int temp = n;
        int sum = 0;
        while(n>0){
            int r = n % 10;
            sum = (sum*10) + r;
            n=n/10;
        }

        if(temp==sum){
            System.out.println("It is a Palindrome Number!");
        } else {
            System.out.println("It is not a Palindrome Number!");
        }
    }

    public static int DigitSum(int n){
        int sum = 0;
        while(n>0){
            int r = n%10;
            sum = sum + r;
            n=n/10;
        }
        return sum;
    }
}
