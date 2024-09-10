import java.util.Arrays;

public class two_pointers {
    public static void main(String[]args){
        int[]arr = {5,7,9,11,13,15};
        rev(arr);
        //swap(arr,0, arr.length-1);
        System.out.println(Arrays.toString(arr));

    }
    static void rev(int[]arr){
        int start = 0;
        int end  = arr.length-1;
        while (start<end){
            swap(arr,start,end);
            start++;
            end--;

        }


    }
    static void swap(int[]arr,int first,int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
