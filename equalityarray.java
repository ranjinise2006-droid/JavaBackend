public class equalityarray {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {1, 2, 3, 4, 5};

       /* boolean isEqual = true;

        if (arr1.length != arr2.length) {
            isEqual = false;
        } else {
            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i] != arr2[i]) {
                    isEqual = false;
                    break;

                }
            }
        }

        if (isEqual) {
            System.out.println("The two arrays are equal.");
        } else {
            System.out.println("The two arrays are not equal.");
        }
    }
    
}
*/ 

boolean status=java.util.Arrays.equals(arr1, arr2);

if (status==true)
{
    System.out.println("Two arrays are equal");
}
else
{
    System.out.println("Two arrays are not equal");
}
    }
}