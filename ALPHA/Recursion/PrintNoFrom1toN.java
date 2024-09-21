import java.util.Scanner;

public class PrintNoFrom1toN {
    public static void printIncreasing(int n){
        if(n==1){
            System.out.print(n);
            return ;
        }
        printIncreasing(n-1);
        System.out.print(n+" ");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printIncreasing(n);
        sc.close();
    }
}
