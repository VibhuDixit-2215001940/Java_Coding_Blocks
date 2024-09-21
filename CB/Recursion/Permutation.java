// import java.util.HashSet;

public class Permutation {
    public static void main(String[] args) {
        String str = "ABCA";
        Print(str,"");
    }
    public static void Print(String str,String ans){
        // HashSet<String> ok = new HashSet<>();
            if(str.length() == 0){
                // ok.add(ans);
            System.out.println(ans);
            return;
        }
        for(int i=0;i<str.length();i++){
            String s1 = str.substring(0, i);
            String s2 = str.substring(i+1);
            Print(s1+s2, ans+str.charAt(i));
        }
        
    }
}
