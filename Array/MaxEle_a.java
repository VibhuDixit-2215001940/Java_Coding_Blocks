import java.util.Scanner;

public class MaxEle_a{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(Maxx(arr));
    }
    public static int Maxx(int[] arr){
        int m = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            m = Math.max(arr[i],m);
        }
        return m;
    }
}
