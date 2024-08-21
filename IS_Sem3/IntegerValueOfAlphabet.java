import java.util.Scanner;

public class IntegerValueOfAlphabet {
    public static void main(String[] args) {
        System.out.print("Enter a Character: ");

        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);

        if (ch >= 'a' && ch <= 'z') {
            int value = (int) ch - 97;
            System.out.println(value);
        } else if (ch >= 'A' && ch <= 'Z') {
            int value = (int) ch - 65;
            System.out.println(value);
        }
    }
}
