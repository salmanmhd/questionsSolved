import java.util.*;

public class rotateArray {

    public static void rotate(int[] arr, int d) {
        int l = arr.length;
        int temp = 0;
        while (d - 1 >= 0) {
            temp = arr[d - 1];
            for (int i = d; i < l; i++) {
                arr[i - 1] = arr[i];
            }

            l--;
            arr[l] = temp;
            d--;

            System.out.println(arr[l]);
        }

        // for(int i = 0; i < l; i++){

        // }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = { 1, 2, 3, 4, 5 };
        int d = 4;
        rotate(arr, d);
        System.out.println(Arrays.toString(arr));
    }

    // public static void rotate(int[] arr, int d){
    // int n = arr.length;
    // int a = n - d;
    // int b = n -a;

    // for (int i =0; i < a; i++){
    // arr[n-b] = arr[i];
    // b++;
    // }
    // for (int i = 0; i < d; i++){
    // arr[i] = arr[n - d];
    // d--;
    // }

    // }

}
