public class bs {
    public static void main(String[] args) {
        int[]arr = {10,8,6,4,2};
        int target = 6;
        System.out.println(search(arr,target));
    }
    static int search(int[]arr,int target){
        int start = 0;
        int end = arr.length-1;
        while (start>=end){
            int mid = start+(end-start)/2;
            if (target == arr[mid]){
                return mid;
            } else if (target>arr[mid]) {
                start = mid+1;

            }else {
                end = mid-1;
            }
        }
        return -1;
    }
}
