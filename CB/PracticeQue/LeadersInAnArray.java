import java.util.Scanner;

public class LeadersInAnArray {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] arr = new int[t];
        for(int i=0;i<t;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<t;i++){
            int count = 0;
            for(int j=0;j<t-1;j++){
                if(arr[i]>arr[j+1]){
                    count++;
                }
            }
            if(count==(t-i)){
                System.out.print(arr[i]+" ");
            }
        }
        System.out.print(arr[t-1]);
    }
}
