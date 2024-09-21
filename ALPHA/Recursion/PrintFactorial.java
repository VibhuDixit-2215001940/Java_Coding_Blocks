import java.util.Scanner;

public class PrintFactorial {
    public static int printFact(int n){
        if(n>0){
            return n * printFact(n-1);
        }
        else{
            return 1;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = printFact(n);
        System.out.println(ans);
        sc.close();
    }
}
