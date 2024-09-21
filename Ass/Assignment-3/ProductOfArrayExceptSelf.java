import java.util.Scanner;

public class ProductOfArrayExceptSelf {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
        }
        
        long[] b = new long[n];
        long c = 1;
        for (int i = 0; i < n; i++) {
            b[i] = c;
            c *= a[i];
        }
        long d = 1;
        for (int i = n - 1; i >= 0; i--) {
            b[i] *= d;
            d *= a[i];
        }
        for(int i=0;i<n;i++){
            System.out.print(b[i]+" ");
        }
    }
}
