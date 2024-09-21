import java.util.Scanner;

public class FindMissingNoInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int sum = ((n+1)*(n+2))/2;
        for(int i=0;i<n;i++){
            sum-=arr[i];
        }
        System.out.println(sum);
    }
}
