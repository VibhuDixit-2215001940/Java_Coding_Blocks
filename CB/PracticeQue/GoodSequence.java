// import java.util.Scanner;
// public class GoodSequence {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);        
//         int n = sc.nextInt();
//         int[] arr = new int[n];
//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }
//         sc.close();
//         check(arr);
//     }
//     private static void check(int[] arr){
//         int n = arr.length;
//         int count = 0;
//         for(int i=0;i<n-1;i++){
//             if(arr[i]>arr[i+1]){
//                 int temp = arr[i+1];
//                 if((temp-1)>0){
//                     count++;
//                 }
//             }
//         }
//         if(count<=1){
//             if(arr[n-1]>arr[n-2]){
//             System.out.println("true");}
//         }
//         else{
//             System.out.println("false");
//         }
//     }
// }
import java.util.Scanner;
public class GoodSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(canBeGoodSequence(arr));
    }
    private static boolean canBeGoodSequence(int[] ok) {
        int count = 0;
        for (int i = 0; i < ok.length - 1; i++) {
            if (ok[i] > ok[i + 1]) {
                count++;
                if (count > 1) {
                    return false;}
                if (i > 0 && ok[i - 1] > ok[i + 1]) {
                    ok[i + 1] = ok[i];}else {
                    ok[i] = ok[i + 1];}}}return true;}}
