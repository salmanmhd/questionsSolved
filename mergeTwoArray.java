import java.util.*;

public class mergeTwoArray {
    public static int[] merge1(int[] arr1, int arr2[]) {
        int l1 = arr1.length;
        int l2 = arr2.length;
        int arr[] = new int[l1 + l2];

        int i = 0;
        int j = 0;
        int k = 0;
        while (i < l1 && j < l2) {
            if (arr1[i] < arr2[j]) {
                arr[k] = arr1[i];
                i++;
                k++;
            } else {
                arr[k] = arr2[j];
                j++;
                k++;
            }

            if (i == l1 && j < l2) {
                arr[k] = arr2[j];
                j++;
                k++;
            }
            if (j == l2 && i < l1) {
                arr[k] = arr1[i];
                i++;
                k++;
            }

        }

        return arr;
    }

    public static int[] merge(int[] arr1, int arr2[]) { // better one
        int i = 0;
        int j = 0;
        int k = 0;

        int ans[] = new int[arr1.length + arr2.length];
        while (i < arr1.length && j < arr2.length) {

            if (arr1[i] < arr2[j]) {
                ans[k] = arr1[i];
                k++;
                i++;
            } else {
                ans[k] = arr2[j];
                j++;
                k++;
            }
        }

        while (i < arr1.length) {
            ans[k] = arr1[i];
            k++;
            i++;
        }

        while (j < arr2.length) {
            ans[k] = arr2[j];
            k++;
            j++;
        }
        return ans;
    }

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        int arr1[] = { 1, 3, 5, 7 };
        int arr2[] = { 2, 4, 6, 8 };
        int arr3[] = merge(arr1, arr2);
        System.out.println(Arrays.toString(arr3));

    }
}
