import java.util.Arrays;

public class CountFreqOfArrayEle {
    public static void main(String[] args) {
        int arr[] = { 1, 3, 3, 4, 4, 5, 1};
        Arrays.sort(arr);
        count(arr);
    }
    private static void count(int[] arr){
        boolean visited[] = new boolean[arr.length];
        Arrays.fill(visited, false);
        for(int i=0;i<arr.length;i++){
            if (visited[i] == true)
            continue;
            int flag = 1;
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    visited[j] = true;
                    flag++;
                }
            }
            System.out.println(arr[i]+" "+flag);
        }
    }
}