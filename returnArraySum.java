public class returnArraySum {

    public static int sum(int[] arr) {
        int l = arr.length;
        int sum = 0;
        for (int i = 0; i < l; i++) {
            sum = sum + arr[i];
        }

        return sum;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 6 };
        int ans = sum(arr);
        System.out.println(ans);
    }
}
