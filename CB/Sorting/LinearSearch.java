public class LinearSearch{
    public static void main(String[] args) {
        // Linear Search in Java
        // Linear search is used to search a key element from multiple elements. Linear search is less used today because it is    slower than binary search and hashing.

        // Algorithm:
        // Step 1: Traverse the array
        // Step 2: Match the key element with array element
        // Step 3: If key element is found, return the index position of the array element
        // Step 4: If key element is not found, return -1
        int[] arr = {1,2,3,4,5,6};
        int key = 4;
        System.out.println(linearSearch(arr,key));
        
    }
    public static int linearSearch(int arr[],int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                return i;
            }
        }
        return -1;
    }
}