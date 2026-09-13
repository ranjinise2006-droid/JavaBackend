public class maxandmin {

public static void main(String[] args) {

        int a[] = {91 ,32 ,73 ,55 ,66 ,05};
        
        int max=a[0];

        for(int i=1;i<a.length;i++)
        {
            if(a[i]>max)
            {
                max=a[i];
            }
        }
        System.out.println("maximum value in the array is:"+max);

     int min=a[0];

        for(int i=1;i<a.length;i++)
        {
            if(a[i]<min)
            {
                min=a[i];
            }
        }
        System.out.println("minimum value in the array is:"+min);


        
    }

    
}



    

