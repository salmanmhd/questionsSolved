import java.util.*;

public class pairSum {
    public static int pairSum(int arr[], int x) {
        int l = arr.length;
        int count = 0;

        for (int i = 0; i < l - 1; i++) {
            for (int j = i + 1; j < l; j++) {
                if (arr[i] + arr[j] == x) {
                    count++;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = { 1, 3, 6, 2, 5, 4, 3, 2, 4 };
        int x = 7;
        System.out.println(pairSum(arr, x));

    }
}
