import java.util.ArrayList;
public class PrintReverseOfArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(-1);
        System.out.println(list1);//[1, 2, 3, -1]
        for (int i = list1.size()-1; i >= 0; i--) {
            System.out.print(list1.get(i)+",");
        }
    }
}
