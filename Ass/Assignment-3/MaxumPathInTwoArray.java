import java.util.Scanner;

public class MaxumPathInTwoArray {
    public static void main(String args[]) {
        try (Scanner scanneri = new Scanner(System.in)) {
            long ti = scanneri.nextLong();
            while (ti-- > 0) {
                long ni = scanneri.nextLong();
                long mi = scanneri.nextLong();
                long[] ai = new long[(int) ni];
                long[] bi = new long[(int) mi];
                for (int i = 0; i < ni; i++) {
                    ai[i] = scanneri.nextLong();
                }
                for (int ii = 0; ii < mi; ii++) {
                    bi[ii] = scanneri.nextLong();
                }

                long ii = 0;
                long ji = 0;
                long wuyai = 0;
                long sunwukongi = 0;
                long huyai = 0;

                while (ii < ni && ji < mi) {
                    if (ai[(int) ii] < bi[(int) ji]) {
                        wuyai += ai[(int) ii++];
                    } else if (ai[(int) ii] > bi[(int) ji]) {
                        sunwukongi += bi[(int) ji++];
                    } else {
                        huyai += Math.max(wuyai, sunwukongi) + ai[(int) ii];
                        ii++;
                        ji++;
                        wuyai= 0;
                        sunwukongi = 0;
                    }
                }

                while (ii < ni) {
                    wuyai += ai[(int) ii++];
                }

                while (ji < mi) {
                    sunwukongi += bi[(int) ji++];
                }

                huyai += Math.max(wuyai, sunwukongi);
                System.out.println(huyai);
            }
        }
        
    }
}
