import java.util.Scanner;
import java.util.Arrays;
public class TargetTripletsSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[100];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        Arrays.sort(a,0,n);
        int target = sc.nextInt();
        for(int i=0;i<n-2;i++){
            int b = i+1;
            int d = n-1;
            while(b<d){
                int c = a[i]+a[b]+a[d];
                if(c==target){
                    System.out.println(a[i]+","+a[b]+" and "+a[d]);
                    b++;
                    d--;
                }
                else if(c<target){
                    b++;
                }
                else{
                    d--;
                }
            }
        }
    }
}
