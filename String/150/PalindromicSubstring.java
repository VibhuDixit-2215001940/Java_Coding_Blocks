import java.util.Scanner;

public class PalindromicSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int count = 0;
        count += str.length();
        for (int i = 0; i < str.length(); i++) {
            int li = i - 1;
            int ri = i + 1;
            while (li >= 0 && ri < str.length() && str.charAt(li) == str.charAt(ri)) {
                count++;
                li--;
                ri++;
            }
            li = i;
            ri = i + 1;
            while (li >= 0 && ri < str.length() && str.charAt(li) == str.charAt(ri)) {
                count++;
                li--;
                ri++;
            }
        }
        System.out.print(count);
    }
}
