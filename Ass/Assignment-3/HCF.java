import java.util.Scanner;
public class HCF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();//Dividend
        int b = sc.nextInt();//Divisor
        int rem;
        while(a%b!=0){
            rem = a % b;
            a = b;
            b = rem;
        }
        System.out.println(b);
    }
}