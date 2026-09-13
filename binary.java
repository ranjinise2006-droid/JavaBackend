public class binary {
    public static void main(String[] args) {
        int a[] = {44, 56, 68, 79, 81, 90, 98};
        boolean flag = false;

        int key = 79;

        int i = 0;
        int h = a.length - 1;

        while (i <= h) {
            int m = (i + h) / 2;

            if (a[m] == key) {
                System.out.println("element found..");
                flag = true;
                break;
            }

            if (a[m] < key) {
                i = m + 1;
            } else {
                h = m - 1;
            }
        }

        if (!flag) {
            System.out.println("not found..");
        }
    }
}
