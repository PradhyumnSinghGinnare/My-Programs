import java.util.Scanner;

public class TowerOfHanoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of disks: ");
        int disk = sc.nextInt();
        towerOfHanoi(disk, 1, 2, 3);
    }

    public static void towerOfHanoi(int disk, int x, int y, int z){
        if(disk >= 1){
            towerOfHanoi(disk-1, x, z, y);
            System.out.println("Move top disk from tower " + x + " to top of tower " + y);
            towerOfHanoi(disk-1, z, y, x);
        }
    }
}
