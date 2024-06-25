// import java.util.*;

public class Functions {
    public static void main(String[] args) {
        System.out.println("Enter two numbers:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        sc.close();
        //Sum function call
        int sum = Sum(a, b); //Arguments
        System.out.println("Sum is : " + sum);

        //Swap function call
        Swap(a, b);

        //Function Overloading
        //Multiply function call
        System.out.println(Multiply(5, 4));
        System.out.println(Multiply(5, 4, 2));

        //Sum function call
        System.out.println(Sum(5, 2));
        System.out.println(Sum(4.2f, 5.4f));
    }

    //Sum Function
    public static int Sum(int a, int b){ //Parameters
        int sum = a + b;
        return sum;
    }

    //Swap Function
    public static void Swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;

        System.out.println(a);
        System.out.println(b);
    }

    //Function Overloading
    //Multiply Function
    public static int Multiply(int a, int b){
        return a * b;
    }

    public static int Multiply(int a, int b, int c){
        return a * b *c;
    }

    //Sum Function
    public static int Sum(int a, int b){
        return a+b;
    }

    public static float Sum(float a, float b){
        return a+b;
    }
}
