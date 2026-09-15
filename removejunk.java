public class removejunk {
     public static void main(String[] args) {
        
        String s="@!#%%T&#()& ranjini 0935197502087";
        
        s=s.replaceAll("[^a-zA-Z0-9]","");
        System.out.println(s);
     }
}
