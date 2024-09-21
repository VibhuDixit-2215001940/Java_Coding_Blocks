import java.util.List;

public class LetterCombinations {
    static String[] map = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public static void main(String[] args) {
        String que = "23";
        Key(que,"");
    }
    public static void Key(String que,String ans){
        if(que.length() == 0){
            System.out.println(ans);
            return ;
        }
        char ch = que.charAt(0);
        String press = map[ch-'0'];
        for(int i=0;i<press.length();i++){
            Key(que.substring(1),ans+press.charAt(i));
        }
    }
    // public List<String> letterCombinations(String digits) {
        
    // }
}
// ad
// ae
// af
// bd
// be
// bf
// cd
// ce
// cf