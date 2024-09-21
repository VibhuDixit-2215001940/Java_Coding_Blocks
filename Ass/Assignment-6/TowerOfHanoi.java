import java.util.Scanner;

public class TowerOfHanoi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ok(n,"A","B","C");
    }
    public static void ok(int n,String src,String helper,String dest){
        if(n==1){
            System.out.println("Moving from "+src+" to "+dest);
            return ;
        }
        ok(n-1,src,dest,helper);
        System.out.println("Moving from "+src+" to "+dest);
        ok(n-1,helper,dest,src);
    }
}
