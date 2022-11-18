public class printPair {
    public static void printAllPair(int[] arr) {
        int l = arr.length;
        for (int i = 0; i < l - 1; i++) {
            for (int j = i + 1; j < l; j++) {
                System.out.println(arr[i] + " , " + arr[j]);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 1, 4, 7, 6, 5 };
        printAllPair(arr);
    }
}
