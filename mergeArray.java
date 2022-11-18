public class mergeArray {

    public static void rotate(int[] arr, int d) {
        int l = arr.length;
        int a = 0;
        // int n = l - d;
        int[] arr1 = new int[d];
        for (int i = 0; i < d; i++) {
            arr1[i] = arr[i];
            // System.out.print(arr1[i] + " ");
        }

        for (int i = d; i < l; i++) {

            arr[a] = arr[d];
            System.out.print(arr[i] + " ");
            a++;
        }
        a = 0;
        for (int i = l - d; i < l; i++) {
            arr[i] = arr1[a];
            System.out.print(arr[i] + " ");
            a++;
        }

    }

    public static void main(String[] args) {
        // int n = 6;
        int[] arr = { 1, 3, 6, 11, 12, 17 };
        int d = 3;
        // pushZerosAtEnd(arr);
        rotate(arr, d);

        // int[] ans = merge(arr1, arr2);
        // for (int i = 0; i < ans.length; i++) {
        // System.out.print(ans[i] + " ");
        // }
    }
}
