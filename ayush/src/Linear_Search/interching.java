package Linear_Search;

import java.util.Arrays;

public class interching {
    public static void main(String[]args){
        int []arr = {1,2,7,8,5};
        System.out.println(Arrays.toString(ans(arr)));

    }
    static int[] ans(int[]arr){
        int []nums = new int[arr.length-1];
        int j = 0;
        for (int i = 0; i < nums.length; i+=2) {

            nums[i] = arr[j+1];
            nums[i+1] = arr[j];
            j+=2;

        }
        return nums;
    }
}
