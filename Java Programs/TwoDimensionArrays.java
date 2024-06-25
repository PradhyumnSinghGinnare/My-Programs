import java.util.*;

public class TwoDimensionArrays{
    public static void main(String[] args) {
        int arr[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        InputOutput(arr);
        searchIndex(arr, 7);
        System.out.println(diagonalSum(arr));
        staircaseSearch(arr, 11);
        printSearchElement();
        secondRowSum();
    }  
    
    public static void InputOutput(){
        // Input
        int arr[][] = new int[3][3];
        int row = arr.length;
        int col = arr[0].length;
        Scanner sc = new Scanner(System.in);
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                arr[i][j] = sc.nextInt();
            }
        }

        // Output
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean searchIndex(int[][] arr, int key){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                if(arr[i][j] == key){
                    System.out.println("Key found at index: (" + i + "," + j + ")");
                    return true;
                }
            }
        }
        System.out.println("Key not found!!");
        return false;
    }

    public static int diagonalSum(int[][] arr){
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                if(i==j){
                    sum += arr[i][j];
                }
                else if(i+j == arr.length-1){
                    sum += arr[i][j];
                }
            }
        }
        return sum;
    }

    public static boolean staircaseSearch(int[][] arr, int key){
        int row = 0, col = arr[0].length-1;

        while(row < arr.length && col >= 0){
            if(arr[row][col] == key){
                System.out.println("found key at index: (" + row + "," + col +")");
                return true;
            } else if(key < arr[row][col]){
                col--;
            } else {
                row++;
            }
        }
        System.out.println("Key not found!!");
        return false;
    }

    public static void printSearchElement(){
        int arr[][] = {{4,7,8},{8,8,7}};
        int key = 7;  
        int searchElement = 0;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                if(arr[i][j] == key){
                    searchElement++;
                }
            }
        }
        System.out.println(searchElement);
    }

    public static void secondRowSum(){
        int arr[][] = {{1,4,9},{11,4,3},{2,2,3}};
        int sum = 0;
        for(int i=0; i<arr[0].length; i++){
            sum += arr[1][i];
        }
        System.out.println(sum);
    }
}
