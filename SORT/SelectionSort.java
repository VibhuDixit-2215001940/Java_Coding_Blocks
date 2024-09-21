//SELECTION SORT
public class SelectionSort {
    public static void main(String[] args) {
        // Isme poore array mai jo sabse chota data hai usse dhondhkar aange le aana hai

        int[] arr = {3,7,1,8,4,5};
        Sorting(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static void Sorting(int[] arr){
        for(int i=0;i<arr.length;i++){
            int idx = Min_Value_Index(arr,i);
            int temp = arr[i];
            arr[i] = arr[idx];
            arr[idx] = temp;
        }
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
