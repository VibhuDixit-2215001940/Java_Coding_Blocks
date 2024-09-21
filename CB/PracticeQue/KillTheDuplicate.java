import java.util.Scanner;
public class KillTheDuplicate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] arr = new int[t];
        for (int i = 0; i < t; i++) {
            arr[i] = sc.nextInt();
        }
        int le = removeDuplicates(arr);
        for (int i = 0; i < le; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    private static int removeDuplicates(int[] arr) {
        if (arr.length == 0) {
            return 0;
        }
        int uniqueIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[uniqueIndex]) {
                uniqueIndex++;
                arr[uniqueIndex] = arr[i];
            }
        }
        return uniqueIndex + 1;
    }
}
