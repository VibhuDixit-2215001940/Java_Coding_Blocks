import java.util.Scanner;

public class PowerFunction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println(pow(n,m));
        System.out.println(pow1(n,m,1));
    }
    public static int pow(int n,int m){
        if(m==0){
            return 1;
        }
        return pow(n,m-1)*n;
    }
    public static int pow1(int n,int m,int ans){//TAIL RECURSION AS WHEN STACK IS DECREASING NO OPERATION IS MADE
        if(m==0){
            return ans;
        }
        return pow1(n,m-1,ans*n);
    }
}
