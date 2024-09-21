public class Que2 {
   public static void main(String[] args) {
    // Here we have to only shift the last ele to first
    int[] arr = {2,4,5,7,3};
    Insert_Element(arr,arr.length-1);
    for(int z=0;z<arr.length;z++){
        System.out.print(arr[z]+" ");
    }
   }
   public static void Insert_Element(int arr[],int i){
    int j = i - 1;
    int item = arr[i];
    while(j>=0 && arr[j] > item){
        arr[j+1] = arr[j];
        j--;
    }
    arr[j+1] = item;
   } 
}
