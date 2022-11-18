import java.util.*;

public class tripletSum {

    public static int findTriplet(int[] arr, int x) {
        int l = arr.length;
        int ans = 0;

        for (int i = 0; i < l - 2; i++) {
            for (int j = i + 1; j < l - 1; j++) {
                for (int k = j + 1; k < l; k++) {

                    if (arr[i] + arr[j] + arr[k] == x) {
                        ans++;
                    }
                }
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        int x = 12;
        System.out.println(findTriplet(arr, x));

    }
}
