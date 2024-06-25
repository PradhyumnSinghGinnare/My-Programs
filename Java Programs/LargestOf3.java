import java.util.*;

public class LargestOf3 {
    public static void main(String[] args) {
        System.out.println("Enter three number:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        sc.close();
        
        if(a>b && a>c){
            System.out.println("A is Largest");
        }
        else if(b>a && b>c){
            System.out.println("B is Largest");
        }
        else{
            System.out.println("C is Largest");
        }
    }
}
