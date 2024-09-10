package Linear_Search;

public class seaching {
    public static void main(String[]args){
        int[]arr = {2,3,5,7,9,12};
        int target = 9;

        System.out.println(search(arr,target));
    }
    static int search(int[]arr,int target){
        int start = 0;
        int end = arr.length-1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target){
                return i;


            }

        }
        return -1;
    }
}
