import java.util.Scanner;

public class RotateArray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        Rotate(arr,m);
        // System.out.println(z);
    }
    public static void Rotate(int[] arr,int m){
        int i = 0,j = m;
        while(i < j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;j--;
        }
         for(int z=0;z<arr.length;z++){
            System.out.print(arr[i]+" ");
         }
    }
}