public class intersectionOfTwoArrays {
    public static void intersections(int arr1[], int arr2[]) {
        int l1 = arr1.length;
        int l2 = arr2.length;

        for (int i = 0; i < l1; i++) {
            for (int j = 0; j < l2; j++) {
                // if (i == j) {
                // continue;
                // }

                if (arr1[i] == arr2[j]) {
                    System.out.print(arr1[i] + " ");
                    arr2[j] = Integer.MIN_VALUE;
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr1[] = { 2, 6, 1, 2 };
        int arr2[] = { 1, 2, 3, 4, 2 };
        intersections(arr1, arr2);
    }
}
