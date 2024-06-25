import java.util.*;

public class Questions {
    public static void main(String args[]){
        // Sum of 2 numbers
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int product = a * b;
        System.out.println(product);

        // Area of a Circle 
        Scanner sc = new Scanner(System.in);
        float radius = sc.nextFloat();
        sc.close();
        float area = 3.14f * radius * radius;
        System.out.println(area);

        // Positive or Negative number
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        sc.close();
        if(num > 0){
            System.out.println("You have entered positive number!!!");
        }
        else{
            System.out.println("You have entered negative number!!!");
        }

        //Fever
        double temp = 103.5;
        if(temp >= 100){
            System.out.println("you have a fever");
        }
        else{
            System.out.println("You don't have a fever");
        }
        
        Leap year
        int year = 2020;
        if(year%4==0){
            System.out.println(year + " is a leap year!!!");
        }
        else{
            System.out.println(year + " is not a leap year");
        }

        //Print number till it's a multiple of 10
        System.out.println("Enter a number:");
        Scanner sc = new Scanner(System.in);
        do{
            int n = sc.nextInt();
            if(n % 10 == 0){
                break;
            }
            System.out.println(n);
        } while(true);

        //Print numbers except multiple of 10
        System.out.println("Enter a number:");
        Scanner sc = new Scanner(System.in);
        do{
            int n = sc.nextInt();
            if(n % 10 == 0){
                continue;
            }
            System.out.println(n);
        } while(true);

        //Print the sum of even and odd numbers
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int even = 0;
        int odd = 0;
        while(true){
            int n = sc.nextInt();
            if(n%2==0){
                even = even + n;
            } else {
                odd = odd +n;
            }
            System.out.println("Sum of all Even number is:" + even);
            System.out.println("Sum of all Odd number is:" + odd);
            sc.close();
        }
        
    }
}
