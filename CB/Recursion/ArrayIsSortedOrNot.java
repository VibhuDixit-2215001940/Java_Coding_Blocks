public class ArrayIsSortedOrNot {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int i = 0;
        System.out.println(isSorted(arr,i));
    }
    public static boolean isSorted(int[] arr,int i){
        if(i==arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
        else{
            boolean ans = isSorted(arr,i+1);
            return ans;
        }
    }
}
