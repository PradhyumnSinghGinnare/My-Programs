import java.util.*;

public class JavaBasics {
    public static void main(String[] args) {
        //Print Output
        System.out.println("Hello World!");

        //Pattern
        System.out.println("* * * *\n* * *\n* *\n*");
        System.out.println("*\n* *\n* * *\n* * * *");
        
        //Input
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        sc.close();
        System.out.println(name);
    }
}