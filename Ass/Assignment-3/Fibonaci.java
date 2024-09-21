public class Fibonaci{
    public static void main(String[] args) {
        int a = 0,b = 1,n=5,c=0;
        for(int i=1;i<=n;i++){
            System.out.println(a);
            c = b;
            b = a+b;
            a = c;
        }
       
    }
}