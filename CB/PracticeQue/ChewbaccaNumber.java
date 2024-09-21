import java.util.Scanner;
public class ChewbaccaNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long x = sc.nextLong();
        long result = getMinNo(x);
        System.out.println(result);
    }
    private static long getMinNo(long x) {
        char[] arr = Long.toString(x).toCharArray();
        for (int i = 0; i < arr.length; i++) {
            int digit = Character.getNumericValue(arr[i]);
            int inversion = 9 - digit;
            if (inversion < digit) {
                arr[i] = (char) (inversion + '0');
            }
        }
        if (arr[0] == '0') {
            arr[0] = '9';
        }
        return Long.parseLong(new String(arr));
    }
}
