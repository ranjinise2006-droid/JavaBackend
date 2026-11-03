public class twosum {
    void meth1()
    {
        System.out.println("implementing two sum");
        int arr[]= {1,7,11,15};
        int target=8;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]+arr[j]==target)
                {
                    System.out.println("index of two sum is :"+i+" "+j);
                }
            }
        }
    }
    public static void main(String[] args) {
        new twosum().meth1();
    }
    
}
