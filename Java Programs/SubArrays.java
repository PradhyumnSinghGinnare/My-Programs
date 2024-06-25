import java.util.Currency;

public class SubArrays{
    public static void main(String[] args) {
        int num[] = {2, 4, 6, 8, 10};
        printSubarrays(num);
        sumSubarrays(num);
        prefixSubarraySum(num);
        kanade(num);
    }

    public static void printSubarrays(int num[]){
        int totalSubarrays = 0;
        for(int i=0; i<num.length; i++){
            for(int j=i; j<num.length; j++){
                for(int k=i; k<=j; k++){
                    System.out.print(num[k] + " ");
                }
                totalSubarrays++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total Subarrays = " + totalSubarrays);
    }

    public static void sumSubarrays(int num[]){   //Brute Force
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i=0; i<num.length; i++){
            for(int j=i; j<num.length; j++){
                currSum = 0;
                for(int k=i; k<=j; k++){
                    //Subarrays Sum
                    currSum += num[k];
                }
                System.out.println(currSum);
                if(maxSum < currSum){
                    maxSum = currSum;
                }
            }
        }
        System.out.println("Maximum Sum = " + maxSum);
    }

    public static void prefixSubarraySum(int num[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[num.length];

        prefix[0] = num[0];
        //Calculate prefix array
        for(int i=1; i<prefix.length; i++){
            prefix[i] = prefix[i-1] + num[i];
        }

        for(int i=0; i<num.length; i++){
            int start = i;
            for(int j=i; j<num.length; j++){
                int end = j;

                currSum = start == 0 ? prefix[end] : prefix[end] - prefix[start-1];

                if(maxSum < currSum){
                    maxSum = currSum;
                }
            }
        }
        System.out.println("Max Sum is: " + maxSum);
    }

    public static void kanade(int num[]){
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;

        for(int i=0; i<num.length; i++){
            currSum = currSum + num[i];
            if(currSum < 0){
                currSum = 0;
            }
            maxSum = Math.max(currSum, maxSum);
        }
        System.out.println("Max Subarray Sum is: " + maxSum);
    }
}