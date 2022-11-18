import java.util.*;
public class sumOfArray {    

    public static int sumArray(int input[]){
        int ans = 0;
        for (int i = 0; i < input.length ; i++){
            ans = ans + input[i];
        }
        return ans;
    }

    public static int[] input(){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int input[] = new int[size];

        for (int i = 0; i < size; i++){
            input[i] = sc.nextInt();
        }
        
        return input;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      int test = sc.nextInt();  

      for (int i = 1; i <= test; i++){
      int arr[] = input();
      int sum = sumArray(arr);
      System.out.println(sum);
      }
    }
}
