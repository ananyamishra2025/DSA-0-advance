public class BubbleSortProblem1 {
    public static void main(String[] args) {
        int[] arr = {9, 4, 7, 1, 3};

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.print("Sorted: ");
        for (int n : arr) System.out.print(n + " ");
    }
}
