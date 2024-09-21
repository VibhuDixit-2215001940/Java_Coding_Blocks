import java.util.Scanner;

public class CountFreq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int[] fa = new int[256];
        for (int i = 0; i < str.length(); i++) {
            fa[str.charAt(i)]++;
        }
        int maxFrequency = 0;
        int maxFrequencyChar = -1;
        for (int i = 0; i < fa.length; i++) {
            if (fa[i] > maxFrequency) {
                maxFrequency = fa[i];
                maxFrequencyChar = i;
            }
        }
        System.out.print((char) maxFrequencyChar);
    }
}
