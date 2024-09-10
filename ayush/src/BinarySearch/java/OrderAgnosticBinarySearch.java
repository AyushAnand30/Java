package BinarySearch.java;

public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        int[] arr = {12,11,6,3,2};
        int target = 6;
        System.out.println(orderAgnostic(arr,target));


    }

    static int orderAgnostic(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
       // boolean isAsc = arr[start] < arr[end];
        while (start<=end) {
            int mid = start + (end - start) / 2;
           // if (isAsc) {
                if (target > arr[mid]) {
                    start = mid + 1;

                } else if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    return mid;
                }
            }

        return -1;
    }
}
