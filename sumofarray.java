public class sumofarray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 12, 6, 7, 8, 9, 10};
        int sum = 0;

        for (int i = 0; i< arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Sum of array elements = " + sum);
    }
}