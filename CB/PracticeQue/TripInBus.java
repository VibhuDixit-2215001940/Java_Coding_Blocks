import java.util.Scanner;

public class TripInBus {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int time = sc.nextInt();
        sc.close();
        int count = 0;
        for(int i=0;i<n;i++){
            for(int t=0;t<n;t++){
                if((t+1)>=arr[t]){
                    count++;
                    System.out.println(count);
                }
            }
            if(count==time){
                System.out.println(i);
            }
        }
    }
}
