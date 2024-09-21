import java.util.Scanner;

public class HelpRamu {
     public static int min(int a, int b, int c) {
        if (a <= b && a <= c)
            return a;
        else if (b <= a && b <= c)
            return b;
        else
            return c;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int q = 1; q <= n; q++) {
            int c1 = sc.nextInt(), c2 = sc.nextInt(), c3 = sc.nextInt(), c4 = sc.nextInt();
            int r = sc.nextInt(), cn = sc.nextInt();
            int[] numr = new int[r], numc = new int[cn];
            int totalrick = 0, totalcab = 0;
            for (int i = 1; i <= r; i++) {
                numr[i - 1] = sc.nextInt();
                totalrick += numr[i - 1];}
            for (int i = 1; i <= cn; i++) {
                numc[i - 1] = sc.nextInt();
                totalcab += numc[i - 1];}
            int i = 0;
            int ric = 0;  
            while (i < r) {               
                int rickshaw_sum = c1 * numr[i];
                if (rickshaw_sum > c2) {
                    ric += c2;} else {ric += rickshaw_sum;}i++;}
            i = 0;
            int c = 0;    
            while (i < cn) {    
                int cab_sum = c1 * numc[i];
                if (cab_sum > c2){c += c2;} else {c += cab_sum;}i++;}
            int rickshaw = min(c3, ric, c1 * totalrick);
            int cab = min(c3, c, c1 * totalcab);
            System.out.println(min(rickshaw + cab, c4, Integer.MAX_VALUE));
        }
    }
}