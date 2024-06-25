public class SearchInRotatedSortedArray {
    public static int Search(int arr[], int tar, int si, int ei){
        if(si>ei){
            return -1;
        }
        int mid = si + (ei-si)/2;  //(si+ei)/2

        //case found
        if(arr[mid] == tar){
            return mid;
        }

        //mid on line 1
        if(arr[si] <= arr[mid]){
            //case 1: left
            if(arr[si] <= tar && tar <= arr[mid]){
                return Search(arr, tar, si, mid-1);
            } else{
                //case 2: right
                return Search(arr, tar, mid+1, ei);
            }
        }
        //mid on line 2
        else{
            //case 3: right
            if(arr[mid] <= tar && tar <= arr[ei]){
                return Search(arr, tar, mid+1, ei);
            } else{
                //case 4: left
                return Search(arr, tar, si, mid-1);
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;
        int tarIdx = Search(arr, target, 0, arr.length);
        System.out.println(tarIdx);
    }
}
