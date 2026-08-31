import java.util.Scanner;

public class reversenum {
     public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a number to reverse: ");
        int num = sc.nextInt();
       /*  int reverse = 0;

        while (num != 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num / 10;
        }
        
         
        //using stringbuffer class
        StringBuffer sb = new StringBuffer(String.valueOf(num));
        sb.reverse();
            */
        //using stringbuilder class 
        
        StringBuilder sb1 = new StringBuilder();
        sb1.append(num);
        sb1.reverse();
        System.out.println("Reversed number: " + sb1);
    }

}