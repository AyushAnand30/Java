package BinarySearch.java;

public class findingInInfiniteSeries {
    public static void main(String[]args) {
        int[] arr = {45, 34, 32, 31, 24, 22, 20};
        int target = 24;
        System.out.println(ans2(arr,target));
    }
        static int ans2(int[]arr,int target){
        int start = 0;
        int end = 1;
        while (target>arr[end]) {

            start = end + 1;
            end = end +(end-start+1)*2;
        }
        return ans(arr,target,start,end);



        }



    static int ans(int[]arr,int target,int start,int end){

        while(start<=end){
            int mid = start+(end-start)/2;
            if (target==arr[mid]){
                return mid;
            } else if (arr[mid]<target) {
                end = mid-1;

            }else {
                start = mid+1;
            }
        }
        return -1;
    }
}
