package BinarySearch.java;

public class FindingFirstAndLastPositionOfelement {
    public static void main(String[]args) {
    }
    public int[]search2(int[]arr,int target){
        int[]ans = {-1,-1};
        int start = search(arr,target,true);
        int end = search(arr,target,false);
        start = arr[0];
        end = arr[1];
        return  ans;


    }
    static int search(int[]arr,int target,boolean findStart){
        int start = 0;
        int end = arr.length;
        int ans = arr[0];
        while (start<=end){
            int mid = start+(end-start/2);
            if (target == arr[mid]){
                return mid;
            }else if (target == arr[start]){
                end = mid-1;

            }else{
                start = mid+1;
            }
            if (findStart){
                end = mid-1;
            }else {
                start = mid+1;
            }
        }
        return ans;

    }
}
