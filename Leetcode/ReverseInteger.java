import java.util.Scanner;

public class ReverseInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = reverse(n);
        System.out.println(x);
        sc.close();
    }
    public static int reverse(int x) {
        long sum = 0;
        int num = x;
        if(x<0){
            num = (-1) * num;
        }
        while(num > 0){
        long rem = x % 10;
        sum = sum*10 + rem;
        x = x/10;
        num = num /10;
        }
        if(sum > Math.pow(2,31) || sum < Math.pow(-2,31)){
            return 0;
        }
        return (int)sum;
    }
}
