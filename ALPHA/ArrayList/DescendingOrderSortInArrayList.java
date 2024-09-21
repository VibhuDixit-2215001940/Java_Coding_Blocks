import java.util.ArrayList;
import java.util.Collections;
public class DescendingOrderSortInArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(-1);
        System.out.println(list1);//[1, 2, 3, -1]
        Collections.sort(list1);
        System.out.println(list1);//[-1, 1, 2, 3]
        Collections.sort(list1, Collections.reverseOrder());
        System.out.println(list1);//[3, 2, 1, -1]
    }
}
