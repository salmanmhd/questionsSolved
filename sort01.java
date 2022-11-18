import java.util.*;

public class sort01 {
    public static void sortZeroesAndOne(int[] arr) {
        int l = arr.length;
        int pos1 = 0;

        for (int i = 0; i < l; i++) {
            if (arr[i] == 1) {
                pos1 = i;
            }

            if (arr[i] == 0) {
                if (i > pos1) {
                    arr[pos1] = 0;
                    // arr[i] = 1;
                    pos1 = i;
                }
            }
        }

    }

    // public static void sortZeroesAndOne(int[] arr) {
    // int l = arr.length;
    // int count0 = 0;

    // for (int i = 0; i < l; i++) {
    // if (arr[i] == 0) {
    // count0++;
    // }
    // }

    // for (int i = 0; i < count0; i++) {
    // arr[i] = 0;
    // }

    // for (int i = count0; i < l; i++) {
    // arr[i] = 1;
    // }

    // }

    public static void main(String[] args) {
        int arr[] = { 1, 0, 0, 1, 1, 0 };
        sortZeroesAndOne(arr);
        System.out.println(Arrays.toString(arr));
    }

    // public static void sort(int[] arr){
    // int n = arr.length;
    // int count = 0;

    // for (int i = 0; i < n; i++){
    // if (arr[i] == 0){
    // count++;
    // }
    // // System.out.println(count);
    // }

    // for (int i = 0; i <= count; i++){
    // arr[i] = 0;
    // }
    // for (int i = count +1; i < n; i++){
    // arr[i] = 1;
    // }

    // }

}
