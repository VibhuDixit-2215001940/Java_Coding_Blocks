//Given an integer numRows, return the first numRows of Pascal's triangle.
// In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:

public class PascalTriangle {
    public static void main(String[] args) {
            int numRows = 5;
            PascalTriangle pascalTriangle = new PascalTriangle();
            int[][] result = pascalTriangle.generate(numRows);
    
            // Print the result
            for (int i = 0; i < numRows; i++) {
                for (int j = 0; j <= i; j++) {
                    System.out.print(result[i][j] + " ");
                }
                System.out.println();
            }
        }
        public int[][] generate(int numRows) {
            int[][] triangle = new int[numRows][];
            
            for (int i = 0; i < numRows; i++) {
                triangle[i] = new int[i + 1];
                triangle[i][0] = 1;
                triangle[i][i] = 1;
                
                for (int j = 1; j < i; j++) {
                    triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j];
                }
            }
            
            return triangle;
        }
    }
// Example 1:

// Input: numRows = 5
// Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
// Example 2:

// Input: numRows = 1
// Output: [[1]]