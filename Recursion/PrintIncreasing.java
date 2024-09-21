import java.util.Scanner;

public class PrintIncreasing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        PD(n);
    }
    public static void PD(int n){
        if(n==0) return ;
        PD(n-1);
        System.out.println(n);
    }
}
