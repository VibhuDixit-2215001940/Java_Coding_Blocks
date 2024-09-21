public class PairWithGivenSum {
    public static void main(String[] args) {
        int[] arr = {11, 15, 26, 38, 9, 10};
        int x = 45;
        System.out.println(pairSum(arr,x));
    }
    public static boolean pairSum(int[] arr,int x){
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr.length;j++){
                if(arr[i]+arr[j]==x){
                    return true;
                }
            }
        }
        return false;
    }
}
