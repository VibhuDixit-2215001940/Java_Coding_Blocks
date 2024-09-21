public class FirstIndexOfEle {
    public static void main(String[] args) {
        int[] arr = {2,3,7,4,8,3};
        int item = 9;
        System.out.println(find(arr,0,item));
    }
    public static int find(int[] arr, int idx, int target) {
        if(arr.length==idx) return -1;
        if(arr[idx]==target) return idx;
        return find(arr,idx+1,target);
    }
}
