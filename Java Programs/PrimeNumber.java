// import java.util.*;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        if(n == 2){
            System.out.println(n + " is a prime number");
        } else{
            boolean isPrime = true;
            for(int i=2; i<=n-1; i++){
                if(n % i == 0){ //n is multiple of i(i is not equal to 1 or n)
                    isPrime = false;
                }
            }

            if(isPrime == true){
                System.out.println(n + " is a prime number");
            } else{
                System.out.println(n + " is not prime number");
            }
        }

        //Check with Math Method
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        if(n == 2){
            System.out.println(n + " is a prime number");
        } else{
            boolean isPrime = true;
            for(int i=2; i<=Math.sqrt(n); i++){
                if(n % i == 0){ //n is multiple of i(i is not equal to 1 or n)
                    isPrime = false;
                }
            }

            if(isPrime == true){
                System.out.println(n + " is a prime number");
            } else{
                System.out.println(n + " is not prime number");
            }
        }
        
        //Function Call
        System.out.println(isPrime(2));
        PrimeinRange(100);
    }

    //Check with function
    public static boolean isPrime(int n){
        // boolean isPrime = true;
        for(int i=2; i<=n-1; /*i<=Math.sqrt(n)*/ i++){
            if(n%i==0){
                // isPrime = false;
                // break;
                return false;
            }
        }
        // return isPrime;
        return true;
    }

    public static void PrimeinRange(int n){
        for(int i=2; i<=n; i++){
            if(isPrime(i)){
                System.out.print(i + " ");
            }
        }
    }
}
