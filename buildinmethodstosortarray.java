import java.util.Arrays;
import java.util.Collections;

public class buildinmethodstosortarray {
    
    public static void main(String[] args) {
        
/* 
        int a[] = {12,34,8,57,7,39,20,1,04,59};


        //using a parallelsort method to sort the elements directly.

         System.out.println("array elements before sorting:"+Arrays.toString(a));

        Arrays.parallelSort(a);

        System.out.println("array elements after sorting:"+Arrays.toString(a));
      
         // second method
        System.out.println("array elements before sorting:"+Arrays.toString(a));
        Arrays.sort(a);
        System.out.println("array elements after sorting:"+Arrays.toString(a));
      
          */
        Integer a[] = {12,34,8,57,7,39,20,1,04,59};

        System.out.println("array elements before sorting:"+Arrays.toString(a));
        Arrays.sort(a,Collections.reverseOrder());
        System.out.println("array elements sort by desending:"+Arrays.toString(a));
      

    }  


}
