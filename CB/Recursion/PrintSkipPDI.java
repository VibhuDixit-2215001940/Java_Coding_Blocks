public class PrintSkipPDI {
    public static void main(String[] args) {
        int n= 5;
        PID(n);
    }
    public static void PID(int n){
        if(n==0){
            return ;
        }
        if(n%2==1){
            System.out.println(n);
        }
        PID(n-1);
        if(n%2!=1){
            System.out.println(n);
        }
    }
}
