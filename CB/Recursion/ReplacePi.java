import java.util.Scanner;
public class ReplacePi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine(); // Consume newline       
        String[] str = new String[N];
        for (int i = 0; i < N; i++) {
            str[i] = sc.nextLine();
        }        
        for (String i : str) {
            String replaced = replacePi(i);
            System.out.println(replaced);
        }
    }
    public static String replacePi(String str) {
        if (str.length() <= 1) {
            return str;
        }
        if (str.startsWith("pi")) {
            return "3.14" + replacePi(str.substring(2));
        } else {
            return str.charAt(0) + replacePi(str.substring(1));
        }
    }
}
