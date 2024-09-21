//BUBBLE SORT
public class Bubble {
    public static void main(String[] args) {
        // Wahi data sabse pahale nikalega jiski value sabse jada hogi
        // Wahi water bubble sabse pahale nikalega jisme air jada air hogi
        // Thus it is named as bubble sort

        // Here we check first element with the adjascent ele
        // Here we sort big no.

        int[] arr = {3,5,4,2,1};
        Sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void Sort(int[] arr){
        for(int turn=1;turn<arr.length;turn++){         //The loop will run length-1;
            for(int i=0;i<arr.length-turn;i++){
                if(arr[i]>arr[i+1]){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
        }
    }
}
