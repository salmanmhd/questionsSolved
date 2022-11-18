import java.util.*;

public class takeInput {
    public static int[] takeInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size of array: ");
        int size = sc.nextInt();
        int input[] = new int[size];

        for (int i = 0; i < size; i++) {
            input[i] = sc.nextInt();
        }
        return input;

    }

    public static void main(String[] args) {
        int arr[] = takeInput();
    }
}
