public class duplicate {

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 6, 7, 4, 5, 2};

        // Flag (true/false switch). Starts as false = "no duplicate found yet"
        boolean found = false;

        
        for (int i = 0; i < nums.length; i++) {


            for (int j = i + 1; j < nums.length; j++) {

                if (nums[i] == nums[j]) {
                    System.out.println("Duplicate number is: " + nums[i]);
                    found = true;
                    break;
                }
            }
            if (found) {
                break;
            }
        }
        if (!found) {
            System.out.println("No duplicate number found.");
        }
    }
}
