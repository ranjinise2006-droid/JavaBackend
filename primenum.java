public class primenum {
    public static void main(String[] args) {
        int num = 29;
        int count = 0;

        if (num > 1) {
            for (int i = 2; i <=(num); i++)
                 {
                if (num % i == 0) {
                    count++;
                }
        

            }

            if (count == 1) {
                System.out.println(num + " is a prime number.");
            } else {
                System.out.println(num + " is not a prime number.");
            }
        } else {
            System.out.println(num + " is not a prime number.");
        }
    }
}


