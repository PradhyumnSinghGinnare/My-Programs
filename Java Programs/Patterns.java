public class Patterns {
    public static void main(String[] args) {
        //Star Pattern
        for(int i=1; i<=4; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //Inverted Star pattern
        for(int i=1; i<=4; i++){
            for(int j=1; j<=4-i+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        //Half Pyramid Pattern
        for(int i=1; i<=4; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j);
            }
            System.out.println();
        }

        //Character Pattern
        char ch = 'A';
        for(int i=1; i<=4; i++){
            for(int j=1; j<=i; j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}
