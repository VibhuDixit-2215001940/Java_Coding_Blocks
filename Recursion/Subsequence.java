public class Subsequence{
    public static void main(String[] args) {
        subseq("abc", "");
    }
    public static void subseq(String que,String ans){
        if(que.length()==0){
            System.out.println(ans);
            return ;
        }
        char ch = que.charAt(0);
        subseq(que.substring(1),ans);
        subseq(que.substring(1),ans+ch);
    }
}
// 
// c
// b
// bc
// a
// ac
// ab
// abc