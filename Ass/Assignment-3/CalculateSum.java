import java.util.Scanner;

public class CalculateSum {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int[] arrr=new int[num];
        for(int i=0;i<num;i++){
            arrr[i]=sc.nextInt();
        }
        int testcases=sc.nextInt();
        while (testcases>0){
            int operations=sc.nextInt();
            int[] arrr2=new int[num];
            for (int i=0;i<num;i++){
                arrr2[i]=arrr[i]+arrr[(i-operations+num)%num];
            }
            arrr=arrr2;
            testcases--;
        }
        long sum=0;
        for(int i=0;i<num;i++){
            sum=(sum+arrr[i])%(1000000007);
        }
        System.out.println(sum);
    }
}
