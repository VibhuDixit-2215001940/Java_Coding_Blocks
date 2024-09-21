import java.util.*;
public class SortBooks {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] arr = new char[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.next().charAt(0);
        }
        sortBooks(arr);
        for (char subject : arr) {
            System.out.print(subject + " ");
        }
    }
 public static void sortBooks(char[] arr) {
        int n = arr.length;
        int i = 0, j = 0, k = n - 1;
        while (j <= k) {
            switch (arr[j]) {
                case 'P':
                    swap(arr, i, j);
                    i++;
                    j++;
                    break;
                case 'C':
                    j++;
                    break;
                case 'M':
                    swap(arr, j, k);
                    k--;
                    break;
            }
        }
    }
    public static void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

   