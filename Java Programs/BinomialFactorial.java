public class BinomialFactorial {
    public static void main(String args[]){
        System.out.println(BinCoeff(5, 2));            
    }

    public static int factorial(int n){
        int fact = 1;
        for(int i=1; i<=n; i++){
            fact = fact * i;
        }
        return fact;
    }

    public static int BinCoeff(int n, int r){
        int n_fact = factorial(n);
        int r_fact = factorial(r);
        int nr_fact = factorial(n-r);

        int BinCoeff = n_fact / (r_fact * nr_fact);
        return BinCoeff;
    }
}
