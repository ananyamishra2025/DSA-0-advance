public class Problem4 {
    public static void main(String[] args) {
        int[] arr = {100, 80, 60, 40, 20, 10};
        int target = 40;

        int low = 0, high = arr.length - 1;
        int position = -1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == target) {
                position = mid;
                break;
            }
            else if (arr[mid] > target) {  // move right (opposite of ascending)
                low = mid + 1;
            }
            else {
                high = mid - 1;            // move left
            }
        }

        System.out.println("Position = " + position);
    }
}
