public class GenerateParenthesis {
    public static void main(String[] args) {
        ok(0,0,"",3);
    }
    public static void ok(int o,int c,String ans,int n){
        if(ans.length()==2*n){
            System.out.println(ans);
            return ;
        }
        if(o<n) ok(o+1,c,ans+'(',n);
        if(c<o) ok(o,c+1,ans+')', n);
    }
}
// ((()))
// (()())
// (())()
// ()(())
// ()()()