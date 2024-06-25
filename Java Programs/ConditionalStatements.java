// import java.util.*;

public class ConditionalStatements {
    public static void main(String args[]){
        int age = 20;
        if(age >= 18){
            System.out.println("Adult");
        }
        else{
            System.out.println("Not Adult");
        }

        //Larger value
        int A = 3;
        int B = 3;
        if(A>B){
            System.out.println("A is largest");
        }
        else{
            System.out.println("B is largest");
        }

        //Odd or Even
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        if(num%2==0){
            System.out.println("Even number");
        }
        else{
            System.out.println("Odd number");
        }

        // Switch Statement
        int num = 3;
        switch(num){
            case 1 : System.out.println("Samosa");
            break;
            case 2 : System.out.println("Burger");
            break;
            case 3 : System.out.println("Pizza");
            break;
            default : System.out.println("Invalid number");
        }
    }
}
