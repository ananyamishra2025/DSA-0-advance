public class BinarySearch {
    public static int search(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == target) {
                return mid;
            }
            else if (arr[mid] < target) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }

        return -1; // not found
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8, 10, 12};
        int target = 10;

        int result = search(arr, target);
        System.out.println("Found at index: " + result);
    }
}

