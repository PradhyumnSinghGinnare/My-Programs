import java.util.Scanner;

public class ReadTheText {
    public static void main(String[] args) {
        System.out.print("Enter your string: ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println("Your string is: " + s);
    }
}
