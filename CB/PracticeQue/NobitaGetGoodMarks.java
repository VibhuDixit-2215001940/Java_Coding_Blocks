import java.util.Scanner;

public class NobitaGetGoodMarks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0;i<t;i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            System.out.println(candiesWantReturn(x,y,t));
        }
    }
    public static int candiesWantReturn(int x,int y,int t){
        if(x>=(y*t)){
            return x-(y*t);
        }
        else{
            return (y*t)-x;
        }
    }
}
