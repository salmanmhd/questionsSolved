public class checkArrayRotation {
    public static int arrayRotateCheck(int[] arr) {
        int l = arr.length;
        int index = 0;
        int small = Integer.MAX_VALUE;

        for (int i = 0; i < l; i++) {
            if (arr[i] < small) {
                small = arr[i];
                index = i;
            }

        }
        return index;
    }

    public static void main(String[] args) {
        int arr[] = { 5, 6, 1, 2, 3, 4 };
        System.out.println(arrayRotateCheck(arr));

    }
}
