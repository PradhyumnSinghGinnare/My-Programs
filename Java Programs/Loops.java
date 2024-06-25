// import java.util.*;

public class Loops {
    public static void main(String[] args) {
        //While Loop
        int count = 1;
        while(count <= 10){
            System.out.println("Hello World!");
            count++;
        }

        //Print 1 to 10
        int num = 1;
        while(num <= 10){
            System.out.print(num + " ");
            num++;
        }

        //Print 1 to n
        System.out.println("Enter a number:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int count = 1;
        while(count <= n){
            System.out.print(count + " ");
            count++;
        }

        //For Loops
        for(int i=1; i<=10; i++){
            System.out.println("Hello World!");
        }

        //Do while Loop
        int count = 1;
        do{
            System.out.println("Hello World!");
            count++;
        } while(count <= 10);

        // Break Statement
        for(int i=1; i<=5; i++){
            if(i==3){
                break;
            }
            System.out.println(i);
        }
        System.out.println("I am out of loop");

        //Continue Statement
        for(int i=1; i<=5; i++){
            if(i==3){
                continue;
           }
           System.out.println(i);
        }
        System.out.println("I am out of loop");
    }
}
