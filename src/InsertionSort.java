public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {8, 3, 5, 1, 4};

        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;

            // shift elements
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key; // place key in correct spot
        }

        System.out.print("Sorted array: ");
        for (int n : arr) System.out.print(n + " ");
    }
}
