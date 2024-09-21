import java.util.Scanner;

public class Factorial{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fact(n));
        System.out.println(fact1(n,1));
    }
    public static int fact(int n){
        if(n==1) return 1;
        return fact(n-1)*n;
    }
    public static int fact1(int n,int ans){ //TAIL RECURSION AS WHEN STACK IS DECREASING NO OPERATION IS MADE
        if(n==1) return ans;
        return fact1(n-1,ans*n);
    }
}