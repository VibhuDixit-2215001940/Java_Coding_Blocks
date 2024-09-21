import java.util.Scanner;

public class AddNoUptoN {
    public static int add(int n){
        if(n>0){
            return n + add(n-1);
        }
        else{
            return 0;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = add(n);
        System.out.println(ans);
        sc.close();
    }
}
