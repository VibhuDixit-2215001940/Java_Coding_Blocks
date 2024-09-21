import java.util.ArrayList;

public class ClearAllEleInArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(-1);
        System.out.println(list1);
        list1.clear();
        System.out.println(list1);
    }
}
