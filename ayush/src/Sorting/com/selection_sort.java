package Sorting.com;

import java.util.Arrays;

public class selection_sort {
    public static void main(String[]args){
        int[]arr = {3,1,5,4,2};
        search(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void search(int[]arr){
        for (int i = 0; i <arr.length; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }


            }
            swap(arr,min,i);


        }




    }
    static void swap(int[]arr,int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

}
