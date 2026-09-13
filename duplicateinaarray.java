public class duplicateinaarray {

    public static void main(String[] args) {
      String[] arr = {"python", "java", "c", "php","python", "dsa"};

    boolean flage=false;
         for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].equals(arr[j])) {
                    System.out.println("Duplicate element: " + arr[i]);
                    flage=true; 
                }
            }
         }

         if(flage==false)
         { 
            System.out.println("duplicate element not be founded");
         }
    }
}

