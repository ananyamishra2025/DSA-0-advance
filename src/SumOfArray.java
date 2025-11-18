public class SumOfArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int sum = 0;

        for (int num : arr) {
            sum = sum + num;     // add each value to sum
        }

        System.out.println("Sum of array = " + sum);
    }
}
