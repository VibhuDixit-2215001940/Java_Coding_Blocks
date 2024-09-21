public class Que1 {
    public static void main(String[] args) {
        // Here we assume that given range index itself is the min value
        int[] arr = {2,4,5,1,7,3};
        int k = 1;
        System.out.println(Min_Value_Index(arr, 1));
    }
    public static int Min_Value_Index(int[] arr,int i){
        int min = i;
        for(int j=i+1;j<arr.length;j++){         //The loop will run length-1;
            if(arr[j]<arr[min]){
                min = j;
            }
        }
        return min;
    }
}
