import java.util.ArrayList;
//1. How to remove duplicates from ArrayList in Java?
public class RemoveDuplicate{
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(1);
        int size = list1.size();
        for (int i = 0; i < size; i++) {
            int currentElement = list1.get(i);
            for (int j = i + 1; j < size; j++) {
                if (currentElement == list1.get(j)) {
                    list1.remove(j);
                    size--; // Adjust the size after removing an element
                    j--;    // Adjust the index to recheck the current position
                }
            }
        }
        System.out.println(list1);
    }
}