import java.util.Scanner;

public class CountPrimeNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = countPrimes(n);
        System.out.println(ans);
    }
    public static int countPrimes(int n) {
        int flag=0;
        for(int k=2;k<n;k++){
            int count = 0;
            for(int i=2;i<n;i++){
                if(k%i==0){
                    count++;
                }
            }
            if(count==1){
                flag++;
                // System.out.println(k);
            }
        }
        return flag;
    }
}
