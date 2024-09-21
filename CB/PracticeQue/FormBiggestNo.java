import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;
public class FormBiggestNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String[] arr = new String[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.next();
            }
            Arrays.sort(arr, new Comparator<String>() {
                @Override
                public int compare(String a, String b) {
                    String s1 = a + b;
                    String s2 = b + a;
                    return s2.compareTo(s1);
                }
            });
            StringBuilder result = new StringBuilder();
            for (String s : arr) {
                result.append(s);
            }
            System.out.println(result);
        }
        sc.close();
    }
}
