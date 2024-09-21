import java.util.*;
public class MentalMath {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] arr = new int[t];
        for(int i=0;i<t;i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(maximumProduct(arr));
        sc.close();
    }
    public static int maximumProduct(int[] arr){
        int n = arr.length;
        return arr[n-1]*arr[n-2]*arr[n-3];
    }
}
// import java.util.Arrays;
// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         int N = scanner.nextInt();
//         int[] A = new int[N];
//         for (int i = 0; i < N; i++) {
//             A[i] = scanner.nextInt();
//         }
//         int maxProduct = findMaxProduct(A);
//         System.out.println(maxProduct);
//     }
//     public static int findMaxProduct(int[] arr) {
//         int n = arr.length;
//         Arrays.sort(arr);
//         int product1 = arr[n - 1] * arr[n - 2] * arr[n - 3];
//         int product2 = arr[0] * arr[1] * arr[n - 1];
//         return Math.max(product1, product2);
//     }
// }
