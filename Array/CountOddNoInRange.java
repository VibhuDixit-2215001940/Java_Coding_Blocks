import java.util.Scanner;

public class CountOddNoInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lo = sc.nextInt();
        int hi = sc.nextInt();
        System.out.println(countOdds(lo,hi));
    }
    public static int countOdds(int low, int high) {
        int count = 0;
        for(int i=low;i<=high;i++){
            if(i%2!=0){
                count++;
            }
        }
        return count;
    }
}
