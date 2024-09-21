//2. How to reverse ArrayList in Java?

import java.util.ArrayList;
import java.util.Collections;

public class ReverseAnArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(1);
        Collections.reverse(list1);
        System.out.println(list1);//[1, 3, 2, 1]
    }
}
