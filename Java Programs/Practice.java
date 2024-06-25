/**
 * Practice
 */
import java.util.*;

public class Practice {
    public static void main(String[] args) {
        int a[] = {7, 1, 5, 3, 6, 4, 5};
        for(int i=0; i<a.length; i++){
            for(int j=i+1; j<a.length; j++){
                if(a[i]==a[j]){
                    System.out.println(a[i] + " is duplicate number");
                }
            }
        }
    }
}