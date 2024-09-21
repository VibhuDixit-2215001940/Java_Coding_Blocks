import java.util.Scanner;

public class RecursionTwins {
    static int k = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        ok(str,0);
        System.out.println(k);
    }
    public static void ok(String str,int i){
        if(i>=str.length()-2){
            return ;
        }
        if(str.charAt(i) == str.charAt(i+2)){
            k++;
            ok(str,i+1);
        }
        else{
            ok(str,i+1);
        }
    }
}
