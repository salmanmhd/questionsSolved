import java.util.*;

public class insertionSort {
    public static void insertion(int arr[]) {
        int l = arr.length;
        for (int i = 0; i < l - 1; i++) {
            int element = i + 1;
            for (int j = i; j >= 0; j--) {
                if (arr[element] < arr[i]) {
                    int temp = arr[i];
                    arr[i] = arr[element];
                    arr[element] = temp;
                } else if (arr[element] > arr[i]) {
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        int arr[] = { 4, 3, 2, 1 };
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }

    // public static void insertion(int[] arr){
    // for(int i = 1; i < arr.length; i++){
    // int j = i-1;
    // int temp = arr[i];
    // while (j >= 0 && arr[j] > temp){
    // arr[j+1] = arr[j];
    // j--;
    // }
    // arr[j+1] = temp;
    // }
    // }

}
