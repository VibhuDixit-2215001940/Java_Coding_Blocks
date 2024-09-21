import java.util.Scanner;
import java.util.Arrays;
public class SwapLargestAndSmallestElementInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array:- ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int max=arr[0],min=arr[0],temp=0;
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        for(int i=0;i<n;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }
        temp = max;
        max = min;
        min = temp;
        // System.out.println("Updated array is: "+Arrays.toString(arr));
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
