import java.util.Arrays;

public class AggressiveCows_ok {
    public static void main(String[] args) {
        int[] stall = {1,2,8,4,9};
        int noc = 3;
        Arrays.sort(stall);
        System.out.println(largest_Distance(stall,noc));
    }
    public static int largest_Distance(int[] stall,int noc){
        int low = stall[0];
        int high = stall[stall.length-1];
        int ans = 0;
        while(low<=high){
            int mid = (low+high)/2;
            if(isitpossible(stall,noc,mid)){
                ans = mid;
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return ans;
    }
    public static boolean isitpossible(int[] stall,int noc,int mid){
        int pos = stall[0];
        int c = 1;
        for(int i=1;i<stall.length;i++){
            if(stall[i]-pos>=mid){
                c++;
                pos=stall[i];
            }
            if(c==noc){
                return true;
            }
        }
        return false;
    }
}
