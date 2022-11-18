import java.util.*;

public class findUnique {

    public static int findUnique(int[] arr) {
        int l = arr.length;
        for (int i = 0; i < l; i++) {
            int count = 0;
            int j;
            for (j = 0; j < l; j++) {
                if (i == j) {
                    continue;
                }
                if (arr[i] == arr[j]) {
                    count++;
                    break;
                }

            }
            if (i == l - 1) {
                j--;
            }
            if (count == 0 && j >= l - 1) {
                return arr[i];
            }

        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 3, 1, 6, 3, 6, 2 };
        // int arr[] = { 3, 4, 3, 4, 1 };
        System.out.println(findUnique(arr));

    }
    // public static int findUnique(int[] arr) {
    // int l = arr.length;
    // int unique = 0;
    // for (int i = 0; i < l; i++) {
    // int count = 0;
    // int j = 0;
    // for (j = 0; j < l; j++) {
    // if (i == j) {
    // continue;
    // }
    // if (arr[i] == arr[j]) {
    // count++;
    // break;
    // }
    // }
    // if (j >= l) {
    // --j;
    // }
    // if (count == 0 && j == l - 1 && i == l - 1) {
    // return unique = arr[i];
    // }

    // for (int j = 0; j < l; j++) {
    // if (i == j) {
    // continue;
    // }
    // if (arr[i] == arr[j]) {
    // count++;
    // break;
    // }
    // if (count == 0 && arr[i] != arr[j]) {
    // return arr[i];
    // }
    // }
    // }
    // return unique;

    // }
    // public static int[] takeInput(){
    // Scanner sc = new Scanner(System.in);
    // System.out.print("enter the size of array: ");
    // int size = sc.nextInt();
    // int input[] = new int[size];

    // for (int i = 0; i < size; i++){
    // input[i] = sc.nextInt();
    // }
    // return input;

    // }

    // public static int uniqueFind(int[] arr){
    // int n = arr.length;

    // for (int i =0; i < n -1; i++){
    // int flag = 0;
    // for (int j = i+1; j< n; j++){

    // if (arr[i] == arr[j]){
    // flag = 1;
    // break;
    // }

    // }
    // if(flag == 0) {
    // if (arr[i] != arr[j]){
    // int unique = arr[i];
    // return unique;
    // }
    // }
    // }
    // return -1;
    // }

}
