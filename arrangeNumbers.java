import java.util.*;
public class arrangeNumbers{
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

    public static void rearrange(int arr[]){
        int n = arr.length;
        int value =1;
        for (int i =0; i <= (n-1)/2; i++){
            System.out.print(value + " ");
            value = value +2;
        }
       int m = 0;
        if (n % 2 == 0){
            m = n;
        }
        else{
            m = n-1;
        }
        int valueEven = m;
        for (int i = ((n-1)/2)+1; i < m; i++){
            System.out.print(valueEven + " ");
            valueEven = valueEven - 2;
        }
       
        }

    

    public static void main(String[] args) {
        int arr[] = takeInput();
        rearrange(arr);



    }
}

