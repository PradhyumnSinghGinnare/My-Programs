public class Recursion {
    public static void main(String[] args) {
        int n = 10;
        int m = 1;
        printDec(n);
        System.out.println();
        printInc(m);
        System.out.println();
        System.out.println("Factorial: " + printfac(n));
        System.out.println("Sum: " + printSum(n));
        System.out.println("Fibonacci: " + printfib(n));
        System.out.println("Power: " + power(2, 10));
    }

    //print number n to 1
    public static void printDec(int n){
        if(n < 1){
            return;
        }
        System.out.print(n + " ");
        printDec(n-1);
    }

    //print number 1 to m
    public static void printInc(int m){
        if(m > 10){
            return;
        }
        System.out.print(m + " ");
        printInc(m+1);
    }

    //factorial of n
    public static int printfac(int n){
        if(n == 0){
            return 1;
        }
        int fac = printfac(n-1);
        int fn = n * fac;
        return fn;
    }

    //Sum of n numbers
    public static int printSum(int n){
        if(n == 1){
            return 1;
        }
        int sum = printSum(n-1);
        int sum1 = n + sum;
        return sum1;
    }

    //Fibonacci of nth number
    public static int printfib(int n){
        if(n == 0 || n == 1){
            return n;
        }
        int fib1 = printfib(n-1);
        int fib2 = printfac(n-2);
        int fn = fib1 + fib2;
        return fn;
    }

    //power x^n
    public static int power(int x, int n){
        if(n == 0){
            return 1;
        }

        return x * power(x, n-1);
    }
}