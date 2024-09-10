package Recursion;

import java.util.ArrayList;

public class multiple_ocurrence_in_the_arraylist {
    public static void main(String[]args){
        int[]arr = {2,3,1,4,4,5};


    }
    static ArrayList<Integer>list = new ArrayList<>();
    static void findvalues(int[]arr, int target, int index){
        if (index == arr.length){
            return;
        }
        if (arr[index] == target){
            list.add(index);
        }
         findvalues(arr,target,index+1);
    }

}

