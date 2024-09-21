import java.util.Scanner;

public class MazePathD {
    static int count = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        ok(r,c,"");
        System.out.println();
        System.out.println(count);
    }
    public static void ok(int r,int c,String str){
        if(r==1 && c==1){
            System.out.print(str+" ");
            count++;
            return ;
        }
        if(r>1){
            ok(r-1, c, str+"V");
        }
        if(c>1){
            ok(r, c-1, str+"H");
        }
        if(r>1 && c>1){
            ok(r-1, c-1, str+"D");
        }
    }
}
