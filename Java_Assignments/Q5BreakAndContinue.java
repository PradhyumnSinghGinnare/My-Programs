/* Que 5. Write a java program to illustrate the labeled break and labeled continue with suitable example. */

public class Q5BreakAndContinue {
    public static void main(String[] args) {
        outerLoop: // Labeling outer loop
        for (int i = 1; i <= 3; i++) {
            System.out.println("Outer loop iteration: " + i);
            
            innerLoop: // Labeling inner loop
            for (int j = 1; j <= 3; j++) {
                System.out.println("Inner loop iteration: " + j);
                
                if (i == 2 && j == 2) {
                    System.out.println("Breaking inner loop...");
                    break innerLoop; // Breaks out of the inner loop
                }
                
                if (i == 3 && j == 1) {
                    System.out.println("Breaking outer loop...");
                    break outerLoop; // Breaks out of the outer loop
                }
                
                if (i == 1 && j == 2) {
                    System.out.println("Continuing inner loop...");
                    continue innerLoop; // Skips rest of the inner loop iteration
                }
                
                if (i == 2 && j == 1) {
                    System.out.println("Continuing outer loop...");
                    continue outerLoop; // Skips rest of the outer loop iteration
                }
            }
        }
    }
}
