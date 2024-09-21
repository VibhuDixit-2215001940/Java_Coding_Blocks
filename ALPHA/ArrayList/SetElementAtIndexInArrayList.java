import java.util.ArrayList;

public class SetElementAtIndexInArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(-1);
        System.out.println(list1);//[1, 2, 3, -1]
        list1.set(0, 10);
        //O(n) time complexity is needed as a loop is used to iterate  the index value to remove.
        System.out.println(list1);//[10, 2, 3, -1]
    }
}
