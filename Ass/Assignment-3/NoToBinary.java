import java.util.Scanner;
// Only for positive no. with less range
public class NoToBinary {
    public static void main(String[] args) {
        int sum = 0,rem = 0,mul = 1;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n>0){
            rem = n % 2;
            sum = sum + rem * mul;
            n = n / 2;
            mul = mul * 10;
        }
        System.out.println(sum);
    }
}
