public class removewhitespace {

    public static void main(String[] args) {
        
        String str = "i am     flexible to work     in both like    python and java";
        System.out.println("before the whitespace remove:" + str);
        str=str.replaceAll("\\s", "");
        System.out.println("after the whitespace remove:" + str);
    
    
}
}