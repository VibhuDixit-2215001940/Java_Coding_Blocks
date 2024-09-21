import java.util.Scanner;

public class SumOfRows_Columns_Diagonal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int rows=0,column=0,diag=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                rows += arr[i][j];
                column += arr[j][i];
                if(i==j){
                    diag += arr[i][j];
                }
            }
        }
        System.out.println(rows);
        System.out.println(column);
        System.out.println(diag);
    }
}
