public class Problem3 {
    public static void main(String[] args){
        int[] arr = {2, 5, 2, 7, 2, 9};
        int target = 2;
        int count = 0;

        for(int num : arr){
            if(num == target){
                count++;
            }
        }
        System.out.println("Total occurrences = " + count);
    }
}
