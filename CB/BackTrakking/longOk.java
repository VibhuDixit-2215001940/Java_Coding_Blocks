import java.util.ArrayList;

public class longOk {
    public static void main(String[] args) {
        String str1 = "ezupkr";
        String str2 = "ubmrapg";
        System.out.println(longestCommonSubsequence(str1,str2));
    }
    public static int longestCommonSubsequence(String str1, String str2) {
        StringBuilder ok = new StringBuilder();
        int count = 0,flag = 0;
        for(int i=0;i<str1.length();i++){
            // ok.add(str1.charAt(i));
            for(int j=flag;j<str2.length();j++){
                if(str1.charAt(i)==str2.charAt(j)){
                    
                    count++;
                    flag = j;
                    break;
                }
            }
        }
        return count;
    }
}
