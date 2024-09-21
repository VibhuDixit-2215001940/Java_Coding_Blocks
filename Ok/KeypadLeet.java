import java.util.ArrayList;
import java.util.List;

public class KeypadLeet {
    static String[] key = {"","","abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    static List<String> ll = new ArrayList<String>();
    public static void main(String[] args) {
        String str = "2";
        List<String> list = letterCombinationss(str);
        System.out.println(list);
    }
    public static List<String> letterCombinationss(String str) {
        ok(str, "");
        return ll;
    }
    public static void ok(String str,String ans){
        if(str.isEmpty()){
            ll.add(ans);
            return ;
        }
        char x = str.charAt(0);
        String press = key[x - '0'];
        for(int i = 0; i < press.length(); i++){
            ok(str.substring(1),ans+press.charAt(i));
        }
    }
}
