package BinarySearch.java;

public class ndmethod {
    public static void main(String[]args){
        int[]arr = {5,7,7,7,7,8,10};
        int target = 7;
        int[] result  = Search(arr,target);
        System.out.println("start index is " + result[0]);
        System.out.println("end is " + result[1]);

    }
    static  int[] Search(int[]arr,int target) {
        int[] ans = {-1, -1};
        int start = 0;

        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == arr[mid]) {
                ans[0] = mid;
                end = mid - 1;
            } else if (target < arr[mid]) {
                end = mid - 1;

            } else {
                start = mid + 1;
            }


        }
        start =0;
        end = arr.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if (target == arr[mid]){
                ans[1] = mid;
                start = mid +1;

            } else if (mid<target) {
                end = mid-1;

            }else {
                start = mid+1;
            }
        }
        return ans;
    }


}