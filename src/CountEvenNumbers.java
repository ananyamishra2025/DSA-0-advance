public class CountEvenNumbers {
    public static void main(String[] args) {
        int[] arr = {2, 7, 8, 3, 10};
        int count = 0;

        for (int num : arr) {     // enhanced for loop
            if (num % 2 == 0) {
                count++;         // increase count
            }
        }

        System.out.println("Total even numbers = " + count);
    }
}

