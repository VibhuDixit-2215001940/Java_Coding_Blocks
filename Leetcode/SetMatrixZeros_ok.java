import java.util.Scanner;

public class SetMatrixZeros_ok {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int n = sc.nextInt();
        int[][] arr = new int[n][n];
        for(int i=0;i<n;i++){                       //TAKING INPUT 
            for(int j=0;j<n;j++){
                arr[i][j] = sc.nextInt();
            }
        }
        setZeroes(arr);
    }
    public static void setZeroes(int[][] matrix) {
        boolean f1 = false,f2 = false;
        int n = matrix.length,m = matrix[0].length;
        for(int i=0;i<n;i++){                   //FINDING ZERO IN FIRST COLUMN
            if(matrix[i][0]==0){
                f1 = true;
            }
        }
        for(int j=0;j<m;j++){                   ////FINDING ZERO IN FIRST ROW
            if(matrix[0][j]==0){
                f2 = true;
            }
        }
        for(int i=1;i<n;i++){
            for(int j=1;j<m;j++){
                if(matrix[i][j]==0){
                    matrix[i][0] = matrix[0][j] = 0;
                }
            }
        }
        for(int i=1;i<n;i++){
            for(int j=1;j<m;j++){
                if(matrix[i][0]==0 || matrix[0][j]==0){
                    matrix[i][j] = 0;
                }
            }
        }
        if(f1){                                 //MAKING WHOLE COLUMN ZERO
            for(int i=0;i<n;i++){
                matrix[i][0] = 0;
            }
        }
        if(f2){                                 //MAKING WHOLE ROW ZERO
            for(int j=0;j<m;j++){
                matrix[0][j] = 0;
            }
        }
        for(int i=0;i<matrix.length;i++){                   //PRINTING MATRIX
            for(int j=0;j<matrix.length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
