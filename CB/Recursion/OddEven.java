import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        odd(N,N);
        sc.close();
    }
    public static void odd(int n,int temp){
        if (n == 0 || n>temp) {
            return;
        }
        if(n!=1){
            if(n%2!=0) {
                System.out.println(n);
                odd(n-2,temp);
            }
            else{
                System.out.println(n);
                odd(n+2,temp);
            }
        }
        else{
            System.out.println(n);
            odd(n+1,temp);
        }
    }
}
