import java.util.Arrays;

public class bubble {

    public static void main(String[] args) {

    int a[] = {5, 3, 7, 8, 1, 0, 9, 1};

    System.out.println("before array sorted:" +Arrays.toString(a));
    int n = a.length;

    for(int i=0;i<n-1;i++){
        for(int j=0;j<n-1;j++){
            if(a[j]>a[j+1]){
                int temp=a[j];
                a[j] = a[j+1];
                a[j+1] = temp;
                

            }
        }
    }
    System.out.println("after sorted array:"+ Arrays.toString(a)); 
        
    }
    
}
