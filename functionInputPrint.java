import java.util.*;
public class functionInputPrint {

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

    public static void print(int input[]){
        int size = input.length;

        for (int i = 0; i < size; i++){
            System.out.print(input[i] + " ");
        }
    }


    public static void main(String[] args) {
        int arr[] = takeInput();
        print(arr);




    }
}
