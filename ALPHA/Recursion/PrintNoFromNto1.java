import java.util.Scanner;

public class PrintNoFromNto1 {
    public static void printDecreasing(int n){
        if(n==1){               //BASE CONDITION
            System.out.print(n);
            return ;
        }
        System.out.print(n+" ");
        printDecreasing(n-1);           //RECURSIVE F()
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printDecreasing(n);
        sc.close();
    }
}
