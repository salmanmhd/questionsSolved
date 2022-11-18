import java.util.*;

public class selectionSort {

    public static void sort(int[] arr) {
        int l = arr.length;

        for (int i = 0; i < l; i++) {
            int temp = arr[i];
            int small = arr[i];
            int n = l - 1;
            for (int j = i + 1; j < l; j++) {

                if (small > arr[j]) {
                    small = arr[j];
                    n = j;
                    // System.out.println(n);
                }
            }

            if (small != temp) {
                arr[i] = small;
                arr[n] = temp;
            }
            // System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        int arr[] = { 4, 3, 2, 1 };
        sort(arr);
        // System.out.println(Arrays.toString(arr));

    }

    // public static void sort(int[] arr){
    // for (int i = 0; i < arr.length - 1; i++){
    // int min = arr[i];
    // int minIndex = i;

    // for (int j = i +1; j < arr.length; j++){
    // if ( arr[j] < min){
    // min = arr[j];
    // minIndex = j;
    // }

    // }

    // if(minIndex != i){
    // arr[minIndex] = arr[i];
    // arr[i] = min;
    // }

    // }
    // }

}
