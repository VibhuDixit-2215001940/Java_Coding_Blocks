//Given an m x n integer matrix matrix, if an element is 0, set its entire row and column to 0's, and return the matrix.
// You must do it in place.

import java.util.Arrays;
import java.util.Scanner;

public class SetMatrixZeros {
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
        int pos = 0,cos = 0;
        for(int i=0;i<n;i++){                       //PICKING ROW OR COLUMN HAVING ZEROS
            for(int j=0;j<n;j++){
                if(arr[i][j]==0){
                    pos = i;cos = j;
                    zeros(arr,pos,cos);
                    break;
                }
            }
        }
    }
    public static void zeros(int[][] arr,int p,int c){      //PUTTING ZEROS
        for(int i=0;i<arr.length;i++){
            arr[p][i] = 0;
        }
        for(int i=0;i<arr.length;i++){
            arr[i][c] = 0;
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
// Input: matrix = [[1,1,1],[1,0,1],[1,1,1]]
// Output: [[1,0,1],[0,0,0],[1,0,1]]