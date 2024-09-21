import java.math.BigInteger;
import java.util.Scanner;

public class DivideTwoIntegers {
    public static int divide(int dividend, int divisor) {
        if(dividend==-2147483648 && divisor ==-1) return Integer.MAX_VALUE;
       BigInteger divden = new BigInteger(Integer.toString(dividend));
       BigInteger divsor = new BigInteger(Integer.toString(divisor));
       BigInteger ans = divden.divide(divsor);
       int res = ans.intValue();
       return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dividend = sc.nextInt();
        int divisor = sc.nextInt();
        System.out.println(divide(dividend,divisor));
    }
}