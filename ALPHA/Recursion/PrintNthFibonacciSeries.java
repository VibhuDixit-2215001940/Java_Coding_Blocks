import java.util.Scanner;

public class PrintNthFibonacciSeries {
    public static int fib(int n){
        if(n==0 || n==1){
            return n;
        }
        int fnm1 = fib(n-1);//1
        int fnm2 = fib(n-2);//2
        int fn = fnm1 + fnm2;
        return fn;
    }
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = fib(n);
        System.out.println(ans);
        sc.close();
    }
}
