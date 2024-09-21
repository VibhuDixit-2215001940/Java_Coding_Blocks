import java.util.Scanner;

public class OddEenBackInDelhi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0;i<t;i++){
            int x = sc.nextInt();
            oddEven(x);
        }
    }
    public static void oddEven(int x){
        int tmp = x,dgt;
        while(x> 0){
            x= x/10;
        }
        int sum = 0;
        while(tmp> 0){
            dgt=tmp % 10;
            if(dgt%2!=0){
                sum += dgt;
            }
            tmp = tmp/10;
        }
        if(sum%3==0){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
