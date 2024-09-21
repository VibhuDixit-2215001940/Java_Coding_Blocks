import java.util.*;
public class Heap {
    private ArrayList<Integer> ll=new ArrayList<>();
    public void add(int item){
        ll.add(item);
        upheapify(ll.size()-1);
    }
    private void upheapify(int ci){
        
    }
}