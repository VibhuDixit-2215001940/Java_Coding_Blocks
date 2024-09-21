import java.util.Arrays;
import java.util.Scanner;

public class PairOfRoses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i=0;i<T;i++){           //TEST CASES
            int n = sc.nextInt();
            int[] a = new int[n];
            for(int p=0;p<n;p++){       //TAKING INPUT
                a[p]=sc.nextInt();
            }
            Arrays.sort(a,0,n);
            int money = sc.nextInt();
            for(int j=0;i<n-2;j++){
                int b = n-1;
                while(j<b){
                    int c = a[j]+a[b];
                    if(c==money){
                        System.out.println("Deepak should buy roses whose prices are "+a[j]+" and "+a[b]+".");
                        b--;
                        j++;
                    }
                    else{
                        b--;
                    }
                }
            }
        }
    }
}
