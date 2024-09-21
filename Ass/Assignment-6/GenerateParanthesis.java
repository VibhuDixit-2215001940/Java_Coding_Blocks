import java.util.Scanner;

public class GenerateParanthesis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ok("(",1,0,n);
    }
    public static void ok(String str,int o,int c,int n){
        if(str.length()==2*n){
            System.out.println(str);
            return ;
        }
        if(c<o) ok(str+")",o,c+1,n);
        if(o<n) ok(str+"(",o+1,c,n);
    }
}
