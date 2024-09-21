import java.util.ArrayList;
public class MultiDimensionalArrayList {
    public static void main(String[] args) {
        //Multidimensional Collections (or Nested Collections) is a collection of groups of objects where each group can have any number of objects dynamically.
        // Hence, here we can store any number of elements in a group whenever we want.

        //Syntax: Multidimensional Collections
        // ArrayList<ArrayList<Object>> a = new ArrayList<ArrayList<Object>>();

        // Illustration: 
        // Multidimensional ArrayList: [[3, 4], [12, 13, 14, 15], [22, 23, 24], [33]]

        ArrayList<ArrayList<Integer>> mainlist = new ArrayList<ArrayList<Integer>>();

        ArrayList<Integer> list1 = new ArrayList<Integer>();
        list1.add(1);list1.add(2);
        mainlist.add(list1);

        ArrayList<Integer> list2 = new ArrayList<Integer>();
        list2.add(3);list2.add(4);
        mainlist.add(list2);
        System.out.println(mainlist);//[[1, 2], [3, 4]]
    }
}