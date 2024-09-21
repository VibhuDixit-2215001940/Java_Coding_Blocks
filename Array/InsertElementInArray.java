import java.util.Scanner;
import java.util.Arrays;
public class InsertElementInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array:- ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Array before insertion: "+Arrays.toString(arr));
        System.out.println("Enter the element to insert: ");
        int x = sc.nextInt();
        System.out.println("Enter the index at which insert: ");
        int y = sc.nextInt();
        for(int i=arr.length-1;i>=y;i--){
            arr[i+1] = arr[i];
            arr[y] = x;
        }
        System.out.println("Array after insertion: "+Arrays.toString(arr));
    }
}
