import java.util.Scanner;
import java.util.Arrays;
public class SumOfTwoArray_StoreItInThirdArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of 1st array:- ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter the size of 2nd array:- ");
        int m = sc.nextInt();
        int arr2[] = new int[m];
        for(int i=0;i<m;i++){
            arr2[i]=sc.nextInt();
        }
        int arr3[] = new int[m];
        for(int i=0;i<m;i++){
            arr3[i] = arr[i] + arr2[i];
        }
        System.out.println("Sum of 2 arrays are: "+Arrays.toString(arr3));//[2, 4, 6, 8, 10]
    }
}
