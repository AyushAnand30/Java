package Recursion;

import java.util.ArrayList;

public class list {
    public static void main(String[]args){
        int[]arr = {2,3,1,4,4,5};
        System.out.println(find(arr,4,0,new ArrayList<>()));
    }
    static ArrayList<Integer> find(int[]arr,int target,int index,ArrayList<Integer>list){
        if (index == arr.length-1){
            return list;
        }
        if (arr[index] == target ){
            list.add(index);
        }
        return find(arr,target,index+1,list);

    }
}
