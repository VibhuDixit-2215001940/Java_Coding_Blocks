import java.util.Arrays;
import java.util.Scanner;

public class FndFactorialOfLargestNoInAnArray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr,0,n);
        int lar = arr[n-1];
        int temp = lar;
        int sum = 1;
        for(int i=0;i<lar;i++){
            sum*=temp;
            temp--;
        }
        System.out.println(sum);
    }
}