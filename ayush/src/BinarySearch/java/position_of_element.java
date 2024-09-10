package BinarySearch.java;

public class position_of_element  {
    public static void main(String[]args){
        int[]arr = {0,5,5,6};
        int target = 5;
        int[] result = search(arr,target);
        System.out.println("start index is" + result[0]);
        System.out.println("end index is " + result[1]);

    }
    static int[] search(int[]arr,int target){

int[]ans = {-1,-1};
        int start = 0;
        int end = arr.length-1;
        while(start<=end) {
            int mid = start + (end - start) / 2;
            if (target == arr[mid]) {
                ans[0] = mid;
end = mid-1;            } else if (arr[mid] < target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
            start = 0;
            end = arr.length-1;
            while (start <=end){
                int mid = start+(end-start)/2;
                if (target==arr[mid]){
                    ans[1] = mid;
                    start = mid+1;
                }else if (arr[mid]>target){
                    start = mid+1;
                }else{
                    end = mid-1;
                }
            }
            return  ans;

        }
    }

