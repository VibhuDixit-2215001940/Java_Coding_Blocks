public class BinarySearch {
    public static void main(String[] args) {
        //Binary Search in Java
        // Binary search is used to search a key element from multiple elements. Binary search is faster than linear search.
        // In case of binary search, array elements must be in ascending order. If you have unsorted array, you can sort the array      using Arrays.sort(arr) method.
        //Searching time reduced to log2(n).
        int[] arr = {1,2,3,4,5,6};
        int key = 3;
        System.out.println(binarySearch(arr,key));
        
    }
    public static int binarySearch(int[] arr,int key){
        int lo = 0;
        int hi = arr.length-1;
        while(lo<=hi){
            int mid = (lo+hi)/2;
            if(mid<key){
                lo = mid+1;
            }
            else if(mid > key){
                hi = mid - 1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
