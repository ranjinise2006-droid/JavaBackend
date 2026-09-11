public class oddandeveninarray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 12, 6, 7, 8, 9, 10};

     // enhanced for loop to count even and odd numbers in the array


        System.out.println("Even numbers in the array are: ");
        for (int value : arr) {
            if (value % 2 == 0) {
                System.out.println(value);
            }
        }
        System.out.println("Odd numbers in the array are: ");
        for (int value : arr) {
            if (value % 2 != 0) {
                System.out.println(value);
                
            }
        }
    }
}


