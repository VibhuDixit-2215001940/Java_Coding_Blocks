import java.util.Scanner;

public class AlexGoesShopping {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] e = new int[n];
        for (int i = 0; i < n; i++) {
            e[i] = sc.nextInt();
        }
        int tu = sc.nextInt();
        for (int i = 0; i < tu; i++) {
            int a = sc.nextInt();
            int ko = sc.nextInt();
            int c = 0;
            for (int j = 0; j < n; j++) {
                if (a % e[j] == 0) {
                    c++;
                }
            }
            if (c >= ko) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
        sc.close();
    }
}
