import java.util.ArrayList;
public class SwapTwoNo {
    public static void main(String[] args) {
        int index = 1,index1 = 2;
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(-1);
        System.out.println(list1);//[1, 2, 3, -1] 
        int temp = list1.get(index);
        list1.set(index,list1.get(index1));
        list1.set(index1,temp);
        System.out.println(list1);//[1, 3, 2, -1]
    }
}
