package Recursion;

import java.util.Scanner;

public class sorting {
    public static void main(String[]args) {
        int[] arr = {1, 2, 3, 4, 5};
    }
    static boolean sort(int[]arr,int index){
        // base condition
        if (index == arr.length-1){
            return true;
        }
        return arr[index]>arr[index+1]&&sort(arr,index+1);


    }

}
