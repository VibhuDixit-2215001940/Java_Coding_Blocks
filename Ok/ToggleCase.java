import java.util.Scanner;

public class ToggleCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String res = toggleCase(str);
        System.out.println(res);
    }

    public static String toggleCase(String str) {
        char[] charArray = str.toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            char temp = charArray[i];
            if (Character.isLowerCase(temp)) {
                charArray[i] = Character.toUpperCase(temp);
            } else if (Character.isUpperCase(temp)) {
                charArray[i] = Character.toLowerCase(temp);
            }
        }

        return new String(charArray);
    }
}
