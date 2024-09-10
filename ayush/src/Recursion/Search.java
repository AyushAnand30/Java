package Recursion;

public class Search {
    public static void main(String[]args){
        int[]arr = {3,2,1,18,9};
       int ans = findValue(arr,18,0);
        System.out.println(ans);


    }
    static boolean check(int[]arr,int target,int index){
        if (index == arr.length-1){
            return true;
        }
        return arr[index] == target ||check(arr,target,index+1);
    }
    static int findValue(int[]arr,int target,int index){
        if (index == arr.length-1){
            return -1;
        }
        if (arr[index] == target){
            return index;
        }
        return findValue(arr,target,index+1);
    }

}
