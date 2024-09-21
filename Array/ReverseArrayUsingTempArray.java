import java.util.Arrays;

public class ReverseArrayUsingTempArray {
     public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        System.out.println("Input Array :" + Arrays.toString(array));//Input Array :[1, 2, 3, 4, 5]

        // Declaring variables for array reversal
        int n = array.length;
        int[] temp = new int[n];

        // Reversal of array using Temporary variable
        for(int i = n - 1; i > -1; i--) {
            // Storing the elements of the input array in reverse order
            temp[n - i - 1] = array[i];
        }

        // Output
        System.out.println("Reversed Array :" + Arrays.toString(temp));//Reversed Array :[5, 4, 3, 2, 1]
    }
}
