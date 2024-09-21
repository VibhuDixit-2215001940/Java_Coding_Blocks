import java.util.Arrays;
import java.util.Scanner;

public class RemoveEvenInteFromArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int count = 0;
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
            if(arr[i]%2!=0){
                count++;
            }
        }
        int[] odd = new int[count];
        for(int i=0;i<count;i++){
            if(arr[i]%2!=0){
               odd[i] = arr[i]; 
            }
        }
        System.out.println(Arrays.toString(odd));
    }
}
