import java.util.Arrays;

public class RemoveAllZeros {
    public static void main(String[] args) {
        int[] array = {0, 5, 6, 0, 0, 2, 5};
        int len = 0;
        for (int i=0; i<array.length; i++){
            if (array[i] != 0)
                len++;
        }
        int [] newArray = new int[len];
        for (int i=0, j=0; i<array.length; i++){
            if (array[i] != 0) {
                newArray[j] = array[i];
                j++;
            }
        }
        System.out.println(Arrays.toString(newArray));
    }
}
