import java.util.Arrays;
import java.util.Scanner;

public class StringCompression {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();    
        String compressedString = compressString(input);      
        System.out.println(compressedString);
    }
    public static String compressString(String input) {
        if (input == null || input.length() <= 1) {
            return input;
        }
        StringBuilder compressed = new StringBuilder();
        int count = 1;
        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) == input.charAt(i - 1)) {
                count++;
            } else {
                compressed.append(input.charAt(i - 1));
                if (count > 1) {
                    compressed.append(count);
                }
                count = 1;
            }
        }
        compressed.append(input.charAt(input.length() - 1));
        if (count > 1) {
            compressed.append(count);
        }
        return compressed.toString();
    }
}
