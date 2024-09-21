import java.util.Arrays;

public class BubbleSort{
    public static void main(String[] args) {
        //Large elements come to the end of array by swapping with adjacent elements
        //Every turn will give tha large no at last
        int[] arr = {5,4,1,3,2};
        for(int turn=0;turn<arr.length-1;turn++){
            for(int j=0;j<arr.length-1-turn;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));//[1, 2, 3, 4, 5]
    }
}