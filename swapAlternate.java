import java.util.*;

public class swapAlternate {

    public static void swapAlternate(int arr[]) {
        int l = arr.length;
        // for (int i = 0; i < l; i = i + 2) {
        // // if (arr[i + 1] == l - 1) {
        // // return;
        // // }
        // int temp = arr[i];
        // arr[i] = arr[i + 1];
        // arr[i + 1] = temp;
        // }

        int n = arr.length;
        int temp;
        for (int i = 0; i < n - 1; i += 2) {
            temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }
    }

    // public static void swap(int arr[]){
    // for (int i =0; i < arr.length; i = i+2){
    // if (i == arr.length - 1){
    // System.out.print(arr[i]);
    // break;
    // }
    // else {
    // int t = arr[i];
    // arr[i] = arr[i+1];
    // arr[i+1] = t;
    // System.out.print(arr[i]+" " + arr[i+1] + " ");
    // }
    // }
    // System.out.println();

    // }

    // public static int[] takeInput() {
    // Scanner sc = new Scanner(System.in);
    // int n = sc.nextInt();
    // int input[] = new int[n];
    // for (int i = 0; i < n; i++){
    // input [i] = sc.nextInt();
    // }
    // return input;
    // }

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        swapAlternate(arr);
        System.out.println(Arrays.toString(arr));

    }
}
