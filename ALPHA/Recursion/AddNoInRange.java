import java.util.Scanner;

public class AddNoInRange {
    public static int addRange(int start,int end){
        if(end>start){
            return end + addRange(start,end-1);
        }
        else{
            return end;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int ans = addRange(n,m);
        System.out.println(ans);
        sc.close();
    }
}
