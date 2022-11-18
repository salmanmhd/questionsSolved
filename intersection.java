import java.util.*;
public class intersection {
    public static int[] takeInput(){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size of array: ");
        int size = sc.nextInt();
        int input[] = new int[size];

        for (int i = 0; i < size; i++){
            input[i] = sc.nextInt();
        }
        return input;
        
    }

    public static void sort(int[] arr, int [] arr1){
		int n = arr.length;
        int m = arr1.length;
        // int count = 0;
        
        for (int i = 0; i < n; i++){
            for (int j =0; j< m; j++){
                if (arr[i] == arr1[j]){
                    System.out.print(arr[i]+ " ");
                    arr1[j] = Integer.MIN_VALUE;
                    break;
                }
            }
        }
        // return count;
        
    }




    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = takeInput();
        int arr1[] = takeInput();
       sort(arr, arr1);
       
        
    }
}
