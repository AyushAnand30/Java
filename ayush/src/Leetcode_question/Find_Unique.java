package Leetcode_question;

public class Find_Unique {
    public static void main(String[]args){
        int[]arr = {1,1,2,2,3};
        System.out.println(ans(arr));
    }
   private static int ans(int[]arr){
        int unique = 0;
       for (int i = 0; i < arr.length; i++) {
           unique ^= arr[i];

       }
       return  unique;

    }
}
