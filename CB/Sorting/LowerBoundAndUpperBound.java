public class LowerBoundAndUpperBound {
    public static void main(String[] args) {
        int[] arr = {1,2,3,3,4};
        System.out.println(lowerBound(arr,2));//1
        System.out.println(upperBound(arr,2));//1

        System.out.println(lowerBound(arr,3));//2
        System.out.println(upperBound(arr,3));//3

    }
    private static int lowerBound(int[] arr,int data){
        int lo=0,hi=arr.length-1;
        int ans = 1;
        while(lo<=hi){
            int mid = (lo+hi)/2;
            if(arr[mid]==data){
                ans = mid;
                hi = mid - 1;
            }
            else if(data<arr[mid]){
                hi = mid-1;
            }
            else{
                lo = mid+1;
            }
        }
        return ans;
    }
    private static int upperBound(int[] arr,int data){
        int lo=0,hi=arr.length-1;
        int ans = 1;
        while(lo<=hi){
            int mid = (lo+hi)/2;
            if(arr[mid]==data){
                ans = mid;
                lo = mid+1;
            }
            else if(data<arr[mid]){
                hi = mid-1;
            }
            else{
                lo = mid+1;
            }
        }
        return ans;
    }
}
