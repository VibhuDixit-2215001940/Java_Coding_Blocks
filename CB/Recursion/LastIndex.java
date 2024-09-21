public class LastIndex {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,2,6};
        int i = 0;int data=2;
        System.out.println(lastIndex(arr,i,data));
    }
    public static int lastIndex(int[] arr,int i,int data){
        if(i==arr.length){
            return -1;
        }
        int index = lastIndex(arr, i+1, data);
        if(index==-1){
            if(arr[i]==data){
                return i;
            }
            else{
                return -1;
            }
        }
        return index;
    }
}
