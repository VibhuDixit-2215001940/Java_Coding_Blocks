import java.util.ArrayList;

public class ContainsElementInArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(-1);
        // System.out.println(list1);//[1, 2, 3, -1]
        // //O(n) time complexity is needed as a loop is used to iterate  the index value to search.
        // System.out.println(list1.contains(1));//true
        //It returns boolean vaue.
        System.out.println(list1.size());
    }
}
