public class secondLargest {
    public static int secondLargestElement(int[] arr) { // OPTIMIZED
        int l = arr.length;
        int secondLargest = Integer.MIN_VALUE;
        int max = 0;

        for (int i = 0; i < l; i++) {
            if (arr[i] > max) {
                secondLargest = max;
                max = arr[i];

            } else if (secondLargest < arr[i] && arr[i] != max) {
                secondLargest = arr[i];
            }
        }

        return secondLargest;
    }

    // public static int secondLargestElement(int[] arr) {
    // int l = arr.length;
    // int max = Integer.MIN_VALUE;
    // int maxIndex = 0;

    // if (l <= 1) {
    // return max;
    // }
    // int count = 0;
    // for (int i = 0; i < l - 1; i++) {
    // if (arr[i] != arr[i + 1]) {
    // count++;
    // }
    // }
    // if (count == 0) {
    // return max;
    // }

    // for (int i = 0; i < l; i++) {
    // if (arr[i] > max) {
    // max = arr[i];
    // maxIndex = i;
    // }

    // }
    // max = Integer.MIN_VALUE;

    // for (int i = 0; i < l; i++) {
    // if (i == maxIndex) {
    // continue;
    // }

    // if (arr[i] > max) {
    // max = arr[i];
    // ;
    // }

    // }

    // return max;

    // }

    public static void main(String[] args) {
        int arr[] = { 9, 9, 9, 9 };
        // int arr[] = { 8, 9, 9, 1, 7, 5, 5, 10, 1, 0, 7 };
        System.out.println(secondLargestElement(arr));
    }
}
