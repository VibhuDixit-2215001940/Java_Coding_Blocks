import java.util.Scanner;

public class InverseOfAnArray{
    public static int[] inverse(int [] a){
       int[] b = new int[a.length];
       for(int i=0;i<b.length;i++){
        int v = a[i];
        b[v] = i;
       }
       return b;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int[] z = inverse(a);
        for (int i = 0; i < n; i++) {
            System.out.print(z[i] + " ");
        }
    }
}
// 5
// 2 3 1 0 4
// 3 2 0 1 4 