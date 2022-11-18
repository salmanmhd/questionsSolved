import java.util.*;

public class findDuplicate {

    public static int duplicateNumber(int arr[]) {
        int l = arr.length;
        for (int i = 0; i < l; i++) {
            for (int j = 0; j < l; j++) {
                if (i != j) {
                    if (arr[i] == arr[j]) {
                        return arr[i];
                    }
                }
            }
        }
        return -1;
    }

    // public static int duplicateFind(int[] arr){
    // int n = arr.length;

    // for (int i =0; i < n - 1; i++){
    // int j;
    // for (j = i+1; j < n; j++){
    // if(arr[j] == arr[i]){
    // int duplicate = 0;
    // duplicate = arr[i];
    // return duplicate;
    // }
    // }

    // }
    // return -1;
    // }

    public static void main(String[] args) {
        int arr[] = { 0, 2, 1, 3, 1 };
        System.out.println(duplicateNumber(arr));

    }
}
