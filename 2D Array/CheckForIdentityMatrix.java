import java.util.Scanner;

public class CheckForIdentityMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j] = sc.nextInt();
            }
        }int flag = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j && arr[i][j]==1){flag++;}
            }
        }
        if(flag==n){System.out.println("YES!!");}
        else{System.out.println("NO!!");}
    }
}
