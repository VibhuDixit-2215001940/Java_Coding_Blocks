import java.util.Arrays;
import java.util.Collections;

public class ReverseArrayUsingCollections {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        System.out.println("Input Array :" + Arrays.toString(array));//Input Array :[1, 2, 3, 4, 5]

        // Reversing the array using Collections.reverse() method.
        Collections.reverse(Arrays.asList(array));

        // Output
        System.out.println("Reversed Array :" + Arrays.toString(array));//Reversed Array :[5, 4, 3, 2, 1]
    }
}
