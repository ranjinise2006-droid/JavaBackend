public class countcharaccurance {

    public static void main(String[] args) {
        String s= " java programming language";

        int totalcount = s.length();
        int totalcount_afterRemove = s.replace("g", "").length();
        int count= totalcount-totalcount_afterRemove;
        System.out.println("number ocuurances of a is:"+ count);

    }
    
}
