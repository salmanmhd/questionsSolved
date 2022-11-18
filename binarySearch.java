import java.util.*;

public class binarySearch {
    public static int searchBinary(int arr[], int x) {
        int l = arr.length;
        int start = 0;
        int end = l - 1;
        // int mid = (start + end) / 2;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == x) {
                return mid;
            } else if (arr[mid] > x) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return -1;
    }

    // public static int searchElement(int arr[], int x){
    // int start = 0;
    // int end = arr.length - 1;

    // while (start <= end){
    // int mid = (start + end )/2;
    // if ( x == arr[mid]){
    // return mid;
    // }
    // else if(x > arr[mid]) {
    // start = mid + 1;
    // }
    // else{
    // end = mid - 1;
    // }

    // }
    // return -1;

    // }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        int x = 6;
        System.out.println(searchBinary(arr, x));
    }
}
