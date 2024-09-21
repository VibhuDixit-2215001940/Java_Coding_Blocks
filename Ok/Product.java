import java.util.Arrays;
import java.util.Scanner;
public class Product{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] arr = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
        }
        sc.close();
        long[] brr = new long[n];
        int pro = 1;
        for(int j=0;j<n;j++){
            for(int i=0;i<n;i++){
                if(arr[j]!=arr[i]){
                    pro *= arr[i];
                    System.out.println(pro);
                }
            }
            brr[j] = pro;
            pro = 1;
        }
        System.out.println(Arrays.toString(brr));
    }
}