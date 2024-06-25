public class ArrayQuestions{
    public static void main(String[] args) {
        int num[] = {1, 2, 3, 5};
        System.out.println(repeatElements(num));
    }

    public static boolean repeatElements(int[] num){
        for(int i=0; i<num.length-1; i++){
            for(int j=i+1; i<num.length; j++){
                if(num[i] == num[j]){
                    return true;
                }
            }
        }
        return false;
    }
}
