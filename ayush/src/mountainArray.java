
public class mountainArray {
    public static void main(String[]args){
        int[]arr = {1,2,3,5,7,6,3,2};
        System.out.println(findN(arr));
    }
    static int findN(int[]arr){
        int start = 0;
        int end = arr.length-1;
        while (start<end){
            int mid = start+(end-start)/2;
            //case -> 1
            if (arr[mid] >arr[mid+1]){
                end =  mid;
                //case ->2
            } else  {
                start = mid+1;



            }
        }
        return start;
    }

}
