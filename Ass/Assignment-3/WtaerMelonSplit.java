import java.util.Scanner;

public class WtaerMelonSplit {
    public static boolean isEven(int num) {
        boolean result = false;
        if (num == 2) {
            result = false;
        }
        if (num > 2) {
            result = (num % 2 == 0);
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputValue = scanner.nextInt();
        boolean isEvenValue = isEven(inputValue);
        if (isEvenValue == true) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
