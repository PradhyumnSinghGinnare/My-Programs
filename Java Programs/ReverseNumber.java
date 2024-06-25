import java.util.*;

public class ReverseNumber {
    public static void main(String[] args){
        System.out.println("Enter a number:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        while(n > 0){
            int lastDigit = n % 10;
            System.out.print(lastDigit);
            n = n / 10;
        }

        //Store the reverse number in variable
        int reverse = 0;
        while(n > 0){
            int lastDigit = n % 10;
            reverse = (reverse * 10) + lastDigit;
            n = n / 10;
        }
        System.out.println(reverse);
    }
}
