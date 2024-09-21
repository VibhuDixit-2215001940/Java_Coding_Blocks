import java.util.Scanner;

public class StringOddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String ok = "";
        for (int i = 0; i < str.length(); i++) {
            if (i % 2 == 0) {
                ok = ok + (char) (str.charAt(i) + 1);
            } else {
                ok = ok + (char) (str.charAt(i) - 1);
            }
        }
        System.out.print(ok);
    }
}
