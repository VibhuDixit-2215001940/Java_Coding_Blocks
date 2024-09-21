import java.util.ArrayList;
import java.util.Arrays;

public class Min {
    public static void main(String[] args) {
        int[] nums = {2,3,3,2,2,4,2,3,4};
        System.out.println("ANS     "+minOperations(nums));
    }
    public static int minOperations(int[] arr) {
        ArrayList<Integer> ok = new ArrayList<>();
        Arrays.sort(arr);
        int flag = 0;
        for(int i=0;i<arr.length;i++){
            int count = 0;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            ok.add(count+1); 
        }
        ok.remove(ok.size()-1);
        System.out.println(ok);
        for(int i=0;i<ok.size();i++){
            int temp = ok.get(i);
            if(temp==2 || temp==3){
                flag++;
            }
            else if(temp>3){
                flag += temp%3 + 1;
            }
            else{
                return -1;
            }
        }
        return flag;
    }
}