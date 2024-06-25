import java.util.*;

public class Table {
    public static void main(String[] args) {
        System.out.println("Enter a number:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();

        for(int i=1; i<=10; i++){
            System.out.println(i + " X " + num + " = " + num*i);
        }
    }
}
