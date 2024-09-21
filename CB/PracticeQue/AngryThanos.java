import java.util.Scanner;
public class AngryThanos {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] arr = new int[t];
        for (int i = 0; i < t; i++) {
            arr[i] = sc.nextInt();
        }
        int uniqueIndex = 0;
        for (int i = 1; i < t; i++) {
            if (arr[i] != arr[uniqueIndex] || (uniqueIndex > 0 && arr[i] != arr[uniqueIndex - 1])) {
                uniqueIndex++;
                arr[uniqueIndex] = arr[i];
            }
        }
        for (int i = 0; i <= uniqueIndex; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}