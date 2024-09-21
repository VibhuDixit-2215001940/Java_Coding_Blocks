import java.util.ArrayList;

public class RemoveElementInArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(-1);
        System.out.println(list1);
        list1.remove(2);
        //list.remove(index) is used to remove ele of that specific index
        //O(n) time complexity is needed as a loop is used to iterate  the index value to remove.
        System.out.println(list1);
    }
}
