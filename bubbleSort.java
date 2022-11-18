import java.util.Arrays;

public class bubbleSort {
    public static void sort(int arr[]) {
        int l = arr.length;
        int x = l - 1;
        for (int i = 0; i < l - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < x; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;

                }
            }
            if (!swapped) {
                break;
            }
            x--;
        }
    }

    public static void main(String[] args) {
        int arr[] = { 4, 3, 2, 1 };
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
