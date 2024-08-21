import java.util.Scanner;

public class ReadCharacterFromSpecificPosition {
    public static void main(String[] args) {
        System.out.print("Enter your string: ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = s.length();
        System.out.println("Your string is: " + s.substring(2, n));
    }
}
