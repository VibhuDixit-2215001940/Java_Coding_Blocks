import java.util.ArrayList;

public class SizeOfArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(-1);
        System.out.println(list1);//[1, 2, 3, -1]
        System.out.println(list1.size());//4
    }
}
