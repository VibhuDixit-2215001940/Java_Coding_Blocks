import java.util.Arrays;
public class ReverseArrayUsingArrays{
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        System.out.println("Input Array :" + Arrays.toString(array));
        for(int i = 0; i < array.length / 2; i++) {
            // Swapping the elements
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
        System.out.println("Reversed Array :" + Arrays.toString(array));
        // Input Array :[1, 2, 3, 4, 5]
        // Reversed Array :[5, 4, 3, 2, 1]
    }
}
