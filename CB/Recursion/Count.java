public class Count {
    public static void main(String[] args) {
        int n = 3;
        System.out.println(count(n,""));
    }
    public static int count(int n,String ans){
        int cou = 0;
        if(n==0){
            // System.out.println(ans);
            return 1;
        }
        if(ans.length()==0 || ans.charAt(ans.length()-1) != 'H'){
            cou = count(n-1,ans+'H');
        }
        int flag = count(n-1,ans+'T');
        return cou + flag;
    }
}
