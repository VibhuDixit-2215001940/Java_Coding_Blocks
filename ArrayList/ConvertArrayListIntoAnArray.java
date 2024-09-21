import java.util.ArrayList;
import java.util.Arrays;
//In Java, the initial size of an ArrayList is 10
public class ConvertArrayListIntoAnArray {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Apple");
        arrayList.add("Banana");
        arrayList.add("Orange");
        String[] array = new String[arrayList.size()];// Create a new array and use toArray method
        array = arrayList.toArray(array);
        System.out.println(Arrays.toString(array));
    }
}
