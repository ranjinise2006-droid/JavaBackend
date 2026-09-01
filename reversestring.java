public class reversestring {
    public static void main(String[] args) {
        String str = "Hello World!";
        String rev="";
    
 // cancatination operation      
       /*  int len = str.length();
        for (int i = len - 1; i >= 0; i--) {
            rev=rev + str.charAt(i);
        }
         System.out.println("Reversed string: " + rev);*/
 //  using char array 
      /*   char a[] = str.toCharArray();
        for (int i = a.length - 1; i >= 0; i--) {
            rev = rev + a[i];
        }
        System.out.println("Reversed string: " + rev);*/

        //stringbuffer class
        StringBuffer sb = new StringBuffer(str);
        
        System.out.println(sb.reverse());
    }
}