import java.util.Arrays;
import java.util.Scanner;

public class TargetSumPair {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        Arrays.sort(a,0,n);
        int target = sc.nextInt();
        for(int i=0;i<n-2;i++){
            int b = n-1;
            while(i<b){
                int c = a[i]+a[b];
                if(c==target){
                    System.out.println(a[i]+" and "+a[b]);
                    b--;
                    i++;
                }
                else{
                    b--;
                }
            }
        }
    }
}
