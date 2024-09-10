package Leetcode_question;

public class Find_Duplicate {
    public static void main(String[]args){
        int[]arr = {1,2,6,8,6,4};
        System.out.println(ans2(arr));

    }
    static int ans2(int[]arr){
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            result = result ^ arr[i];

        }
        for (int i = 1; i < arr.length; i++) {
            result = result^i;

        }
        return result;

    }
}
