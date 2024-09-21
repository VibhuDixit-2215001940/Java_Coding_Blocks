import java.util.ArrayList;

public class AddElementsInArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(-1);
        System.out.println(list1);//[1, 2, 3, -1]
        //Time complexity required for adding one ele is big O of 1 O(1);
        list1.add(1);
        System.out.println(list1);//[1, 2, 3, -1, 1]
        //Order is same as u add in arraylst.
        //Duplicates can be put in it.
        

        ArrayList<String> list2 = new ArrayList<String>();
        list2.add("Vibhu");//Double quotes are strictly needed.
        list2.add(" ");
        list2.add("Dixit");
        System.out.println(list2);
    }
}
