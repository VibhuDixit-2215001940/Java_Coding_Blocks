import java.util.*;
public class K_smallest {
    public static  int left_child(int x){
        return x*2 + 1;
    }
    public static  int right_child(int x){
        return x*2 + 2;
    }
    public static  int parent(int x){
        return (int) Math.floor((x-1)/2);
    }
    public static void swap(ArrayList<Integer> heap, int i, int j){
        int temp = heap.get(j);
        heap.set(j, heap.get(i));
        heap.set(i, temp);
    }
    public static void insert(ArrayList<Integer> heap, int x){
        heap.add(x);
        int index = heap.size()-1;
        int parent = parent(index);
        while(parent>=0 && heap.get(parent) < heap.get(index)){
            swap(heap, parent, index);
            parent = parent(parent);
        }
    }
    public static int poll(ArrayList<Integer> heap){
        int n = heap.get(0);
        int x = heap.get(heap.size()-1);
        heap.remove(heap.size()-1);
        heap.set(0, x);
        heapify_max(heap, 0, heap.size());
        return n;
    }
    public static int peak(ArrayList<Integer> heap){
        return heap.get(0);
    }

    public static void heapify_max(ArrayList<Integer> heap, int i, int size){
        int largest = i;
        int left = left_child(i);
        int right = right_child(i);
        if(left<size && heap.get(left) > heap.get(largest)){
            largest = left;
        }
        if(right<size&& heap.get(right) > heap.get(largest)){
            largest = right;
        }
        if(largest != i){
            int temp = heap.get(largest);
            heap.set(largest, heap.get(i));
            heap.set(i, temp);
            heapify_max(heap, largest, size);
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        ArrayList<Integer> pq = new ArrayList<>();
        int a[] = new int[n];
        if(n==0){
            System.out.println(0);
            return;
        }
        if(k>n)k=n;
        for (int i = 0; i < n; i++) a[i] = in.nextInt();
        for (int i = 0; i < k; i++) insert(pq,a[i]);
        for (int i = k; i < a.length; i++) {
            if(peak(pq) > a[i]){
                poll(pq);
                insert(pq, a[i]);
            }
        }
        System.out.println(peak(pq));
    }

}