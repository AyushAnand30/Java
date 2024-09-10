package BinarySearch.java;

import java.util.Arrays;

public class Suffle_the_array {
    public static void main(String[]args){
        int[]arr = {2,5,1,3,4,7};
        System.out.println(Arrays.toString(suffle(arr,3)));
    }
    static int[] suffle(int[]arr,int n){
        int ans[] = new int[2*n];
        int j = 0;
        for (int i = 0; i <2*n ; i++) {
            ans[i] = arr[j];
            ans[i+1] = arr[j+n];


        }
        return ans;
    }
}
