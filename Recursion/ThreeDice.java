public class ThreeDice {
    public static void main(String[] args) {
        ok(4,0,"");
    }
    public static void ok(int n,int curr,String ans){
        if(curr>n) return ;
        if(curr==n){
            System.out.println(ans);
            return ;
        }
        ok(n,curr+1,ans+'1');
        ok(n,curr+2,ans+'2');
        ok(n,curr+3,ans+'3');
    }
}
// 1111
// 112
// 121
// 13
// 211
// 22
// 31