import java.util.ArrayList;

public class MoreMethodsInArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(-1);
        System.out.println(list1);//[1, 2, 3, -1]

        //isEmpty?()        Returns true if this list contains no elements.
        System.out.println(list1.isEmpty());//false

        //trimToSize()   This method is used to trim the capacity of the instance of the ArrayList to the list’s current size.
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        // list2 = list1.trimToSize();
        System.out.println(list1);
    }
}
