public class PrintReverseThenIncrease {
    public static void main(String[] args) {
        int n= 5;
        PID(n);
    }
    public static void PID(int n){
        if(n==0){
            return ;
        }
        System.out.println(n);
        PID(n-1);
        System.out.println(n);
    }
}
