public class SubSequence {
    public static void main(String[] args) {
        String str = "abcd";
        sub(str,"");
    }
    public static void sub(String str,String ans){
        if(str.length()==0){
            System.out.println(ans);
            return;
        }
        char ch = str.charAt(0);
        sub(str.substring(1),ans);
        sub(str.substring(1),ans+ch);
    }
}
