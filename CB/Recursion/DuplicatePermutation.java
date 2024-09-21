public class DuplicatePermutation {
    public static void main(String[] args) {
        String str = "ABCA";
        Print(str,"");
    }
    public static void Print(String str,String ans){
        if(str.length() == 0){
            System.out.println(ans);
            return;
        }
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            boolean val = false;
            for(int j=i+1;j<str.length();j++){
                if(str.charAt(j) == ch){
                    val= true;
                    break;
                }
            }
            if(val == false){
                String s1 = str.substring(0, i);
                String s2 = str.substring(i+1);
                Print(s1+s2, ans+ch);
            }
        }
    }
}
