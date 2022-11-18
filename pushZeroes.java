import java.util.*;

public class pushZeroes {

    public static void push(int arr[]) { // better one
        int pos = 0;
        int l = arr.length;

        for (int i = 0; i < l; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[pos];
                arr[pos] = temp;
                pos++;
            }
        }
    }

    public static void push1(int arr[]) { // using extra array
        int l = arr.length;
        int arr1[] = new int[l];
        int j = 0;

        for (int i = 0; i < l; i++) {
            if (arr[i] != 0) {
                arr1[j] = arr[i];
                j++;
            }
        }

        for (int i = 0; i < l; i++) {
            arr[i] = arr1[i];
        }
    }

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        int arr[] = { 1, 2, 3, 0 };
        push(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
