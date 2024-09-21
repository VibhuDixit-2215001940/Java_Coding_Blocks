import java.util.Scanner;

public class BlessingOfLordShiva {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int t = 0; t < T; t++) {
            String s = sc.next();
            int result = minCharactersToAlternate(s);
            System.out.println(result);
        }
    }
    private static int minCharactersToAlternate(String s) {
        int countAStart = 0; // Count of characters to be flipped if string starts with 'a'
        int countBStart = 0; // Count of characters to be flipped if string starts with 'b'
        for (int i = 0; i < s.length(); i++) {// Check for both cases: string starting with 'a' and 'b'
            if (i % 2 == 0) {
                if (s.charAt(i) != 'a') {// Even index, expecting 'a'
                    countAStart++;
                } else {
                    countBStart++;
                }
            } else {// Odd index, expecting 'b'
                if (s.charAt(i) != 'b') {
                    countAStart++;
                } else {
                    countBStart++;
                }
            }
        }
        return Math.min(countAStart, countBStart);
    }
}
