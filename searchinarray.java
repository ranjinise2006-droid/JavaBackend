public class searchinarray {

    public static void main(String[] args) {
        int arr[] = {34, 56, 67, 12, 06, 25};

        int search =12;
        boolean flag=false;

        for(int i=0;i<arr.length;i++)
        {
          // System.out.println(arr[i]) ;

          if(search ==arr[i]){

            System.out.println("element is found at the position in:"+i);
            flag=true;
            break;

          }

        }
          if(flag==false)
            {
              System.out.println("element not found in the array");
            
        }   
    }

    
}