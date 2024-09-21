import java.util.Scanner;

public class StringDifference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        for (int i = 0; i < str.length() - 1; i++) {
            char currentChar = str.charAt(i);
            char nextChar = str.charAt(i + 1);
            System.out.print(currentChar + "" + ((int) (nextChar) - (int) (currentChar)));
        }
        System.out.print(str.charAt(str.length() - 1));
    }
    }
