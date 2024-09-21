import java.util.Arrays;
import java.util.HashSet;

public class Second {
    public static void main(String[] args) {
        int[] arr = {7, 8, 8, 1, 4 ,3 };
        System.out.println(findSecondLargest(2,arr));
    }
    public static int findSecondLargest(int n, int[] arr) {
        HashSet<Integer> ok = new HashSet<>();
		for(int i=0;i<arr.length;i++){
            ok.add(arr[i]);
		}
        int[] off = ok.stream().mapToInt(Integer::intValue).toArray();
        Arrays.sort(off);
        // System.out.println(Arrays.toString(off));
        if(off.length>2){
            return off[off.length-2];
        }
        else{
            return -1;
        }
	}
}
