public class MaxInArray {
    public static void main(String[] args) {
        int[] arr = {3, 9, 1, 5};
        int max = arr[0];   // assume first element is max

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];    // update max
            }
        }

        System.out.println("Maximum number = " + max);
    }
}
