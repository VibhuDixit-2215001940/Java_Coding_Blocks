public class FirstIndex {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int i = 0;int data=6;
        System.out.println(firstIndex(arr,i,data));
    }
    public static int firstIndex(int[] arr,int i,int data){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==data){
            return i;
        }
        else{
            int restAns = firstIndex(arr, i+1, data);
            return restAns;
        }
    }
}
