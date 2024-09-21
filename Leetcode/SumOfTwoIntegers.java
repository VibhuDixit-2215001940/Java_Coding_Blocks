import java.util.Scanner;

public class SumOfTwoIntegers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(getSum(a,b));

    }
    public static int getSum(int a, int b) {
        if(b==0) return a;
        if(b<0)
            return getSum(--a,++b);
        else
            return getSum(++a,--b);
    }
}
