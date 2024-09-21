import java.util.Scanner;
public class MoveAllZeroAtTheEnd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        moveZerosToEnd(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
    private static void moveZerosToEnd(int[] array) {
        int nonZeroPointer = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                int temp = array[i];
                array[i] = array[nonZeroPointer];
                array[nonZeroPointer] = temp;
                nonZeroPointer++;
            }
        }
    }
}
