public class CoinTossNoTwoH {
    public static void main(String[] args) {
        coinToss(3, "");
    }
    public static void coinToss(int n,String ans){
        if(n==0){
            System.out.println(ans);
            return ;
        }
        if(ans.length()==0 || ans.charAt(ans.length()-1)!='H') coinToss(n-1, ans+'H');
        coinToss(n-1, ans+'T');
    }
}
// HTH
// HTT
// THT
// TTH
// TTT