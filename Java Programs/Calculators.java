import java.util.*;

public class Calculators {
    public static void main(String args[]){
        //Income Tax Calculator
        System.out.println("Enter your Salary:");
        Scanner sc = new Scanner(System.in);
        int income = sc.nextInt();
        sc.close();
        int tax;
        if(income < 500000){
            System.out.println("No Tax");
        }
        else if(income >= 500000 && income <= 1000000){
            tax = (int) (income*0.2);
            System.out.println("20% Tax:" + tax);
        }
        else{
            tax = (int) (income*0.3);
            System.out.println("30% Tax:" + tax);
        }

        //Number Calculator
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a:");
        int a = sc.nextInt();
        System.out.println("Enter b:");
        int b = sc.nextInt();
        System.out.println("Enter Operator:");
        char operator = sc.next().charAt(0);
        sc.close();

        switch(operator) {
            case '+' : System.out.println(a+b);
            break;
            case '-' : System.out.println(a-b);
            break;
            case '*' : System.out.println(a*b);
            break;
            case '/' : System.out.println(a/b);
            break;
            case '%' : System.out.println(a%b);
            break;
            default : System.out.println("Invalid Operator!!!");
        }
    }
}
