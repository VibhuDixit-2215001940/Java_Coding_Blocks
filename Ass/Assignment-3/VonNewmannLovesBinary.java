import java.util.Scanner;

public class VonNewmannLovesBinary {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        scanner.nextLine(); 

        for (int i = 0; i < n; i++) {
            String ghjk = scanner.nextLine();
            int mnbv = 0;
            for (int j = 0; j < ghjk.length(); j++) {
                char qwer = ghjk.charAt(j);
                mnbv = mnbv * 2 + (qwer - '0');
            }
            System.out.println(mnbv);
        }
    }
}
