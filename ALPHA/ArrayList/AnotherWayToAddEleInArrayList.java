import java.util.ArrayList;
public class AnotherWayToAddEleInArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        list1.add(1);//O(1)
        list1.add(2);
        list1.add(3);
        list1.add(-1);
        list1.add(0,9);//O(n)
        //It doesn't delete that v=index value if already exist but increase that index by pushing forward every ele.
        System.out.println(list1);//[9, 1, 2, 3, -1]
    }
}
