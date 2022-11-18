import java.util.*;

public class linearSearch {

    public static int linearSearch(int arr[], int x) {
        int l = arr.length;
        for (int i = 0; i < l; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }

    // public static int[] takeInput(){
    // Scanner sc = new Scanner(System.in);
    // int size = sc.nextInt();
    // int input[] = new int[size];

    // for (int i = 0; i < size; i++){
    // input[i] = sc.nextInt();
    // }
    // return input;
    // }

    // public static int searchLinear( int input[] ){
    // Scanner sc = new Scanner(System.in);
    // int x = sc.nextInt();
    // int ans = 0;
    // for (int i = 0; i < input.length; i++)
    // if (x == input[i]){
    // // System.out.println(input[i] + " ");
    // ans = input[i];
    // }
    // return ans;
    // }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr[] = { 1, 2, 3, 4, 54, 6, 7, 8 };
        int x = 54;
        System.out.println(linearSearch(arr, x));

        // int test = sc.nextInt();

        // for (int i = 1; i <= test; i++){
        // int arr[] = takeInput();
        // int print = searchLinear(arr);
        // // System.out.println("the index of the array is");

        // if ( print == 0){
        // System.out.println("-1");
        // }
        // else {
        // System.out.println(print);
        // }
        // }

    }
}
