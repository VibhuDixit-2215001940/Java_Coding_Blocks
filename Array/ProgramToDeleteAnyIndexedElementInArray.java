import java.util.Scanner;
import java.util.Arrays;
public class ProgramToDeleteAnyIndexedElementInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array:- ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter index to delete:- ");
        int x = sc.nextInt();
        for(int i=x;i<n-1;i++){
            arr[i] = arr[i+1];
        }
        arr[n-1]=0;
        System.out.println("Updated array is: "+Arrays.toString(arr));
    }
}
