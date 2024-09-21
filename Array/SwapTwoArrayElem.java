import java.util.Scanner;
import java.util.Arrays;
public class SwapTwoArrayElem{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array:- ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        int arr1[] = new int[n];
        System.out.print("Enter ele of 1st array: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter ele of 2nd array: ");
        for(int i=0;i<n;i++){
            arr1[i]=sc.nextInt();
        }
        System.out.println("Arrays before swap: ");
        System.out.println("ARRAY 1: "+Arrays.toString(arr));
        System.out.println("ARRAY 2: "+Arrays.toString(arr1));
        Swap(arr, arr1);
        System.out.println("ARRAY 1: "+Arrays.toString(arr));
        System.out.println("ARRAY 2: "+Arrays.toString(arr1));
    }
    public static void Swap(int[] arr1, int[] arr2) {
		int[] temp = arr1;
		arr1 = arr2;
		arr2 = temp;
	}
}