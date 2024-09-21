import java.util.Scanner;

public class CanYouReadThis{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String[] words = extract(str);
        for (String i : words) {
            System.out.println(i);
        }
        sc.close();
    }
    private static String[] extract(String s) {
        String[] words = s.split("(?=[A-Z])");
        return words;
    }
}
// Sample Input
// IAmACompetitiveProgrammer

// Sample Output
// I
// Am
// A
// Competitive
// Programmer